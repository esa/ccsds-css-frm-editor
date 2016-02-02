#!/usr/bin/sh

# purpose: appy an xslt transformation

INPUT="ccsds.frm"
RESULT="result.frm"

if [ "$1" != "" ] ; then
	INPUT=$1
	RESULT=$INPUT.updated.frm
fi

# set the classpath for xalan
export P="C:\Users\Holger Dreihahn\Documents\Tools\xalan\xalan-j_2_7_2"
export CLASSPATH="$P/xalan.jar;$P/serializer.jar;$P/xercesImpl.jar;$P/xml-apis.jar"

touch $RESULT

# apply transform_cl.xsl
java org.apache.xalan.xslt.Process -IN $INPUT -XSL transform_cl.xsl -OUT $RESULT

echo "created $RESULT from $INPUT"