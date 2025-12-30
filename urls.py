from django.urls import path
from . import views

urlpatterns=[
    path('', views.home, name="home"),
    path('techniques', views.techniques, name="techniques"),
    #path('contact', views.contact, name="contact"),
    path('chocolate', views.chocolate, name="chocolate"),
    path('bigfrog', views.bigfrog, name="bigfrog"),
    path('reserveday', views.reserveday, name="reserveday"),
    path('games', views.games, name="games"),
    path('pomodoro', views.pomodoro, name="pomodoro"),
    path('profile', views.profile, name="profile"),
    path('file_list', views.file_list, name="pdf1"),
    path('download/<int:file_id>/', views.download_file, name='download_file'),
    path('edxgames/sanke', views.sank, name="snake" ),
    path('edxgames/bubblshot', views.bubblshot, name="bubblshot")
]