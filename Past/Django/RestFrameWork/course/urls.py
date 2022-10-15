from django.urls import path,include
from rest_framework import routers
from course.views import courseViewSet,moduleViewSet

router = routers.DefaultRouter()
router.register(r'course', courseViewSet)
router.register(r'module', moduleViewSet)

urlpatterns = [
    path('',include(router.urls)),
]
