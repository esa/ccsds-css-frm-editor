This is the CCSDS Functional Resource Editor project. It provides eclipse plugins to edit Functional Resources as available at SANA in eclipse:
https://sanaregistry.org/r/functional_resources/

Functional Resource Model Editor documentation is here:
https://github.com/esa/ccsds-css-frm-editor/tree/master/ccsds.fr.model.releng.feature/doc

A github repository hosting an eclipse p2 update site is available here:
https://github.com/esa/ccsds-css-frm-editor-p2

*** FRM Installation

1) Install EEF (if not yet installed)
	- Help -> Install New Software
	- 2021-12 - https://download.eclipse.org/releases/2021-12/
	- Filter for EEF and install Extended Editing Framework SDK 1.5.1

2) Installation with local archive ccsds.fr.feature.zip
	- Help -> Install New Software
	- Available Software Sites -> Add -> https://esa.github.io/ccsds-css-frm-editor-p2/
	- select 'ccsds.fr.model' and follow the installation wizard

3) Re-start eclipse and create a project (File -> New -> Project -> General -> Project (Modeling Project or General -> Resource))

4) Place the *.frm file in the created project and open it.

5) If it does not open with the tree based editor, right click on ccsds.frm and choose 
Open with -> FunctionalResourceModel Model Editor  


6) Graphical FRM Modelling of Uses relations - Experimental
6.1.1) install Sirius integration with EEF from update site (Help -> Install New Software) Modeling Package Updates
6.1.2) Switch to the Modeling Perspective: Window -> Perspective -> Open Perspective -> Other -> Modeling
6.2) If your project from 5) is not a modelling project convert it to be a Modeling project: right click the project -> Configure -> Convert to Modeling Project 
6.3) Right click the project -> View Point Selection -> Functional Resources.  Your project has now an representation.aird file
6.4) Right click the project -> Create representation. Select Functional Resource Diagram -> Next
6.5) Select the package from the FRM file for which you want to create a diagram
6.6) Populate the diagram by dragging and dropping element from the FRM file on the diagram 

*** Opening FRM as HTML
Later versions of Firefox require to adjust a setting to apply the frm.xsl to the XML to finally generate HTML:
(1) In a new tab, type or paste about:config in the address bar and press Enter/Return. Click the button promising to be careful or accepting the risk.

(2) In the search box above the list, type or paste uniq and pause while the list is filtered

(3) Double-click the privacy.file_unique_origin preference to switch the value from true to false

From https://support.mozilla.org/de/questions/1264318
