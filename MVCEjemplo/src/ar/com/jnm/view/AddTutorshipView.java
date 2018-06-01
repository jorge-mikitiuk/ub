package ar.com.jnm.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JPanel;

import ar.com.jnm.view.model.ITutorshipViewModel;

public class AddTutorshipView extends JPanel {

  private static final long serialVersionUID = -4218949585468590991L;

  private TutorshipPanel tutorshipPanel;

  private JButton addButton;

  private Collection<ITutorshipListener> listeners;

  public AddTutorshipView() {
    setListeners(new HashSet<>());
    addComponents();
    addLayout();
  }

  private void addLayout() {
    setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.insets = new Insets(5, 5, 5, 5);
    constraints.gridx = 0;
    constraints.gridy = 0;
    add(getTutorshipPanel(), constraints);
    constraints.gridy = 1;
    add(getAddButton(), constraints);
  }

  private void addComponents() {
    setTutorshipPanel(new TutorshipPanel());
    JButton button = new JButton("Crear");
    button.addActionListener(this::notify);
    setAddButton(button);
  }

  private void notify(ActionEvent event) {
    for (ITutorshipListener listener : getListeners())
      listener.actionPerformed(getTutorshipPanel());
  }

  private TutorshipPanel getTutorshipPanel() {
    return tutorshipPanel;
  }

  public ITutorshipViewModel getViewModel() {
    return getTutorshipPanel();
  }

  private void setTutorshipPanel(TutorshipPanel tutorshipPanel) {
    this.tutorshipPanel = tutorshipPanel;
  }

  private JButton getAddButton() {
    return addButton;
  }

  private void setAddButton(JButton addButton) {
    this.addButton = addButton;
  }

  private Collection<ITutorshipListener> getListeners() {
    return listeners;
  }

  private void setListeners(Collection<ITutorshipListener> listeners) {
    this.listeners = listeners;
  }

  public void addListener(ITutorshipListener listener) {
    getListeners().add(listener);
  }

  public void removeListener(ITutorshipListener listener) {
    getListeners().remove(listener);
  }

  @Override
  public void setEnabled(boolean enabled) {
    getTutorshipPanel().setEnabled(enabled);
    getAddButton().setEnabled(enabled);
  }
}
