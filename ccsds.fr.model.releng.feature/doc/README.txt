1) Installation 

1.0) Install Java 8

1.1) Install eclipse oxygen, choose the Eclipse Modeling Tools from
https://www.eclipse.org/downloads/

Win32:		https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/oxygen/3a/eclipse-modeling-oxygen-3a-win32.zip	
Win64:		https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/oxygen/3a/eclipse-modeling-oxygen-3a-win32-x86_64.zip
Mac64:		https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/oxygen/3a/eclipse-modeling-oxygen-3a-macosx-cocoa-x86_64.dmg		
Linux64:	https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/oxygen/3a/eclipse-modeling-oxygen-3a-linux-gtk-x86_64.tar.gz	

Installation Prerequisite:
If you have already installed the FRM editor in an old version it needs to be uninstalled before:
1) Help -> Install New Software -> What is already installed
2) Select 'ccsds.fr.model' and press the 'Uninstall...' button, then follow the instructions incl. restart

Installation

1) Installation with local archive ccsds.fr.feature.zip
	- Help -> Install New Software
	- Available Software Sites -> Add -> Archive: point to ccsds.fr.feature.zip
	- Select the created software site in 'Work with'
	- Untick 'Group Items by category
	- select 'ccsds.fr.model' and follow the installation wizard

2) Re-start eclipse and create a project (File -> New -> Project -> General -> Project (Modeling Project or General -> Resource))

3) Place the *.frm file in the created project and open it.

4) If it does not open with the tree based editor, right click on ccsds.frm and choose 
Open with -> FunctionalResourceModel Model Editor  


5) Graphical FRM Modelling of Uses relations - Experimental
5.1.1) install Sirius integration with EEF from update site (Help -> Install New Software) Modeling Package Updates for Eclipse Oxygen
5.1.2) Switch to the Modeling Perspective: Window -> Perspective -> Open Perspective -> Other -> Modeling
5.2) If your project from 5) is not a modelling project convert it to be a Modeling project: right click the project -> Configure -> Convert to Modeling Project 
5.3) Right click the project -> View Point Selection -> Functional Resources.  Your project has now an representation.aird file
5.4) Right click the project -> Create representation. Select Functional Resource Diagram -> Next
5.5) Select the package from the FRM file for which you want to create a diagram
5.6) Populate the diagram by dragging and dropping element from the FRM file on the diagram 

Opening FRM as HTML
Later versions of Firefox require to adjust a setting to apply the frm.xsl to the XML to finally generate HTML:
(1) In a new tab, type or paste about:config in the address bar and press Enter/Return. Click the button promising to be careful or accepting the risk.

(2) In the search box above the list, type or paste uniq and pause while the list is filtered

(3) Double-click the privacy.file_unique_origin preference to switch the value from true to false

From https://support.mozilla.org/de/questions/1264318

