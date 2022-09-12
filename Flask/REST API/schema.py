from flask_marshmallow import Marshmallow

ma = Marshmallow()

class DataSchema(ma.Schema):
    class Meta:
        fields = (
            'id',
            'name',
            'type',
            'age',
            'description',
            'date',
            'status'
        )