#!/bin/sh
# Runs the xsl on the EEF model

INPUT=functional_resource.components
RESULT=functional_resource_updated.components

# backup copy
cp functional_resource.components bak

P=$HOME/Documents/Tools/xalan/xalan-j_2_7_2
CLASSPATH=$P/xalan.jar;$P/serializer.jar;$P/xercesImpl.jar;$P/xml-apis.jar

# echo CLASSPATH: $CLASSPATH

# rename SemanticDescription to xSemanticDescription
java org.apache.xalan.xslt.Process -IN $INPUT -XSL update_components.xsl -OUT $RESULT
if [ "$?" != 0 ] ; then
	echo "XSLT returned $?"
	exit -1;
fi

cp $RESULT $INPUT
rm $RESULT

echo updated $INPUT