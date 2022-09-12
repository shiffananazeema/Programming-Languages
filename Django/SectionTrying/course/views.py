from rest_framework import viewsets
from . models import user,course,section,user_roles,enrollment
from . models import course_section,module,section_module
from . models import part,module_part,training_data
from . serializer import userSerializer,courseSerializer,sectionSerializer
from . serializer import user_rolesSerializer,enrollmentSerializer
from . serializer import course_sectionSerializer,moduleSerializer,section_moduleSerializer
from . serializer import module_partSerializer,training_dataSerializer,partSerializer

class userViewSet(viewsets.ModelViewSet):
    queryset = user.objects.all()
    serializer_class = userSerializer
    
class courseViewSet(viewsets.ModelViewSet):
    queryset = course.objects.all()
    serializer_class = courseSerializer
    
class sectionViewSet(viewsets.ModelViewSet):
    queryset = section.objects.all()
    serializer_class = sectionSerializer
    
class user_rolesViewSet(viewsets.ModelViewSet):
    queryset = user_roles.objects.all()
    serializer_class = user_rolesSerializer
    
class enrollmentViewSet(viewsets.ModelViewSet):
    queryset = enrollment.objects.all()
    serializer_class = enrollmentSerializer
    
class course_sectionViewSet(viewsets.ModelViewSet):
    queryset = course_section.objects.all()
    serializer_class = course_sectionSerializer
    
class moduleViewSet(viewsets.ModelViewSet):
    queryset = module.objects.all()
    serializer_class = moduleSerializer
    
class section_moduleViewSet(viewsets.ModelViewSet):
    queryset = section_module.objects.all()
    serializer_class = section_moduleSerializer
    
class partViewSet(viewsets.ModelViewSet):
    queryset = part.objects.all()
    serializer_class = partSerializer    
    
class module_partViewSet(viewsets.ModelViewSet):
    queryset = module_part.objects.all()
    serializer_class = module_partSerializer
    
class training_dataViewSet(viewsets.ModelViewSet):
    queryset = training_data.objects.all()
    serializer_class = training_dataSerializer
    
