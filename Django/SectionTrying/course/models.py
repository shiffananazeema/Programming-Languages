from django.db import models

class user(models.Model):
    user_name = models.CharField(max_length=100)
    
    def __str__(self):
        return self.user_name
    
class course(models.Model):
    course_title = models.CharField(max_length=100)
    
    def __str__(self):
        return self.course_title
    
class section(models.Model):
    section_title = models.CharField(max_length=100)
    
    def __str__(self):
        return self.section_title
    
class user_roles(models.Model):
    course = models.ForeignKey(course, on_delete=models.CASCADE)
    user = models.ForeignKey(user, on_delete=models.CASCADE)
    role = models.CharField(max_length=100)
    
    def __str__(self):
        return self.role
    
class enrollment(models.Model):
    course = models.ForeignKey(course, on_delete=models.CASCADE)
    user = models.ForeignKey(user, on_delete=models.CASCADE)
    status = models.BooleanField()
    
    def __str__(self):
        return self.user
    

class course_section(models.Model):
    course = models.ForeignKey(course, on_delete=models.CASCADE)
    section = models.ForeignKey(section, on_delete=models.CASCADE)
    user = models.ForeignKey(user, on_delete=models.CASCADE)
#    order_no = models.IntegerField()

    
class module(models.Model):    
    module_name = models.CharField(max_length=100)
    module_description = models.CharField(max_length=100)
#    hlod
#    thumbnail
    user = models.ForeignKey(user, on_delete=models.CASCADE)  
    
    def __str__(self):
        return self.module_name  
    
class section_module(models.Model):
    course_section = models.ForeignKey(course_section, on_delete=models.CASCADE)
    module = models.ForeignKey(module, on_delete=models.CASCADE)
#    order_no

class part(models.Model):  
    part_name =  models.CharField(max_length=100)
    part_description = models.CharField(max_length=100)
#    lod
#    thumbnail
    type = models.CharField(max_length=100)
#    static_mesh
#    assembled_transform: Json
#    disassembled_transform: Json
#    grip_location
#    actions: List
#    file_paths
    def __str__(self):
        return self.type

class module_part(models.Model):
    section_module = models.ForeignKey(section_module, on_delete=models.CASCADE)
    part = models.ForeignKey(part, on_delete=models.CASCADE)
#    order_no
    
class training_data(models.Model):
    course = models.ForeignKey(course, on_delete=models.CASCADE)
    course_section = models.ForeignKey(course_section, on_delete=models.CASCADE)
    section_module = models.ForeignKey(section_module, on_delete=models.CASCADE)
    module_part = models.ForeignKey(module_part, on_delete=models.CASCADE)
#    type
    time = models.DateTimeField()
    enrollment = models.ForeignKey(enrollment, on_delete=models.CASCADE)