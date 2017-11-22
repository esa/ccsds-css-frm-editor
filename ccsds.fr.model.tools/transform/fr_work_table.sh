#!/bin/sh

# purpose: appy an xslt transformation

INPUT="$1"
RESULT="fr_work_table.csv"

if [ "$1" = "" ] ; then
	echo "Please provide theFRM file as an argument"
fi

# set the classpath for xalan
export P="${HOME}/Tools/SaxonHE9-8-0-6J"
export CLASSPATH="$P/saxon9he.jar"
export XSL=fr_work_table.xsl

touch $RESULT

# apply transform_cl.xsl
java -jar "${P}/saxon9he.jar" -s:$INPUT -xsl:${XSL} -o:$RESULT

echo "created $RESULT from $INPUT"