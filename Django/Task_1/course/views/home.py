from django.contrib.auth.models import User
from django.core.paginator import Paginator
from django.shortcuts import render

from course.models.course import Course

NUM_OF_COURSES = 10


def home(request, username=None):
    first_name = ''
    last_name = ''
    if username:
        user = User.objects.get(username=username)
        first_name = user.first_name
        last_name = user.last_name
        course_list = Course.objects.filter(user=user)
    else:
        course_list = Course.objects.all()

    course_list = course_list.order_by('-pub_date')

    paginator = Paginator(course_list, NUM_OF_COURSES)  # Show NUM_OF_PAGES posts per page
    page = request.GET.get('page')

    courses = paginator.get_page(page)

    return render(request, 'course/home.html', {'courses': courses,
                                              'first_name': first_name,
                                              'last_name': last_name})
