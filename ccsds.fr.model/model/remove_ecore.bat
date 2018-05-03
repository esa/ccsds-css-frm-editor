@ECHO OFF
REM Runs the xsl on the EEF model

set INPUT=functional_resource.xsd
set RESULT=functional_resource_clean.xsd


set P=C:\Users\Holger Dreihahn\Documents\Tools\xalan\xalan-j_2_7_2
set CLASSPATH=%P%/xalan.jar;%P%/serializer.jar;%P%/xercesImpl.jar;%P%/xml-apis.jar

REM echo CLASSPATH: %CLASSPATH%

REM rename SemanticDescription to xSemanticDescription
java org.apache.xalan.xslt.Process -IN "%INPUT%" -XSL remove_ecore.xsl -OUT "%RESULT%" 
if %ERRORLEVEL% GEQ 1 EXIT /B 1

copy /Y %RESULT% %INPUT%
del %RESULT%

echo updated %INPUT%