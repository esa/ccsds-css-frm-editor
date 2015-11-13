This is a description how to use the Rich Text control for EEF. Not necessariliy the best...

0) install the eps dependencies of org.eclipse.emf.eef.extended.widgets.richtext

1) add as dependencies (e.g. to the edit package)
	org.eclipse.emf.eef.runtime.extended;bundle-version="1.2.0"
	org.eclipse.emf.eef.extended.widgets.richtext;bundle-version="1.2.1"
	
2) Use a text editor to replace in functional_resources.components a text area for an editor:

<representation href="platform:/plugin/org.eclipse.emf.eef.views/std/SWT.toolkits#//@widgets.2"/>

with 

<representation href="platform:/plugin/org.eclipse.emf.eef.runtime.extended/std/Extended.toolkits#//@widgets.0"/>

the rich text plugin.

3) functional_resource.eefgen, EEF-> Generate EEF architecture

4) fix all the missing imports in Java and some access to non-existant methods of RichText

5) adjust the layout for the rich text control by setting a heightHint of e.e. 200 and
	toolbarData.widthHint = 200; (e.g. ParameterPropertiesEditionPartForm#createSemanticDefinitionRichText)