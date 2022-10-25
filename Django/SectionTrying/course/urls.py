from django.urls import path,include
from rest_framework import routers

from course.views import userViewSet,courseViewSet,sectionViewSet
from course.views import user_rolesViewSet,enrollmentViewSet
from course.views import course_sectionViewSet,moduleViewSet,section_moduleViewSet
from course.views import module_partViewSet,training_dataViewSet,partViewSet

router = routers.DefaultRouter()
router.register(r'user', userViewSet)
router.register(r'course', courseViewSet)
router.register(r'section', sectionViewSet)
router.register(r'user_roles', user_rolesViewSet)
router.register(r'enrollment', enrollmentViewSet)
router.register(r'course_section', course_sectionViewSet)
router.register(r'module', moduleViewSet)
router.register(r'section_module', section_moduleViewSet)
router.register(r'part', partViewSet)
router.register(r'module_part', module_partViewSet)
router.register(r'training_data', training_dataViewSet)


urlpatterns = [
    path('',include(router.urls)),
]
