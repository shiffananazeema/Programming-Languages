from flask import Flask, render_template, request, redirect, url_for, flash
from flask_sqlalchemy import SQLAlchemy


app = Flask(__name__)
app.secret_key = "Secret Key"

app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql://root:''@localhost/hyper'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

db = SQLAlchemy(app)

class Data(db.Model):
    id = db.Column(db.Integer, primary_key = True)
    name = db.Column(db.String(100))
    type = db.Column(db.String(100))
    age = db.Column(db.Integer)
    description = db.Column(db.String(500))
    date = db.Column(db.DateTime)
    status = db.Column(db.Boolean, default=0)


    def __init__(self, name, type, age, description, date):
        self.name =  name
        self.type =  type
        self.age =  age
        self.description =  description
        self.date =  date
        

@app.route('/')
def Index():
    all_data = Data.query.all()
    return render_template("index.html", model = all_data)


@app.route('/insert', methods = ['POST'])
def insert():

    if request.method == 'POST':
        
        name = request.form['name']
        type = request.form['type']
        age = request.form['age']
        description = request.form['description']
        date = request.form['date']
       

        my_data  = Data(name, type, age, description, date)
        db.session.add(my_data)
        db.session.commit()

        flash("Inserted Sucessfully")

        return redirect(url_for('Index'))


@app.route('/update', methods=['GET', 'POST'])
def update():
    try:
        localstatus = request.form['status']
        localstatus = 1
    except:
        localstatus = 0
    if request.method == 'POST':
        my_data = Data.query.get(request.form.get('id'))
        my_data.name = request.form['name']
        my_data.type = request.form['type']
        my_data.age = request.form['age']
        my_data.description = request.form['description']
        my_data.date = request.form['date']
        my_data.status = localstatus
        db.session.commit()
        flash("Updated Sucessfully")
        return redirect(url_for('Index'))

@app.route('/delete/<id>', methods = ['GET' ,'POST'])
def delete(id):
    my_data = Data.query.get(id)
    db.session.delete(my_data)
    db.session.commit()
    flash("Deleted Sucessfully")

    return redirect(url_for('Index'))


if __name__== "__main__":
    app.run(debug=True)