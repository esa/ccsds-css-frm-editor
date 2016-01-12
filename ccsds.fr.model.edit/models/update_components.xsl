<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" indent="yes"/>

	<!-- copy everything -->
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()"/>
		</xsl:copy>
	</xsl:template>

	<xsl:template match="elements[@name='typeDefinition']/representation | 
	                     elements[@name='SemanticDefinition']/representation |
	                     elements[@name='guardCondition']/representation">
		<xsl:element name="representation">
			<xsl:attribute name="href">platform:/plugin/org.eclipse.emf.eef.views/std/SWT.toolkits#//@widgets.2</xsl:attribute>
		</xsl:element>
	</xsl:template>

</xsl:stylesheet>