@echo off
title NanoIconPackTool-ResInjection
set "projectDir=E:\Android\CoreProjects\NanoIconPack\"
:main
java -jar ResInjection-1.0.5.4.1.3.0.jar %projectDir%
pause
goto main