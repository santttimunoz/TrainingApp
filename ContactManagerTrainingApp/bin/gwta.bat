@echo off
set JAVA_HOME=C:\apps\java\jdk-1.7.0_80
set PATH=%JAVA_HOME%\bin;%PATH%
call ant -f "%~dp0\..\modules\ant\build.xml" %*
