package ar.com.jnm.controller;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import ar.com.jnm.view.AddTutorshipView;

public class Application {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Application::run);
  }

  public static void run() {
    JFrame frame = new JFrame("Tutorship");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    AddTutorshipController controller = new AddTutorshipController();
    AddTutorshipView view = new AddTutorshipView();
    view.addListener(controller);
    frame.add(view);

    // Para setear valores iniciales
    // view.getViewModel().getTutorViewModel().setPersonName("Juan Perez");
    // Para deshabilitar la edición
    // view.setEnabled(false);

    frame.pack();
    frame.setVisible(true);
  }
}
