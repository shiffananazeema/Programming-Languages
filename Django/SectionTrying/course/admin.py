from django.contrib import admin

from . models import user,course,section,user_roles,enrollment
from . models import course_section,module,section_module,part
from . models import module_part,training_data

admin.site.register(user)
admin.site.register(course)
# admin.site.register(section)
admin.site.register(user_roles)
admin.site.register(enrollment)
admin.site.register(course_section)
admin.site.register(module)
admin.site.register(section_module)
admin.site.register(part)
admin.site.register(module_part)
admin.site.register(training_data)
