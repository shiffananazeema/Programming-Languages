from django.db import models

class course(models.Model):
    course_name = models.CharField(max_length=100)
    course_title = models.CharField(max_length=100)
    
    def __str__(self):
        return self.course_name
    
class module(models.Model):
    module_name = models.CharField(max_length=100)
    course = models.ForeignKey(course, on_delete=models.CASCADE)
    
    def __str__(self):
        return '"{module_name}" - {course_name}'.format(module_name=self.module_name,
                                                                  course_name=self.course)
   