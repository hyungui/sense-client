import os.path
import sys
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), os.path.pardir)))
from cochlearai.client.sense import sense_file

apikey = 'Your API-key here'

filename = 'baby-crying-01.mp3'
file_format = 'mp3'

task = 'event'
subtask = 'babycry'

result = sense_file(filename,apikey,file_format,task,subtask)

print result