#!/usr/bin/sh

# purpose: convert the attribute SemanticDescription to a child element description.
# challenge: XSLT does not allow to insert attributes into the result tree after creating child elements
# solution: sort the attribute to convert to teh end after renaming it. Then the attribute to element ceonverison can be done.

INPUT="ccsds.frm"
RESULT="result.frm"

# set the classpath for xalan
export P="C:\Users\Holger Dreihahn\Documents\Tools\xalan\xalan-j_2_7_2"
export CLASSPATH="$P/xalan.jar;$P/serializer.jar;$P/xercesImpl.jar;$P/xml-apis.jar"

# rename SemanticDescription to xSemanticDescription
java org.apache.xalan.xslt.Process -IN $INPUT -XSL frm_ren_descr_attr.xsl -OUT ren.xml

# sort the attributes
java org.apache.xalan.xslt.Process -IN ren.xml -XSL frm_sort_attr.xsl -OUT sorted.xml

# convert attribute xSemanticDescription to an element description
java org.apache.xalan.xslt.Process -IN sorted.xml -XSL frm_descr_attr_to_el.xsl -OUT $RESULT

echo "created $RESULT from $INPUT"