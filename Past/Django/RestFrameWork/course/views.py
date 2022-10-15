from rest_framework import viewsets
from rest_framework.permissions import IsAuthenticated
from . models import course,module
from . serializer import courseSerializer,moduleSerializer

class courseViewSet(viewsets.ModelViewSet):
    permission_classes = (IsAuthenticated,) 
    queryset = course.objects.all()
    serializer_class = courseSerializer
    
class moduleViewSet(viewsets.ModelViewSet):
    permission_classes = (IsAuthenticated,) 
    queryset = module.objects.all()
    serializer_class = moduleSerializer