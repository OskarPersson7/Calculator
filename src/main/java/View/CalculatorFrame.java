package View;

import javax.swing.*;

public class CalculatorFrame {
  private int boardWidth = 360;
  private int boardWidth = 540;

  JFrame frame;
  DisplayPanel displayPanel;

  public CalculatorFrame() {
    frame = new JFrame("Calculator");
    frame.setVisible(true);
    displayPanel = new DisplayPanel();
    frame.getContentPane().add(displayPanel);
  }



}