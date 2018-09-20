package ar.com.jnm;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import ar.com.jnm.controller.AddTutorshipController;
import ar.com.jnm.dto.TutorshipDTO;
import ar.com.jnm.dto.adapters.TutorshipDTOAdapter;
import ar.com.jnm.services.TutorshipService;
import ar.com.jnm.view.AddTutorshipView;

public class Application {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Application::run);
  }

  public static void run() {
    JFrame frame = new JFrame("Tutorship");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TutorshipDTO dto = new TutorshipDTO();
    AddTutorshipController controller = new AddTutorshipController(dto, new TutorshipService());

    AddTutorshipView view = new AddTutorshipView();
    view.setViewModel(new TutorshipDTOAdapter(dto));
    view.addActionListener(controller);
    frame.add(view);

    // Para setear valores iniciales
    view.getViewModel().getTutorViewModel().setName("Juan Perez");
    view.fireViewModelChanged();
    // Para deshabilitar la edición
    // view.setEnabled(false);

    frame.pack();
    frame.setVisible(true);
  }
}
