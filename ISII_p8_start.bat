@echo off
mvn sonar:sonar -Dsonar.login=”admin” -Dsonar.password=”admin”
pause