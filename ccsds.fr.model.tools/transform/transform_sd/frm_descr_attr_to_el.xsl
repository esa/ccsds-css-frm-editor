<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:xmi="http://www.omg.org/XMI">
<xsl:output method="xml" indent="yes"/>

	<!-- copy everything -->
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()"/>
		</xsl:copy>
	</xsl:template>

	<!-- remove the version attribute -->
	<xsl:template match="@xmi:version">
	</xsl:template>

	<xsl:template match="@xSemanticDefinition">
		<xsl:element name="semantic_definition"><xsl:value-of select="."/></xsl:element> 		
	</xsl:template>

	<xsl:template match="@ytypeDefinition">
		<xsl:element name="type_definition"><xsl:value-of select="."/></xsl:element> 		
	</xsl:template>

</xsl:stylesheet>