from django.contrib.auth.mixins import LoginRequiredMixin
from django.urls import reverse, reverse_lazy
from django.views.generic import CreateView

from course.models.modules import Modules
from course.models.course import Course


class ModulesCreate(LoginRequiredMixin, CreateView):
    model = Modules
    fields = ['body']
    template_name = 'course/create_modules.html'
    login_url = reverse_lazy('login')

    def form_valid(self, form):
        form.instance.user = self.request.user
        form.instance.course = Course.objects.get(id=self.kwargs['pk'])
        return super().form_valid(form)

    def get_success_url(self):
        return reverse('course:course', kwargs={'pk': self.kwargs['pk']})
