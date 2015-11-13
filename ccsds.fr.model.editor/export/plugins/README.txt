1) Installation 
1.1) Install eclipse luna, choose the Eclipse Modeling Tools from
https://www.eclipse.org/downloads/

URLs
Win32:		http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR2/eclipse-modeling-luna-SR2-win32.zip
Win64:		http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR2/eclipse-modeling-luna-SR2-win32-x86_64.zip
Mac64:		http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR2/eclipse-modeling-luna-SR2-macosx-cocoa-x86_64.tar.gz		
Linux64:	http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR2/eclipse-modeling-luna-SR2-linux-gtk-x86_64.tar.gz 	

1.1) Install OCL (Object Constraint Language, used for FRM validation):
Help -> Install New Software, Modeling -> OCL Examples and SDK

2.1) Installation via dropins folder
	place all FRM plugins (ccsds.fr.*.jar) in the 'dropins' folder of your eclipse installation. Remove older jars before

2.2) Alternative Installation over local archive
	- Help -> Install New Software
	- Available Software Sites -> Add -> Archive: point to ccsds.fr.feature.zip
	- Select the created software site in 'Work with'
	- Untick 'Group Items by category
	- select 'ccsds.fr.model' and follow the installation wizard

3) Re-start eclipse and create a project (File -> New -> Project -> General -> Project (Modeling Project or General -> Resource))

4) Place the *.frm file in the created project and open it.

5) If it does not open with the tree based editor, right click on ccsds.frm and choose 
Open with -> FunctionalResourceModel Model Editor  


6) Graphical FRM Modelling of Uses relations - Experimental
6.1.1) install Sirius integration with EEF from update site (Help -> Install New Software) Modeling Package Updates for Eclipse Luna - http://www.eclipse.org/modeling/amalgam/downloads/package/modeling/luna/
6.1.2) Switch to the Modeling Perspective: Window -> Open Perspective -> Modeling
6.2) If your project from 5) is not a modelling project convert it to be a Modeling project: right click the project -> Configure -> Convert to Modeling Project 
6.3) Right click the project -> View Point Selection -> Functional Resources.  Your project has now an representation.aird file
6.4) Right click the project -> Create representation. Select Functional Resource Diagram -> Next
6.5) Select the package from the FRM file for which you want to create a diagram
6.6) Populate the diagram by dragging and dropping element from the FRM file on the diagram 
