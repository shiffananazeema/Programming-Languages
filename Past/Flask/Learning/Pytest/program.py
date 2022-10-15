''' - 1
def add(x, y = 2):
    return x + y

def product(x, y = 2):
    return x * y
'''

''' - 2
def add(x, y):
    return x + y
'''

''' - 3

'''
import json

class StudentDB:
    def __init__(self):
        self.__data = None
        
    def connect(self, data_file):
        with open(data_file) as json_file:
            self.__data = json.load(json_file)
            
    def get_data(self,name):
        for student in self.__data['students']:
            if student['name'] == name:
                return student
            
    def close(self):
        pass