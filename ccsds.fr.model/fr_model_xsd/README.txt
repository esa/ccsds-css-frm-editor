This folder contains an XML Schema, which is derived from schema generated from the ecore. 
The schema generated from the ecore contains ecore metadata and ecore types from an ecore.xsd.
IN order to have a 'pure' schema, the ecore information have been stripped and the types
have been converted to XML schema types.

The justification to start from the ecore rather than the from the xsd itself, is
that modelling or references is way easier and straightforward in ecore than in xsd.

TODO: Write an xsl, which does that automatically.


functional_resource.xsd		is the XML schema w/o ecore information - note that some elements are optional to avoid errors for missing attributes in the fr model.
ccsds_fr_model.xml			is an example functional resource model file to validate the schema, in fact it has a schema reference.
 
 
Schema clause:
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                            xsi:schemaLocation="http://iso.org.dod.ccsds functional_resource.xsd" 