var grpc = require('grpc')


var fs = require('fs')
var path = require('path')
const Buffer = require('buffer').Buffer;

var PROTO_PATH = __dirname + '/proto/cochlear_sense.proto'
var cochlear_sense = grpc.load(PROTO_PATH).cochlear.ai

var obj = new Object


/**
 * Async code area 
 */

obj.SIZE_1MB = 1024*1024;
obj.chunksize = obj.SIZE_1MB;

function createInputAsync(buffer, ext, subtask){
    return {
        'data':buffer,
        'subtask':subtask,
        'apikey':obj.apiKey,
        'format':ext,
        'dtype':'',
        'sr':0
    }
}

syncgen_subkey = function(functname){
    return function(buffer, subtask, ext, callback){
        call = obj['client'][functname](callback);
        for(var i = 0; i < (buffer.length)/obj.chunksize; i++){
            call.write(createInputAsync(buffer.slice(i*obj.chunksize, i*obj.chunksize + obj.chunksize), ext, subtask))
        }
        call.end()
    }
}
syncgen = function(functname){
    return function(buffer, ext, callback){
        call = obj['client'][functname](callback);
        for(var i = 0; i < (buffer.length)/obj.chunksize; i++){
            call.write(createInputAsync(buffer.slice(i*obj.chunksize, i*obj.chunksize + obj.chunksize), ext))
        }
        call.end()
    }
}

obj['event'] = syncgen_subkey('event');
obj['ageGender'] = syncgen('ageGender');
obj['musicKey'] = syncgen('musicKey');
obj['musicTempo'] = syncgen('musicTempo');
obj['musicGenre'] = syncgen('musicGenre');
obj['musicDetector'] = syncgen('musicDetector');
obj['speechDetector'] = syncgen('speechDetector');


/**
 * Streaming Code area
 */

 

 /**
  *  Main area
  */

function __init__(apiKey, host){

    //Set api key
    obj.apiKey = apiKey;


    //Set host
    if(host)
        obj.host = host;
    else
        obj.host = 'beta.cochlear.ai:50051';

    
    obj.client = new cochlear_sense.cochlear_sense(obj.host,  grpc.credentials.createInsecure());    
    return obj;
}


module.exports = __init__;