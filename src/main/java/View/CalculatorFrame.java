package View;

import Model.CalculatorModel;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame {
  private int boardWidth = 360;
  private int boardWidth = 540;

  private JFrame frame;
  private DisplayPanel displayPanel;
  private CalculatorModel model;

  public CalculatorFrame() {
    frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    displayPanel = new DisplayPanel();
    frame.getContentPane().add(displayPanel, BorderLayout.NORTH);
    displayPanel.setText("0");

    frame.pack();  //testa att kommentera ut dehär
    frame.setVisible(true);
  }



}