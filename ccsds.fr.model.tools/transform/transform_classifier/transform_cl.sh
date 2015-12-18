#!/usr/bin/sh

# purpose: convert the attribute short name to attribute classifier.

INPUT="ccsds.frm"

if [ "$1" != "" ] ; then
	INPUT=$1
fi	

RESULT=${INPUT}_updated.frm

# set the classpath for xalan
export P="C:\Users\Holger Dreihahn\Documents\Tools\xalan\xalan-j_2_7_2"
export CLASSPATH="$P/xalan.jar;$P/serializer.jar;$P/xercesImpl.jar;$P/xml-apis.jar"

# rename SemanticDescription to xSemanticDescription
java org.apache.xalan.xslt.Process -IN $INPUT -XSL transform_cl.xsl -OUT $RESULT


echo "created $RESULT from $INPUT"