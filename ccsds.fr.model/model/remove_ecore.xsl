<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
    exclude-result-prefixes="ecore"
>
    <xsl:output method="xml" indent="yes"/>
	
	
    <xsl:template match="@* | node()" priority="-2">
        <xsl:copy>
          <xsl:apply-templates select="@* | node()" />
        </xsl:copy>
    </xsl:template>

    <xsl:template match="ecore:* | @ecore:*"/>
    <xsl:template match="/*/xsd:element[@name != 'FunctionalResourceModel']"/>
</xsl:stylesheet>