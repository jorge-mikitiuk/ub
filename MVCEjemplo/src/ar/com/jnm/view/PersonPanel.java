package ar.com.jnm.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ar.com.jnm.view.model.IPersonViewModel;

public class PersonPanel extends JPanel implements IPersonViewModel {

  private static final long serialVersionUID = 8045145841728443575L;

  private JTextField nameField;

  private JTextField ageField;

  public PersonPanel() {
    addComponents();
    addLayout();
  }

  private void addLayout() {
    setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.insets = new Insets(3, 5, 3, 5);
    constraints.anchor = GridBagConstraints.LINE_START;
    constraints.gridx = 0;
    constraints.gridy = 0;
    add(new JLabel("Nombre"), constraints);
    constraints.gridx = 1;
    add(getNameField(), constraints);
    constraints.gridy = 1;
    constraints.gridx = 0;
    add(new JLabel("Edad"), constraints);
    constraints.gridx = 1;
    add(getAgeField(), constraints);
  }

  private void addComponents() {
    setNameField(new JTextField(30));
    setAgeField(new JTextField(3));
  }

  @Override
  public int getAge() {
    return Integer.parseInt(getAgeField().getText());
  }

  @Override
  public void setAge(int age) {
    getAgeField().setText(Integer.toString(age));
  }

  @Override
  public String getPersonName() {
    return getNameField().getText();
  }

  @Override
  public void setPersonName(String name) {
    getNameField().setText(name);
  }

  private JTextField getNameField() {
    return nameField;
  }

  private void setNameField(JTextField nameField) {
    this.nameField = nameField;
  }

  private JTextField getAgeField() {
    return ageField;
  }

  private void setAgeField(JTextField ageField) {
    this.ageField = ageField;
  }

  @Override
  public void setEnabled(boolean enabled) {
    getNameField().setEnabled(enabled);
    getAgeField().setEnabled(enabled);
  }
}
