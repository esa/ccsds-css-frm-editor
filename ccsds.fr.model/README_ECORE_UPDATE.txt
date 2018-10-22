If the ecore model is updated:
- reload the genmodel and generate the model code
- initialise the EEF models from the genmodel (without deleting them)
- use the eefgen to Generate the EEF architecture. It might be necessary to delete the generated code for elements removed from the ecore (TBC)
- Recover the custom OID editor control:
	checkout OidPropertiesEditionPartForm and OidPropertiesEditionPartImpl, not all user code sections are preserved
	TODO: find a way to make this user code surviving the code generation