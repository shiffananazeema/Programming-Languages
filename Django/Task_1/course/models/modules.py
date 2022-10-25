from django.contrib.auth.models import User
from django.db import models
from course.models.course import Course

class Modules(models.Model):
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    course = models.ForeignKey(Course, on_delete=models.CASCADE)
    body = models.TextField()
    pub_date = models.DateTimeField('date published', auto_now_add=True)

    def __str__(self):
        return '"{body}..." on {course_title} by {username}'.format(body=self.body[:20],
                                                                  course_title=self.course.title,
                                                                  username=self.user.username)
