package ar.com.jnm.p04;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;

public class Clock extends JPanel {

  private static final long serialVersionUID = 1L;

  final static int SIZE = 200;

  private SpinnerNumberModel minutes = new SpinnerNumberModel(10, 0, 59, 1);

  private SpinnerNumberModel hours = new SpinnerNumberModel(1, 1, 12, 1);

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    double min = Double.min(getWidth(), getHeight());
    g2.scale(min / SIZE, min / SIZE);

    // Proporciones
    int size1_20 = SIZE / 20;
    int size9_10 = SIZE * 9 / 10;
    int size1_2 = SIZE / 2;
    int size3_10 = SIZE * 3 / 10;
    int size2_5 = SIZE * 2 / 5;

    // Dibujo el circulo del reloj
    g2.drawOval(size1_20, size1_20, size9_10, size9_10);
    // Dibujo la cruz
    g2.drawLine(size1_2, 0, size1_2, SIZE);
    g2.drawLine(0, size1_2, SIZE, size1_2);

    // Dibujo las agujas
    // Horas
    double theta = minutes.getNumber().doubleValue() / 30 * Math.PI + Math.PI / 2;
    double x = size1_2 - size3_10 * Math.cos(theta);
    double y = size1_2 - size3_10 * Math.sin(theta);
    g2.setStroke(new BasicStroke(5));
    g2.drawLine((int) size1_2, (int) size1_2, (int) x, (int) y);
    // Minutos
    theta = hours.getNumber().doubleValue() / 6 * Math.PI + Math.PI / 2;
    x = size1_2 - size2_5 * Math.cos(theta);
    y = size1_2 - size2_5 * Math.sin(theta);
    g2.setStroke(new BasicStroke(3));
    g2.drawLine((int) size1_2, (int) size1_2, (int) x, (int) y);

    g2.dispose();
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(SIZE, SIZE);
  }

  public SpinnerNumberModel getMinutes() {
    return minutes;
  }

  public SpinnerNumberModel getHours() {
    return hours;
  }

}
