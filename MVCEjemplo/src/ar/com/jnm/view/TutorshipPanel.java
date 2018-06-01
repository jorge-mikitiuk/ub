package ar.com.jnm.view;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ar.com.jnm.view.model.IPersonViewModel;
import ar.com.jnm.view.model.ITutorshipViewModel;

public class TutorshipPanel extends JPanel implements ITutorshipViewModel {

  private static final long serialVersionUID = -5520614884933321098L;

  private PersonPanel tutorPanel;

  private PersonPanel studentPanel;

  public TutorshipPanel() {
    addComponents();
    addLayout();
  }

  private void addLayout() {
    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    add(new JLabel("Tutor"));
    add(getTutorPanel());
    add(new JLabel("Estudiante"));
    add(getStudentPanel());
  }

  private void addComponents() {
    setTutorPanel(new PersonPanel());
    setStudentPanel(new PersonPanel());
  }

  @Override
  public IPersonViewModel getTutorViewModel() {
    return getTutorPanel();
  }

  @Override
  public IPersonViewModel getStudentViewModel() {
    return getStudentPanel();
  }

  @Override
  public void setTutorViewModel(IPersonViewModel tutorViewModel) {
    chargeModel(getTutorPanel(), tutorViewModel);
  }

  private static void chargeModel(PersonPanel panel, IPersonViewModel viewModel) {
    panel.setName(viewModel.getPersonName());
    panel.setAge(viewModel.getAge());
  }

  @Override
  public void setStudentViewModel(IPersonViewModel studentViewModel) {
    chargeModel(getStudentPanel(), studentViewModel);
  }

  private PersonPanel getTutorPanel() {
    return tutorPanel;
  }

  private void setTutorPanel(PersonPanel tutorPanel) {
    this.tutorPanel = tutorPanel;
  }

  private PersonPanel getStudentPanel() {
    return studentPanel;
  }

  private void setStudentPanel(PersonPanel studentPanel) {
    this.studentPanel = studentPanel;
  }

  @Override
  public void setEnabled(boolean enabled) {
    getTutorPanel().setEnabled(enabled);
    getStudentPanel().setEnabled(enabled);
  }
}
