
from django.contrib import admin
from django.contrib.auth import views as auth_views
from django.urls import path, include

from course.views.register import RegisterView

urlpatterns = [
    path('college/', include('course.urls')),
    path('admin/', admin.site.urls),
    path('login/', auth_views.LoginView.as_view(template_name='course/login.html'), name='login'),
    path('logout/', auth_views.LogoutView.as_view(next_page='course:home'), name='logout'),
    path('register/', RegisterView.as_view(), name='register')
]
