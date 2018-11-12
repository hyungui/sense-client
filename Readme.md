# Cochlear.ai Sense (beta version)

## Getting Started

**Cochlear.ai** offers audio cognition systems as a service. Our cloud API service *Cochlear.ai Sense* enables developers to analyze audio contents by extracting non-verbal information. It is based on gRPC framework and python, java, node.js are supported in beta version.

If you need any help or support, please do not hesitate to send us an email at support@cochlear.ai.

Please send us the audio samples that are not working properly with our API and tell us any issues you face during the development. It would be greatly appreciated. Thank you for your participation!



### Available tasks

- File input methods

> 1. 'speech_detector' (speech activity detection)
> 2. 'music_detector' (music activity detection)
> 3. 'age_gender' (age and gender detection)
> 4. 'music_genre' (music genre detection)
> 5. 'music_mood' (music mood estimation)
> 6. 'music_tempo' (music tempo detection)
> 7. 'music_key' (music key detection)
> 8. 'event' (audio event detection)


- Streaming input methods

> 9. 'speech_detector_stream' (speech activity detection)
> 10. 'music_detector_stream' (music activity detection)
> 11. 'age_gender_stream' (age and gender detection)
> 12. 'music_genre_stream' (music genre detection)
> 13. 'music_mood_stream' (music mood estimation)
> 14. 'event_stream' (audio event detection)


For 'event' and 'event_stream', the following subtasks are available.

> 'babycry', 'carhorn', 'cough', 'dogbark', 'glassbreak', 'siren', 'snoring'

In other cases, the subtask will be ignored.

***

## Key features of beta version

Our beta version API includes the following major updates compared to the alpha version.

- Improved latency
- Streaming input support
- Example client codes of other languages (Java, Node.js)
- Additional funcionalities
    - Speech and music activity detection
    - Age and gender detection
- Additional sound event class (glassbreak)
- Improved performance

***

## Quick Tutorial

In this short tutorial, we introduce *Cochlear.ai Sense* API and go through the process of analyzing your first audio content.



### Step 1. Get your Free API key
Every API access is managed with API key. If you are a first time user, visit http://cochlear.ai/beta-subscription/ to get your free API key.

All API keys are limited to 700 audio files and 10 minute audio streams per method per day.


> Daily Quota : 700 calls per method (audio file) / 10 minutes per method (audio stream)



### Step 2. Clone this repository
This repository contains the libraries required to utilize *Cochlear.ai Sense* API. Copy the code below or manually download to use.
```
$ git clone https://github.com/cochlearai/sense-client
```


### Step 3. Setup your environment (python)
This and the next steps assume the python 2.7 environment running on Ubuntu. If you are using java, please refer to the following documents:

(Java) https://github.com/cochlearai/sense-client/blob/master/JavaClient/Readme.md

The tutorial for node.js is soon to be updated.


- Install portaudio

This is required only for streaming methods.

```
$ apt install portaudio19-dev
```


- Install pip

Run the following codes.

```
$ wget https://bootstrap.pypa.io/get-pip.py
$ python get-pip.py
```

As an alternative, you can also use apt-get command

```
$ apt-get install python-pip
```

To install the dependencies presented below, pip version 10.0.1 or later is recommended.


- (Optional) Install virtualenv

If you want to setup the python environment on virtualenv, run the following codes.

```
$ pip install virtualenv
$ virtualenv venv 
$ source venv/bin/activate
```

You can verify whether the virtual environment is successfully activated with the prefix *(venv)* in the terminal window.


- Install python libraries

Run the following codes.

```
$ pip install --upgrade pip
$ pip install --no-cache-dir -r requirements.txt
```


### Step 4. Making your gRPC call (python)

The predicted values are given in units of one second for all methods except for 'music_key' and 'music_tempo'. The size of the input audio file is recommended not to exceed 100MB.

Note that the type of the result is not determined by the input audio but by the method you call. For example, if you call a music analysis method with a speech data, the model will regard the input as a music signal and make predictions based on its knowledge about the music. Please be aware of the kind of the audio inputs you are using.

- Example codes

For the examples of the file input methods and the streaming methods, please refer to ./examples/example_file.py and ./examples/example_stream.py, respectively.

After inserting your API key to the example code, run the code below.

```
$ python ./examples/example_file.py
$ python ./examples/example_stream.py
```

- Input/output specifications

The prediction units of the *Cochlear.ai Sense* models as well as their output examples are described below. 
In the examples, we assume that the input is an audio file with a length of 5 seconds or an audio stream of 1 second.

##### 1. speech_detector
> * Prediction unit (file/stream): 1 second
> * Inter-prediction duration (file/stream): 0.5 seconds
> * Sample-rate (file): 16000Hz (recommended) or higher
> * Sample-rate (stream): 16000Hz
> * Output examples
```
(file)   {"result": [{"speech": [0.972, 0.995, 1.0, 0.994, 0.992, 0.948, 0.99, 0.904, 0.981]}]}
(stream) {"result": [{"speech": [0.972]}]}
```
##### 2. music_detector
> * Prediction unit (file/stream): 1 second
> * Inter-prediction duration (file/stream): 0.5 seconds
> * Sample-rate (file): 16000Hz (recommended) or higher
> * Sample-rate (stream): 16000Hz
> * Output examples
```
(file)   {"result": [{"music": [0.602, 0.789, 0.515, 0.866, 1.0, 1.0, 0.751, 0.281, 0.081]}]}
(stream) {"result": [{"music": [0.602]}]}
```
##### 3. age_gender
> * Prediction unit (file/stream): 1 second
> * Inter-prediction duration (file/stream): 0.5 seconds
> * Sample-rate (file): 16000Hz (recommended) or higher
> * Sample-rate (stream): 16000Hz
> * Output examples
```
(file)   {"result": [{"age/gender": "child", "probability": [0.173, 0.202, 0.336, 0.775, 0.997, 0.999, 0.981, 1.0, 1.0]}, 
                     {"age/gender": "male", "probability": [0.654, 0.461, 0.125, 0.051, 0.001, 0.0, 0.011, 0.0, 0.0]}, 
                     {"age/gender": "female", "probability": [0.173, 0.336, 0.539, 0.174, 0.002, 0.0, 0.008, 0.0, 0.0]}]}
(stream) {"result": [{"age/gender": "child", "probability": [0.173]}, 
                     {"age/gender": "male", "probability": [0.654]}, 
                     {"age/gender": "female", "probability": [0.173]}]}
```
##### 4. music_genre
> * Prediction unit (file): Entire audio
> * Prediction unit (stream): 3 seconds
> * Inter-prediction duration (file): N/A
> * Inter-prediction duration (stream): 0.5 seconds
> * Sample-rate (file): 22050Hz (recommended) or higher
> * Sample-rate (stream): 22050Hz
> * Output examples
```
(file)   {"result": [{"genre": ["Alternative", "Dance"], "probability": [0.443, 0.411]}]}
(stream) {"result": [{"genre": ["Alternative", "Dance"], "probability": [0.443, 0.411]}]}
```
##### 5. music_mood
> * Prediction unit (file): Entire audio
> * Prediction unit (stream): 3 seconds
> * Inter-prediction duration (file): N/A
> * Inter-prediction duration (stream): 0.5 seconds
> * Sample-rate (file): 22050Hz (recommended) or higher
> * Sample-rate (stream): 22050Hz
> * Output examples
```
(file)   {"result": [{"arousal": [0.536], "valence": [0.029]}]}
(stream) {"result": [{"arousal": [0.536], "valence": [0.029]}]}
```
##### 6. music_tempo

Note that the outputs denote the top-two tempo candidates in bpm and their corresponding probabilities.

> * Prediction unit (file): Entire audio
> * Inter-prediction duration (file): N/A
> * Sample-rate (file): 22050Hz or higher
> * Output examples
```
(file)   {"result": [{"tempo": [72.0, 36.0], "probability": [0.881, 0.119]}]}
(stream) N/A
```
##### 7. music_key

Note that the output denotes the top-one key candidate and its corresponding probability.

> * Prediction unit (file): Entire audio
> * Inter-prediction duration (file): N/A
> * Sample-rate (file): 22050Hz or higher
> * Output examples
```
(file)   {"result": [{"key": ["Gb"], "probability": [0.752]}]}
(stream) N/A
```
##### 8. event
> * Prediction unit (file/stream): 1 second
> * Inter-prediction duration (file/stream): 0.5 seconds
> * Sample-rate (file): 22050Hz (recommended) or higher
> * Sample-rate (stream): 22050Hz
> * Output examples
```
(file)   {"result": [{"event": "babycry", "probability": [0.999, 1.0, 0.531, 0.091, 0.486, 0.976, 1.0, 1.0, 0.848]}]}
(stream) {"result": [{"event": "babycry", "probability": [0.999]}]}
```

- Notes
  - Audio coming directly from microphone may return unstable results.
  - If the original sampling rate of your audio file does not match our requirement, use it as it is rather than resampling it by yourself.





