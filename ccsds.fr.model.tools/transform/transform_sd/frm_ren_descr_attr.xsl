<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" indent="yes"/>

	<!-- copy everything -->
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()"/>
		</xsl:copy>
	</xsl:template>

	<xsl:template match="@SemanticDefinition">
		<xsl:attribute name="xSemanticDefinition"><xsl:value-of select="."/></xsl:attribute> 		
	</xsl:template>

	<xsl:template match="@typeDefinition">
		<xsl:attribute name="ytypeDefinition"><xsl:value-of select="."/></xsl:attribute> 		
	</xsl:template>

</xsl:stylesheet>