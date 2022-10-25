''' - 1
import program
import pytest

@pytest.mark.number
def test_add():
    assert program.add(7, 3) == 10
    assert program.add(7) == 9
    assert program.add(5) == 7
    print(program.add(7, 3), '----------------')

@pytest.mark.number   
def test_product():
    assert program.product(5, 5) == 25
    assert program.product(5) == 10
    assert program.product(7) == 14

@pytest.mark.strings   
def test_add_strings():
    result = program.add('Hello ', 'World')
    assert result == 'Hello World'
    assert type(result) is str
    assert 'Heldlo' not in result
 
@pytest.mark.strings
def test_product_strings():
    assert program.product('Hello ', 3) == 'Hello Hello Hello '
    result = program.product('Hello ')
    assert result == 'Hello Hello '
    assert type(result) is str
    assert 'Hello' in result
'''

''' - 2
import program
import pytest

def test_add():
    assert program.add(7, 3) == 10
    result = program.add('Hello', ' World')
    assert result == 'Hello World'
    result = program.add(10.5, 25.5)
    assert result == 36
    
    (or)
    
import program
import pytest

@pytest.mark.parametrize('x, y, z', 
        [(7, 3, 10), 
         ('Hello', ' World', 'Hello World'),
         (10.5, 25.5, 36)])

def test_add(x, y, z):
    assert program.add(x, y) == z
  
'''  
    
    
''' - 3
from program import StudentDB
import pytest
db = None

def setup_module(module):
    print('-----------setup----------')
    global db
    db = StudentDB()
    db.connect('data.json')
    
def teardown_module(module):
    print('-----------teardown----------')
    db.close()
    

def test_scott_data():
    db = StudentDB()
    db.connect('data.json')
    scott_data = db.get_data('Scott')
    assert scott_data['id'] == 1
    assert scott_data['name'] == 'Scott'
    assert scott_data['result'] == 'pass'
    
def test_mark_data():
    db = StudentDB()
    db.connect('data.json')
    mark_data = db.get_data('Mark')
    assert mark_data['id'] == 2
    assert mark_data['name'] == 'Mark'
    assert mark_data['result'] == 'fail'
    
'''
from program import StudentDB
import pytest

@pytest.fixture(scope='module')
def db():
    print('-----------setup----------')
    db = StudentDB()
    db.connect('data.json')
    return db
    
#def teardown_module(module):
#    print('-----------teardown----------')
#    db.close()
    

def test_scott_data(db):
    db = StudentDB()
    db.connect('data.json')
    scott_data = db.get_data('Scott')
    assert scott_data['id'] == 1
    assert scott_data['name'] == 'Scott'
    assert scott_data['result'] == 'pass'
    
def test_mark_data(db):
    db = StudentDB()
    db.connect('data.json')
    mark_data = db.get_data('Mark')
    assert mark_data['id'] == 2
    assert mark_data['name'] == 'Mark'
    assert mark_data['result'] == 'fail'