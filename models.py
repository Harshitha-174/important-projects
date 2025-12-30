from django.db import models

# Create your models here.
class pdf(models.Model):
    pdf = models.FileField(upload_to="pdf/")
    subject = models.CharField(max_length=None)
    chapter = models.CharField(max_length=None)
    def __str__(self):
        return f"{self.subject} - {self.chapter}"
