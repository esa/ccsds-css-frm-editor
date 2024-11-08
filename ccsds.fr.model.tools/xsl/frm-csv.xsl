<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
	xmlns:fr="http://iso.org.dod.ccsds"
	xmlns:frtypes="http://ccsds.fr/types">

	<xsl:output method="text"  encoding="UTF-8"
		indent="yes" />

	<xsl:template match="/">
					<xsl:text>Parameter OID, Type, Classifier, Configured, Annotations, FR, Stratum</xsl:text> 
					<xsl:text>&#xa;</xsl:text>
					<xsl:apply-templates select="//parameter" />
					<xsl:apply-templates select="//value" />
					<xsl:apply-templates select="//qualifier" />
	</xsl:template>

	<!-- XSLT Template to remove anything, priority="-1" -->
	<xsl:template match="@*|node()|text()|comment()|processing-instruction()" priority="-1">
		<xsl:apply-templates />
	</xsl:template>


	<xsl:template match="parameter|value|qualifier">
		<xsl:if test="name() = 'parameter'" >
			<xsl:apply-templates select="oid" />
			<xsl:text>,</xsl:text>	
		</xsl:if>
		<xsl:if test="name() = 'value'" >
			<xsl:apply-templates select="typeOid" />
			<xsl:text>,</xsl:text>	
		</xsl:if>
		<xsl:if test="name() = 'qualifier'" >
			<xsl:apply-templates select="typeOid" />
			<xsl:text>,</xsl:text>	
		</xsl:if>

		<xsl:value-of select ="local-name()"/>
		<xsl:text>,</xsl:text>	
		<xsl:value-of select="@classifier" />
		<xsl:text>,</xsl:text>	
		<xsl:value-of select="@configured" />
		<xsl:text>,</xsl:text>	
		<xsl:apply-templates select="annotation" />
		<xsl:text>,</xsl:text>	
		<xsl:value-of select="../@classifier" />
		<xsl:text>,</xsl:text>	
		<xsl:value-of select="../../../@name" />	
<!-- The semantic description can contain newline
		<xsl:text>,"</xsl:text>	
		<xsl:value-of select="@SemanticDefinition" />
		<xsl:text>"</xsl:text>	
-->
		<xsl:text>&#xa;</xsl:text>

	</xsl:template>

	<xsl:template match="oid|typeOid">
		<xsl:apply-templates select="oidBit" />
	</xsl:template>

	<xsl:template match="oidBit">
		<xsl:text>.</xsl:text>
		<xsl:value-of select="." />
	</xsl:template>

	<xsl:template match="annotation">
		<xsl:value-of select="@name" />
		<xsl:text>=</xsl:text>		
		<xsl:value-of select="@value" />
	</xsl:template>

</xsl:stylesheet>