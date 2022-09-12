from django.contrib import admin

# Register your models here.
from course.models.course import Course
from course.models.modules import Modules

admin.site.register(Course)
admin.site.register(Modules)