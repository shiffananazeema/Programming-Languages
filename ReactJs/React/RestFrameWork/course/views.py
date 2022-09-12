from rest_framework import viewsets
from . models import course,module
from . serializer import courseSerializer,moduleSerializer

class courseViewSet(viewsets.ModelViewSet):
    queryset = course.objects.all()
    serializer_class = courseSerializer
    
class moduleViewSet(viewsets.ModelViewSet):
    queryset = module.objects.all()
    serializer_class = moduleSerializer