package View;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel {

  private JPanel panel;
  private JLabel display;

  public DisplayPanel() {
    panel = new JPanel();
    panel.setLayout(new BorderLayout());

    display = new JLabel("0");
    panel.add(display);
    display.setHorizontalAlignment(JLabel.RIGHT);

  }

  public void setText(String displayText) {
    display.setText(displayText);
  }




}