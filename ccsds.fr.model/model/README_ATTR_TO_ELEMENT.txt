Soem FRM attributes (semanticDescription) should not be XML attributes but rather elements.

Steps:
1) annotate the ecore:
    <eStructuralFeatures xsi:type="ecore:EAttribute" name="SemanticDefinition" lowerBound="1"
        eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString">
      <eAnnotations source="http:///org/eclipse/emf/ecore/util/ExtendedMetaData">
        <details key="kind" value="element"/>
        <details key="name" value="description"/>
        not needed (disturbing:): <details key="namespace" value="##targetNamespace"/>
      </eAnnotations>
    </eStructuralFeatures>
2) reload the genmodel
3) generate the model code
4) necessary? generate edit, editor and eef
5) transform current FRM XML file with xsd to new syntax with elements instead of attributes.
