import sys
import os.path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), os.path.pardir)))

from cochlearai.common import cochlear_sense_pb2
from cochlearai.common import cochlear_sense_pb2_grpc

from cochlearai.client.sense import SenseStreamer
from cochlearai.client.sense import sense_stream_request
from cochlearai.client.sense import sense_stream_response

apikey = 'Your API-key here'

task = 'speech_detector_stream'
subtask = 'cough'

with SenseStreamer(task) as stream:
    audio_generator = stream.generator()
    requests = sense_stream_request(audio_generator,apikey,task,subtask)
    responses = sense_stream_response(requests,task)
    for i in responses:
        print i.pred
