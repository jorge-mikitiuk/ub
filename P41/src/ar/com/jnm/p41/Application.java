package ar.com.jnm.p41;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;

public class Application {

  public static void main(String[] args) throws IOException {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(new GridBagLayout());

    Map<String, List<Producto>> elements = new HashMap<>();
    //
    List<Producto> list = new ArrayList<>();
    list.add(new Producto("Leche", 28.0f));
    list.add(new Producto("Yoghurt", 25.0f));
    list.add(new Producto("Crema", 54.5f));
    elements.put("LACTEOS", list);
    list = new ArrayList<>();
    list.add(new Producto("Asado", 185f));
    list.add(new Producto("Vacio", 220f));
    list.add(new Producto("Nalga", 205f));
    elements.put("CARNES", list);
    //

    JComboBox<String> typeSelector = new JComboBox<>(elements.keySet().toArray(new String[elements.size()]));
    GridBagConstraints constraints = new GridBagConstraints(0, 0, 1, 5, 4, 1, GridBagConstraints.CENTER,
        GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0);
    panel.add(typeSelector, constraints);
    ElementModel elementsModel = new ElementModel(elements);
    JList<Producto> elementsSelector = new JList<>(elementsModel);
    elementsSelector.setCellRenderer(new ListCellRenderer<Producto>() {

      @Override
      public Component getListCellRendererComponent(JList<? extends Producto> list, Producto value, int index,
          boolean isSelected, boolean cellHasFocus) {
        JLabel label = new JLabel(value.getName());
        label.setOpaque(true);
        label.setBackground(cellHasFocus ? Color.GREEN.brighter() : Color.WHITE);
        return label;
      }
    });

    constraints.gridx = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panel.add(elementsSelector, constraints);

    typeSelector.addActionListener(e -> {
      elementsModel.setCurrentList(typeSelector.getSelectedItem().toString());
    });

    SelectionModel selectionModel = new SelectionModel();

    JButton add = new JButton(">");
    JButton remove = new JButton("<");
    JTextField quantity = new JTextField(5);
    add.addActionListener(e -> {
      String q = quantity.getText().trim();
      selectionModel
          .addElement(new Item(elementsSelector.getSelectedValue(), q.isEmpty() ? 1 : Integer.parseInt(q)));
      quantity.setText("");
    });

    constraints.gridx = 2;
    constraints.gridheight = 1;
    constraints.fill = GridBagConstraints.VERTICAL;
    constraints.weighty = 1;
    constraints.weightx = 0;
    constraints.gridy = 0;
    panel.add(new JLabel(), constraints);
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weighty = 0;
    constraints.gridy = 1;
    panel.add(add, constraints);
    constraints.gridy = 2;
    panel.add(remove, constraints);
    constraints.gridy = 3;
    panel.add(quantity, constraints);
    constraints.fill = GridBagConstraints.VERTICAL;
    constraints.gridy = 4;
    constraints.weighty = 1;
    panel.add(new JLabel(""), constraints);
    constraints.gridy = 0;
    constraints.ipady = 5;
    constraints.weighty = 1;

    JList<String> selected = new JList<>(selectionModel);
    constraints.weightx = 4;
    selected.setVisibleRowCount(4);
    constraints.gridheight = 5;
    constraints.gridx = 3;
    constraints.fill = GridBagConstraints.BOTH;
    panel.add(selected, constraints);

    remove.addActionListener(e -> {
      selectionModel.removeElement(selected.getSelectedValue().split(":")[0]);
    });

    frame.add(panel, BorderLayout.CENTER);

    JPanel bar = new JPanel();
    bar.setLayout(new GridBagLayout());
    constraints = new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER,
        GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0);
    bar.add(new JLabel("Total a pagar"), constraints);
    constraints.gridx = 2;
    JButton finish = new JButton("Calcular");
    bar.add(finish, constraints);
    constraints.gridx = 3;
    bar.add(new JLabel("$"), constraints);
    constraints.gridx = 4;
    JLabel value = new JLabel("        ");

    bar.add(value, constraints);

    finish.addActionListener(e -> {
      float total = 0;
      for (Item item : selectionModel.getElements().values()) {
        total += item.getProduct().getPrice() * item.getQuantity();
      }
      value.setText(String.format("%.2f", total));
      value.setForeground(total < 1000 ? Color.GREEN : Color.RED);
    });

    frame.add(bar, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
    typeSelector.setSelectedIndex(0);
  }

  public void readElements() throws IOException {
    for (String line : Files.readAllLines(Paths.get("productos.txt"))) {
      String[] split = line.split("\\|");
      String type = split[0].trim();
      String name = split[1].trim();
      float value = Float.parseFloat(split[2].trim());

      System.out.printf("%1s -> %2s: $%3.2f\n", type, name, value);
    }

  }

}
