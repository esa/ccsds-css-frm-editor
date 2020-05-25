<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fr="http://iso.org.dod.ccsds" xmlns:frtypes="http://ccsds.fr/types">

<!--
	Firefox: If you do not see the 'good' HTML version:
	
	Toggle the value of the about:config setting privacy.file_unique_origin
	https://support.mozilla.org/en-US/questions/1264318
	
	Newer versions of firefox require to toggle:
	security.data_uri.unique_opaque_origin
-->

<xsl:output method="html" version="1.0" encoding="UTF-8" indent="yes"/>

	<xsl:template match="/">
		<html xmlns:f="http://www.w3.org/2002/xforms">
			<head>
				<style>
					table.alternate-odd:nth-child(odd) {
						background: #F0F8FF;
					}
					table.alternate-even:nth-child(even) {
						background: #F0F8FF;
					}
				</style>
			</head>
			<body bgcolor="white" style="font-family:Times; font-size:15px; color:black">
				<h1>Functional Resource Model</h1>

				<table align="left" width="35%" border="1">
					<h2 align="left"></h2>
					<a name="{TOC-ID}"></a>
					
					<tr>
						<th>Functional Resource Set</th><th>Functional Resource</th>
					</tr>
					
					<xsl:for-each select="//functionalResourceSet">
						<tr>
							<td>
								<a>
									<xsl:value-of select="@name" />			
								</a>
							</td>
						
							<td>
								<a>			
									<table align="center" width="100%" border="0">
										<h2 align="left"></h2>
										<a name="{TOC-ID}"></a>
										<xsl:for-each select="functionalResource">
											<tr>
												<td>
													<a href="#{generate-id(.)}">
														<xsl:value-of select="@classifier" />									
													</a>
												</td>
											</tr>
										</xsl:for-each>
									</table>
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
						<xsl:element name="a">
								<xsl:attribute name="title">					
									<xsl:text>Authorizing Entity </xsl:text>
									<xsl:value-of select="@authorizingEntity" />
									<xsl:text>, </xsl:text>
									<xsl:text>Creation Date '</xsl:text><xsl:value-of select="@creationDate" /><xsl:text>'</xsl:text>
									<xsl:text> Version '</xsl:text><xsl:value-of select="@version" />
									<xsl:text>' </xsl:text>
								</xsl:attribute>
							Functional Resource
							<xsl:value-of select="@classifier" />
							<xsl:text> FR Set: </xsl:text>
							<xsl:value-of select="../@name" />
							<xsl:text> </xsl:text>
						</xsl:element>
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

	<xsl:variable name="tableStyle" >
	   <xsl:choose>
	     <xsl:when test="count(../preceding-sibling::*) mod 2 = 0">
	       <xsl:text>alternate-even</xsl:text>
	     </xsl:when>
	     <xsl:otherwise>
	       <xsl:text>alternate-odd</xsl:text>
	     </xsl:otherwise>
	   </xsl:choose>
	</xsl:variable>

	<xsl:template match="parameter|event|directives|value|qualifier">
		
			<table class="{$tableStyle}" align="center" width="100%" border="0">
	
			<tr>
				<td style="font-size:18px">
					<b>
						<xsl:apply-templates select="@deprecated"/>
						<xsl:text> </xsl:text>
						<a href="#{generate-id(..)}">
							<xsl:value-of select="../@classifier" />
						</a>
					</b>
					<xsl:text> </xsl:text>				

					<xsl:element name="a">
						<xsl:attribute name="title">					
							<xsl:text>Authorizing Entity </xsl:text>
							<xsl:value-of select="@authorizingEntity" />
							<xsl:text>, </xsl:text>
							<xsl:text>Creation Date '</xsl:text><xsl:value-of select="@creationDate" /><xsl:text>'</xsl:text>
							<xsl:text> Version '</xsl:text><xsl:value-of select="@version" />
							<xsl:text>' </xsl:text>
						</xsl:attribute>

						<xsl:if test="name(.) != 'directives'">	
							<xsl:value-of select="name(.)" />
						</xsl:if>
						<xsl:if test="name(.) = 'directives'">
							<xsl:text>directive</xsl:text>
							<a name="{generate-id(.)}"></a>
						</xsl:if>
					
					'<b><xsl:value-of select="@classifier" /></b>'
					
					<xsl:element name="a">
<!-- 
						<xsl:attribute name="style">					
							font-family:Times; font-size:12px; color:black	
						</xsl:attribute>
 -->
						<xsl:text>(</xsl:text><xsl:value-of select="@stringIdentifier" /><xsl:text>)</xsl:text>
						<xsl:text> </xsl:text><xsl:apply-templates select="oid" />
						<xsl:text> </xsl:text><xsl:apply-templates select="externalOid" />
					</xsl:element>
					</xsl:element>
					
				</td>
			</tr>
			
 			
			<xsl:apply-templates select="@SemanticDefinition"/>
			<xsl:apply-templates select="@qualifier"/>
			<xsl:apply-templates select="@guardCondition"/>
			<xsl:apply-templates select="@engineeringUnit"/>
			<xsl:apply-templates select="@configured"/>
 			<xsl:apply-templates select="@typeDefinition" />
 						
			<tr>
				<td>					
					<!-- directives may have child parameters -->			
					<xsl:apply-templates select="parameter" />
					<xsl:apply-templates select="value" />
					<xsl:apply-templates select="qualifier" />
				</td>
			</tr>	

		</table>
	</xsl:template>

	<xsl:template match="@SemanticDefinition">
			<tr>
				<td>
					<b>Definition: </b>
					<span style="white-space: pre-wrap; ">
					<i><xsl:value-of select="." /></i>
					</span>
				</td>
			</tr>	
	</xsl:template>

	<xsl:template match="@qualifier">
			<tr>
				<td>
					<b>Qualifier: </b>
					<span style="white-space: pre-wrap; font-family:Courier">
					<i><xsl:value-of select="." /></i>
					</span>
				</td>
			</tr>	
	</xsl:template>

	<xsl:template match="@guardCondition">
			<tr>
				<td>
					<b>Guard Condition: </b>
					<span style="white-space: pre-wrap;">
					<xsl:value-of select="." />
					</span>
				</td>
			</tr>	
	</xsl:template>


	<xsl:template match="@typeDefinition">
		<tr>
			<td>
				<br />
				<b>Type Definition: </b>
	
				<br />
				<span style="white-space: pre-wrap; font-family:Courier">
					<xsl:value-of select="." />
				</span>
				<br />
			</td>
		</tr>
	</xsl:template>

	<xsl:template match="rootOid">
	</xsl:template>

	<xsl:template match="functionalResource/oid">
		Functional Resource OID
		<xsl:apply-templates />
	</xsl:template>

	<xsl:template match="@deprecated">
		<b style="color:red">Deprecated</b>
	</xsl:template>

	<xsl:template match="@engineeringUnit">
		<tr>
			<td>
				<b>Engineering Unit: </b>
				<xsl:value-of select="." />
			</td>
		</tr>
	</xsl:template>

	<xsl:template match="@configured">
		<tr>
			<td>
				<b>Configured: </b>
				<xsl:value-of select="." />
			</td>
		</tr>
	</xsl:template>


	<xsl:template match="oid">
		<xsl:text>OID </xsl:text>
		<xsl:apply-templates select="oidBit"/>
	</xsl:template>

	<xsl:template match="externalOid">
		<xsl:text>External OID </xsl:text>
		<xsl:apply-templates select="oidBit"/>
	</xsl:template>


	<xsl:template match="oidBit">
		<xsl:text>.</xsl:text><xsl:value-of select="."/>
	</xsl:template>

</xsl:stylesheet>