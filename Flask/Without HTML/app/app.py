# import connexion
from flask import Flask, request, jsonify, make_response, render_template
from flask_sqlalchemy import SQLAlchemy
from flask_marshmallow import Marshmallow
from datetime import datetime
from flask_swagger_ui import get_swaggerui_blueprint
from flask_cors import CORS

'''
con_app = connexion.App("__name__",specification_dir='static/')
con_app.add_api('swagger.yml')
app = con_app.app
'''
app = Flask(__name__)
CORS(app)

app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///database.db"
app.config["SQLALCHEMY_TRACK_MODIFICATIONS"] = False

SWAGGER_URL = '/swagger'
API_URL = '/static/swagger.json'
SWAGGERUI_BLUEPRINT = get_swaggerui_blueprint(
    SWAGGER_URL,
    API_URL,
    config={
        'app_name': "Rest API"
    }
)
app.register_blueprint(SWAGGERUI_BLUEPRINT, url_prefix=SWAGGER_URL)


db = SQLAlchemy(app)
ma = Marshmallow(app)


class Data(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(200))
    type = db.Column(db.String(200))
    age = db.Column(db.Integer())
    description = db.Column(db.String(300), nullable=False)
    checked = db.Column(db.Boolean, nullable=False, default=False)
    date = db.Column(db.DateTime, nullable=False, default=datetime.utcnow)

    def __repr__(self):
        return self.id


class DataSchema(ma.Schema):
    class Meta:
        fields = ('id', 'name', 'checked', 'type',
                  'age', 'description', 'date')


data_schema = DataSchema(many=False)
datas_schema = DataSchema(many=True)

@app.route('/')
def Index():
    all_data = Data.query.all()
    return render_template("index.html", model = all_data)

@app.errorhandler(404)
def error_404(_error):
    return make_response(jsonify({'Error': 'Not found'}), 404)




@app.route("/data", methods=["POST"])
def add_data():
    try:
        name = request.json['name']
        type = request.json['type']
        age = request.json['age']
        description = request.json['description']

        new_data = Data(name=name, type=type, age=age, description=description)

        db.session.add(new_data)
        db.session.commit()

        return data_schema.jsonify(new_data)
    except Exception as e:
        return jsonify({"Error": "Invalid Request, please try again."})


@app.route("/data", methods=["GET"])
def get_all_data():
    datas = Data.query.all()
    result_set = datas_schema.dump(datas)
    return jsonify(result_set)


@app.route("/data/<int:id>", methods=["GET"])
def get_data(id):
    data = Data.query.get_or_404(int(id))
    return data_schema.jsonify(data)


@app.route("/data/<int:id>", methods=["PUT"])
def update_data(id):

    data = Data.query.get_or_404(int(id))

    name = request.json['name']
    type = request.json['type']
    age = request.json['age']
    description = request.json['description']
    checked = request.json['checked']

    data.name = name
    data.type = type
    data.age = age
    data.description = description
    data.checked = checked

    db.session.commit()

    return data_schema.jsonify(data)


@app.route("/data/<int:id>", methods=["DELETE"])
def delete_data(id):
    data = Data.query.get_or_404(int(id))
    db.session.delete(data)
    db.session.commit()
    return jsonify({"Sucess": "Data Deleted"})


if __name__ == "__main__":
    app.run(debug=True)
