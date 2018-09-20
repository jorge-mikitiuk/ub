package ar.com.jnm.p04;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Application {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Clock clock = new Clock();
    frame.add(clock, BorderLayout.CENTER);
    Box controls = Box.createHorizontalBox();
    controls.add(new JLabel("Horas"));
    JSpinner hours = new JSpinner(clock.getHours());
    controls.add(hours);
    controls.add(new JLabel("Minutos"));
    JSpinner minutes = new JSpinner(clock.getMinutes());
    controls.add(minutes);
    controls.add(Box.createGlue());

    ChangeListener listener = new ChangeListener() {

      @Override
      public void stateChanged(ChangeEvent e) {
        clock.repaint();
      }
    };
    minutes.addChangeListener(listener);
    hours.addChangeListener(listener);

    frame.add(controls, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
  }
}
