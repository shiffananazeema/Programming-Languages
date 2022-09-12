from rest_framework import serializers
from . models import user,course,section,user_roles,enrollment
from . models import course_section,module,section_module,part
from . models import module_part,training_data

class userSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = user
        fields = ('id','user_name')
    
class courseSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = course
        fields = ('id','course_title')

class sectionSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = section
        fields = ('id','section_title')
           
class user_rolesSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = user_roles
        fields = ('course','user','role')
        
class enrollmentSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = enrollment
        fields = ('course','user','status')
        
class course_sectionSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = course_section
        fields = ('course','section','user')
        
class moduleSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = module
        fields = ('module_name','module_description','user')
        
class section_moduleSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = section_module
        fields = ('course_section','module')
        
class partSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = part
        fields = ('part_name','part_description','type')
        
class module_partSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = module_part
        fields = ('section_module','part')
        
class training_dataSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = training_data
        fields = ('course','course_section','section_module','module_part','time','enrollment')
        