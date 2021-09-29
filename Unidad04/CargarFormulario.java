/*
Método para cargar un formulario
*/

	private void cargarFormulario(Class<?> aClass) {
    try {
      // Buscar una instancia
      JInternalFrame view = null;
      for (JInternalFrame frame : desktopPane.getAllFrames()) {
        if (aClass.isInstance(frame)) {
          view = frame;
          break;
        }
      }
      // Crear la instancia
      if (view == null) {
        view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
        desktopPane.add(view);
      }
      // Hacerlo visible
      view.setVisible(true);
      view.setSelected(true);
      view.setMaximum(true);
    } catch (Exception e) {
    }

  }
  
  
/*
La carga del formulario se hace de esta manera.
*/  

cargarFormulario(ProcDepositoView.class);
  