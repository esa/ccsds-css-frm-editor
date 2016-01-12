<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" indent="yes"/>

	<!-- copy everything -->
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()"/>
		</xsl:copy>
	</xsl:template>

	<xsl:template match="@name">
		<xsl:attribute name="stringIdentifier"><xsl:value-of select="."/></xsl:attribute> 		
	</xsl:template>

	<xsl:template match="@shortName">
		<xsl:attribute name="classifier"><xsl:value-of select="."/></xsl:attribute> 		
	</xsl:template>
	
	<xsl:template match="Event/@qualifier">
		<xsl:element name="Value">
			<xsl:attribute name="SemanticDescription"><xsl:value-of select="../@qualifier"/></xsl:attribute>
		</xsl:element>
	</xsl:template>

	<xsl:template match="directives/parameter">
		<xsl:element name="qualifier">
		 <xsl:apply-templates select="@*[not(name() = 'configured')]"/>
		</xsl:element>
	</xsl:template>
	

</xsl:stylesheet>