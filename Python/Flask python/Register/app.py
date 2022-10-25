from flask import *
app = Flask(__name__)

@app.route('/')
@app.route('/register')
def homepage():
  return render_template('register.html')

@app.route('/confirm',methods=['POST','GET']) 
def register():
    if request.method == 'POST':
      n = request.form.get('name') 
      u = request.form.get('num') 
      return render_template('confirm.html',name = n, num = u)

if __name__ == "__main__":
  app.run(debug=True)