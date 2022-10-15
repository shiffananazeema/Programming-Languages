from flask import Flask, request, flash, url_for, redirect, render_template  
from flask_sqlalchemy import SQLAlchemy  
  
app = Flask(__name__)  
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///employees.sqlite3'  
app.config['SECRET_KEY'] = "secret key"  
  
db = SQLAlchemy(app)  
  
class Students(db.Model):  
   id = db.Column('student_id', db.Integer, primary_key = True)  
   name = db.Column(db.String(30))  
   rollno = db.Column(db.String(15))  
   age = db.Column(db.String(10))   
   depart = db.Column(db.String(20))  
  
   def __init__(self, name, rollno, age,depart):  
      self.name = name  
      self.rollno = rollno  
      self.age = age  
      self.depart = depart  
 
@app.route('/')  
def list_students():  
   return render_template('list_students.html', Students = Students.query.all() )  
 
@app.route('/search', methods=['GET', 'POST'])
def search():
   if request.method == 'POST':
      form = request.form
      search_value = form['search_string']
      search = "%{0}%".format(search_value)
      results = Students.query.filter(Students.rollno.like(search)).all()
      return render_template('list_students.html', student=results, legend="Search Results")
   else:
      return redirect('/')

@app.route('/add', methods = ['GET', 'POST'])  
def addStudent():  
   if request.method == 'POST':  
      if not request.form['name'] or not request.form['rollno'] or not request.form['age']:  
         flash('Please enter all the fields', 'error')  
      else:  
         student = Students(request.form['name'], request.form['rollno'],  
            request.form['age'], request.form['depart'])  
           
         db.session.add(student)  
         db.session.commit()  
         flash('Record was successfully added')  
         return redirect(url_for('list_students'))  
   return render_template('add.html')  
  
@app.route('/delete/<int:id>')
def erase(id):
     
    # deletes the data on the basis of unique id and
    # directs to home page
    data = Students.query.get(id)
    db.session.delete(data)
    db.session.commit()
    return redirect('/')

if __name__ == '__main__':  
   db.create_all()  
   app.run(debug = True)  