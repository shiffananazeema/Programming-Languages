from rest_framework import serializers
from . models import course,module

class courseSerializer(serializers.HyperlinkedModelSerializer):
    
    class Meta:
        model = course
        fields = ('course_name','course_title','module_set')
        
class moduleSerializer(serializers.HyperlinkedModelSerializer):
    
    class Meta:
        model = module
        fields = ('module_name','course')
        