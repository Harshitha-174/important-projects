from django.shortcuts import render, get_object_or_404
from django.contrib.auth.decorators import login_required
from .models import pdf

from django.conf import settings
import os
from django.http import HttpResponse,Http404
# Create your views here.
#@login_required(login_url='accounts/login')
def home(request):
    return render(request, 'home.html')
@login_required(login_url='accounts/login')
def techniques(request):
    return render(request, 'techniques.html')
"""@login_required(login_url='accounts/login')
def contact(request):
    return render(request, 'contact.html')"""
@login_required(login_url='accounts/login')
def chocolate(request):
    return render(request, 'chocolate.html')
@login_required(login_url='accounts/login')
def bigfrog(request):
    return render(request, 'bigfrog.html')
@login_required(login_url='accounts/login')
def reserveday(request):
    return render(request, 'reserveday.html')
@login_required(login_url='accounts/login')
def games(request):
    return render(request, 'games.html')
@login_required(login_url='accounts/login')
def pomodoro(request):
    return render(request, 'pomodoro.html')
@login_required(login_url='accounts/login')
def profile(request):
    return render(request, 'profile.html')

@login_required(login_url='accounts/login')
def file_list(request):
    files = pdf.objects.all()
    return render(request, 'fileviewer.html', {'files': files})
@login_required(login_url='accounts/login')
def download_file(request, file_id):
    file = pdf.objects.get(id=file_id)
    file_path = os.path.join(settings.MEDIA_ROOT, str(file.pdf))
    if os.path.exists(file_path):
        with open(file_path, 'rb') as fh:
            response = HttpResponse(fh.read(), content_type="application/force-download")
            response['Content-Disposition'] = 'inline; filename=' + os.path.basename(file_path)
            return response
    raise Http404

@login_required(login_url='accounts/login')
def sank(request):
    return render(request, 'snake.html')
@login_required(login_url='accounts/login')
def bubblshot(request):
    return render(request, 'bubblshot.html')