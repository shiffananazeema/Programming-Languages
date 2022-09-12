'''
Flask - Flask is a web application framework written in python

- Flask is an open source micro-framework for python. It does not require particular
tools or libraries. It has no database abstraction layer, form validation, or any other
components.

- Applications that use the Flask framework include Pinterest and LinkedIn.

Flask has large community for learners and collaborators overall and it was also open source.

Web Application Framework or simply Web Framework represents a collection of libraries and modules 
 that enables a web application developer to write applications without having to bother about low-level 
  details such as protocols, thread management etc.     

- The microframework Flask is based on the Pocoo projects.
 * Web Server Gateway Interface (WSGI)
 * Jinja Template Engine

WSGI
Web Server Gateway Interface (WSGI) has been adopted as a standard for Python web application development. 
 WSGI is a specification for a universal interface between the web server and the web applications.

Werkzeug
It is a WSGI toolkit, which implements requests, response objects, and other utility functions. 
 This enables building a web framework on top of it. The Flask framework uses Werkzeug as one of its bases.

Jinja2
Jinja2 is a popular templating engine for Python. A web templating system combines a template with a certain 
  data source to render dynamic web pages.

Flask is often referred to as a micro framework. It aims to keep the core of an application simple yet extensible. 
Flask does not have built-in abstraction layer for database handling, nor does it have form a validation support. 
Instead, Flask supports the extensions to add such functionality to the application. 

- Advantages
  * Easy to code
  * Easy to configure
  * Has an excellent documentation

- History
 * Initial Release 1st April 2010.
 * Flask was created by Armin Ronacher of Pocoo, an international group of Python
 enthusiasts formed in 2004.


'''

from flask import Flask
app = Flask(__name__)

@app.route('/')
@app.route('/home')
def home():
  return "Home Page"

if __name__ == "__main__":
  app.run(debug=True)











'''
# Importing flask module in the project is mandatory
# An object of Flask class is our WSGI application.
from flask import Flask
  
# Flask constructor takes the name of 
# current module (__name__) as argument.
app = Flask(__name__)
  
# The route() function of the Flask class is a decorator, 
# which tells the application which URL should call 
# the associated function.
@app.route('/')
# '/' URL is bound with hello_world() function.
def hello_world():
    return 'Hello World'
  
# main driver function
if __name__ == '__main__':
  
    # run() method of Flask class runs the application 
    # on the local development server.
    app.run()
'''
