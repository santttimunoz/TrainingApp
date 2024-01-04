@echo off
REM TrainingApp8-General-7-8.0.2_en_US
TITLE Guidewire Studio TrainingApp 8.0.2 GA E22 Patch 2
call ant -f "%~dp0\modules\ant\build.xml" %* studio
