import pytest 
import requests

data = {
        "name": "Test",
        "type": "Human",
        "age": 20,
        "description": "Testing functionality"
    }

result = {
    "age": 25, 
    "checked": True, 
    "date": "2022-01-17T19:15:26.043274", 
    "description": "Good", 
    "id": 1, 
    "name": "Aleander", 
    "type": "Manager"
    }

update = {
        "name": "Sobin",
        "type": "CEO",
        "age":  26,
        "description": "Excellent",
        "checked": True
    }

def test_1_getall():
        resp = requests.get('http://127.0.0.1:5000/data')
        assert resp.status_code == 200
        assert len(resp.json()) == 4
       
'''
def test_2_post():
        resp = requests.post('http://127.0.0.1:5000/data', json=data)
        assert resp.status_code == 200
''' 

        
def test_3_get():
        resp = requests.get('http://127.0.0.1:5000/data/1')
        assert resp.status_code == 200
        assert resp.json() == result
        
'''
def test_4_delete():
        resp = requests.delete('http://127.0.0.1:5000/data/5')
        assert resp.status_code == 200
'''
def test_5_updata():
        resp = requests.put('http://127.0.0.1:5000/data/4', json=update)
        assert resp.json()['name'] == update['name']
        assert resp.json()['type'] == update['type']
        assert resp.json()['age'] == update['age']
        assert resp.json()['description'] == update['description']
        assert resp.json()['checked'] == update['checked']
        
