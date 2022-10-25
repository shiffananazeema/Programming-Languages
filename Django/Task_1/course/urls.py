from django.urls import path

from course.views.modules import ModulesCreate
from course.views.home import home
from course.views.course import CourseView, CourseCreate, CourseUpdate, CourseDelete

app_name = 'course'
urlpatterns = [
    # ex: /course/
    path('', home, name='home'),
    # ex: /course/dusan
    path('<str:username>', home, name='user_courses'),
    # ex: /course/course/5/
    path('course/<int:pk>/', CourseView.as_view(), name='course'),
    # ex: /course/course/create/
    path('course/create/', CourseCreate.as_view(), name='create_course'),
    # ex: /course/course/5/update/
    path('course/create/<int:pk>/update', CourseUpdate.as_view(), name='update_course'),
    # ex: /course/course/5/delete/
    path('course/<int:pk>/delete/', CourseDelete.as_view(), name='delete_course'),
    # ex: /course/course/5/modules/
    path('course/<int:pk>/modules/', ModulesCreate.as_view(), name='create_modules')
]
