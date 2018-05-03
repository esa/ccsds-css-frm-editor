#!/bin/sh
# Runs the xsl on the EEF model

INPUT=functional_resource.xsd
RESULT=functional_resource_clean.xsd


export P="$HOME/Documents/Tools/xalan/xalan-j_2_7_2"
export CLASSPATH="$P/xalan.jar:$P/serializer.jar:$P/xercesImpl.jar:$P/xml-apis.jar"

# echo CLASSPATH: $CLASSPATH

# rename SemanticDescription to xSemanticDescription
java org.apache.xalan.xslt.Process -IN "$INPUT" -XSL remove_ecore.xsl -OUT "$RESULT" 
if [ "$?" != "0" ] ; then
	echo "XSLT returned $?"
	exit -1;
fi

cp $RESULT $INPUT
rm $RESULT

echo updated $INPUT