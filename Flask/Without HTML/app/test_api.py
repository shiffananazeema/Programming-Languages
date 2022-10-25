import unittest
import requests


class TestAPI(unittest.TestCase):
    URL = "http://127.0.0.1:5000/data"

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


    def test_1_getall(self):
        resp = requests.get(self.URL+'/')
        self.assertEqual(resp.status_code, 200)
        self.assertEqual(len(resp.json()) == 4)
        print("Test 1 Completed")

    def test_2_post(self):
        resp = requests.post(self.URL, json=self.data)
        self.assertEqual(resp.status_code, 200)
        print("Test 2 Completed")

    def test_3_get(self):
        resp = requests.get(self.URL+'/1')
        self.assertEqual(resp.status_code, 200)
        self.assertDictEqual(resp.json(), self.result)
        print("Test 3 Completed")

    def test_4_delete(self):
        resp = requests.delete(self.URL + '/4')
        self.assertEqual(resp.status_code, 200)
        print("Test 4 completed")

    def test_5_updata(self):
        resp = requests.put(self.URL + '/2', json=self.update)
        self.assertEqual(resp.json()['name'], self.update['name'])
        self.assertEqual(resp.json()['type'], self.update['type'])
        self.assertEqual(resp.json()['age'], self.update['age'])
        self.assertEqual(resp.json()['description'],
                         self.update['description'])
        self.assertEqual(resp.json()['checked'], self.update['checked'])
        print("Test 5 Completed")


if __name__ == "__main__":
    tester = TestAPI()
    tester.test_1_getall()
   # tester.test_2_post()
   # tester.test_3_get()
   # tester.test_4_delete()
   # tester.test_5_updata()
