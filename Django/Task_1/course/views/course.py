from django.contrib.auth.mixins import LoginRequiredMixin, UserPassesTestMixin
from django.urls import reverse_lazy
from django.views import generic
from django.views.generic import CreateView, UpdateView, DeleteView

from course.models.modules import Modules
from course.models.course import Course


class CourseView(generic.DetailView):
    model = Course
    template_name = 'course/course.html'

    def get_context_data(self, **kwargs):
        # Call the base implementation first to get a context
        context = super().get_context_data(**kwargs)
        # Add in the username
        moduless = Modules.objects.filter(course=self.kwargs['pk'])
        context['moduless'] = moduless
        return context


class CourseCreate(LoginRequiredMixin, CreateView):
    model = Course
    fields = ['title', 'body']
    template_name = 'course/create_course.html'
    login_url = reverse_lazy('login')

    def form_valid(self, form):
        form.instance.user = self.request.user
        return super().form_valid(form)


class CourseUpdate(LoginRequiredMixin, UserPassesTestMixin, UpdateView):
    model = Course
    fields = ['title', 'body']
    template_name = 'course/create_course.html'
    login_url = reverse_lazy('login')

    def test_func(self):
        return Course.objects.get(id=self.kwargs['pk']).user == self.request.user


class CourseDelete(LoginRequiredMixin, UserPassesTestMixin, DeleteView):
    model = Course
    success_url = reverse_lazy('course:home')
    login_url = reverse_lazy('login')

    def test_func(self):
        return Course.objects.get(id=self.kwargs['pk']).user == self.request.user
