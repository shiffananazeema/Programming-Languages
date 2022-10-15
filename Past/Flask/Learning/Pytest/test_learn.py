"""
  Unit-Testing
  ````````````
  Unit Testing is a software testing method by which individual units 
of source code are tested to determine whether they are fit for use.

  Why Unit Test?
  ``````````````
 - Test Reduce Bugs in New Features and Existing Features
 - Tests are good Documentation
 - Tests Reduce the Cost of Change
 - Faster Debugging
 - Faster Development
 - Better Design
 
  Testing Frameworks
  ``````````````````
 - unittest - In the Python Standard Library.
 - nose - Not in the Standard Library. Simpler testes than unittest
 - pytest - Not in the Python Standard Library.(Most Popular)

"""


"""
    The pytest framework makes it easy to write small tests, yet scales 
to support complex funtional testing for applications and libraries
"""

"""
To test the pytest 
 (1) The file name should have test in it
For Example:
  learn.py -> test_learn.py / learn_test.py
  
  or
  
 (1) Create a py file & Create a test file and import
For Example:
  learn.py & test_learn.py [import learn] 

 (2) To Compile we should type the pytest
For Example:
    python -m pytest
  (Or It Doesn't test)
  
   or
    
Get into the folder which had the file with cd and type
    python -m pytest filename.py

To test only one in the file
    python -m pytest test_filename.py::test_name 
    
    (or)
    
    python -m pytest -v -k "add"
    
    python -m pytest -v -k "add or string"
    
    python -m pytest -v -k "add and string"
    
  - To only test the decoration function/ marked function
    python -m pytest -v -m number
  
  - To know the details about 
    python -m pytest -v
    
  - To Stop the test after first fail
    python -m pytest -v -x
    
  - To Stop after 1 failure
    python -m pytest -v --maxfail=1
    
  - To not show the test brace
    python -m pytest -v -x tb=no
    
  - To skip a test add decorator to the file
For example
  @pytest.mark.skip(reason="don't run number test")
    we can also use the skip if
  @pytest.mark.skipif(sys.version_info < (3, 3),reason="Blah")

  - To print the print statement
    python -m pytest -v -s
    (or)
    python -m pytest -v --capture=no
    
  - The quiet mode
    python -m pytest -q (only show minimum info)
"""
# Examples of pytest

# 1 Failed
''' 
def inc(x):
    return x + 1

def test_answer():
    assert inc(3) == 5
'''

# 1 Passed
'''
import pytest

def f():
    raise SystemExit(1)

def test_mytest():
    with pytest.raises(SystemExit):
        f()
'''

# 1 Failed , 1 Passed
'''
from re import X


class TestClass:
    def test_one(self):
        x = "this"
        assert "h" in x
        
    def test_two(self):
        x = "hello"
        assert hasattr(x, "check")
'''

# 2 Failed
'''
class TestClassDemoInstance:
    def test_one(self):
        assert 0
        
    def test_two(self):
        assert 0
'''
"""
The List of available characters that can be used:
f - failed
E - error
s - skipped
x - xfailed
X - xpassed
p - passed
P - passed with output

Special characters for (de)selection of groups:
a - all except pP
A - all
N - none, this can be used to display nothing (since fE is the default)        
"""
'''
#  1 failed, 1 passed, 1 skipped, 1 xfailed, 1 xpassed, 1 error
import pytest

@pytest.fixture
def error_fixture():
    assert 0

def test_ok():
    print("ok")

def test_fail():
    assert 0

def test_error(error_fixture):
    pass

def test_skip():
    pytest.skip("skipping this test")

def test_xfail():
    pytest.xfail("xfailing this test")

@pytest.mark.xfail(reason="always xfail")
def test_xpass():
    pass
'''

