<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">

<xsl:output method="text"/>

	<xsl:template match="/">
		# FR, Creator, Editor
		<xsl:apply-templates/>
	</xsl:template>

	

	<xsl:template match="functionalResource">
		<xsl:text>"</xsl:text>
		<xsl:value-of select="@stringIdentifier"/>
		<xsl:text>", "</xsl:text>
		<xsl:value-of select="@authorizingEntity"/>
		<xsl:text>", Someone
		</xsl:text>
	</xsl:template>
	
	<xsl:template match="node()">
		<xsl:apply-templates/>
	</xsl:template>
	
</xsl:stylesheet>