<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	version="1.0">

	<xsl:template match="/">
		<html xmlns:f="http://www.w3.org/2002/xforms">
			<head>
			
    			
				<style>
					table.alternate:nth-child(odd) {
					background: lightgrey;
					}
				</style>
			</head>
			<body bgcolor="white" style="font-family:Times; font-size:15px; color:black">
				<h1>Functional Resource Model</h1>
				<table align="center" width="100%" border="0">
					<h2 align="left"></h2>
					<a name="{TOC-ID}"></a>
					<xsl:for-each select="//functionalResource">
						<tr>
							<td>
								<a href="#{generate-id(.)}">
									<xsl:value-of select="@name" />
								</a>
							</td>
						</tr>
					</xsl:for-each>
				</table>
				<p />
				<table align="center" width="100%" border="1">
					<tr>
						<xsl:apply-templates />
					</tr>
				</table>

			</body>
		</html>
	</xsl:template>

	<xsl:template match="functionalResource">
		<table align="center" width="100%" border="3">
			<a name="{generate-id(.)}"></a>
			<tr>
				<td style="font-size:18px">
					<b>
						Functional Resource
						<xsl:value-of select="@name" />
						<xsl:text> </xsl:text>
					</b>
					<a href="{TOC-ID}">(back to top)</a>
				</td>
			</tr>
			<tr>
				<td>
					Definition:
					<xsl:value-of select="@SemanticDefinition" />
				</td>
			</tr>
			<tr>
				<td>
					<xsl:apply-templates />
				</td>
			</tr>
		</table>
	</xsl:template>

	<xsl:template match="parameter|event|directive">
		<table class="alternate" align="center" width="100%" border="0">
			<tr>
				<td style="font-size:18px">
					<b>
						<a href="#{generate-id(..)}">
							<xsl:value-of select="../@name" />
						</a>
					</b>
					parameter '
					<b>
						<xsl:value-of select="@name" />
					</b>
					'
					Authorizing Entity
					<xsl:value-of select="@authorizingEntity" />
					,
					Creation Date '
					<xsl:value-of select="@creationDate" />		
					'					
					<b>
						<xsl:apply-templates />
					</b>

				</td>
			</tr>
			<tr>
				<td>
					<i>
						Definition:
						<xsl:value-of select="@SemanticDefinition" />
					</i>
				</td>
			</tr>


			<xsl:choose>
				<xsl:when test="./@engineeringUnit">
					<tr>
						<td>
							<b>Engineering Unit: </b>
							<xsl:value-of select="@engineeringUnit" />
						</td>
					</tr>
				</xsl:when>
				<xsl:otherwise>
				</xsl:otherwise>
			</xsl:choose>
		
			<xsl:choose>
				<xsl:when test=".[@deprecated = 'true']">
					<tr>
						<td>
							<b style="color:red">Deprecated</b>
						</td>
					</tr>
				</xsl:when>
				<xsl:otherwise>
				</xsl:otherwise>
			</xsl:choose>
			
			<tr>
				<td>
					<br/>
					<b>Type Definition: </b>
					
					<br/>
					<span style="white-space: pre-wrap; font-family:Courier">
						<xsl:value-of select="@typeDefinition" />
					</span>
					<br />
				</td>
			</tr>
		</table>
	</xsl:template>

	<xsl:template match="rootOid">

	</xsl:template>

	<xsl:template match="functionalResource/oid">
		Functional Resource OID
		<xsl:apply-templates />
	</xsl:template>

	<xsl:template match="parameter/@deprecated">
  		Deprecated: <xsl:value-of select="@deprectated" />
	</xsl:template>

	<xsl:template match="parameter/@engineeringUnit">
  		Engineering Unit: <xsl:value-of select="@engineeringUnit" />
	</xsl:template>


	<xsl:template match="oid">
		OID
		<xsl:apply-templates />
	</xsl:template>

	<xsl:template match="oidBit">
		<xsl:value-of select="." />
	</xsl:template>

</xsl:stylesheet>