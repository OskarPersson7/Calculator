package View;

import javax.swing.*;
import java.awt.*;

public class KeypadPanel extends JPanel {

  private JPanel keyPadPanel;

  public KeypadPanel() {
    keyPadPanel.setLayout(new GridLayout(5,4));

    //Detta bör definitvt refaktoriseras
    keyPadPanel.add(new JButton("AC"));
    keyPadPanel.add(new JButton("+/-"));
    keyPadPanel.add(new JButton("%"));
    keyPadPanel.add(new JButton("÷"));
    keyPadPanel.add(new JButton("7"));
    keyPadPanel.add(new JButton("8"));
    keyPadPanel.add(new JButton("9"));
    keyPadPanel.add(new JButton("X"));
    keyPadPanel.add(new JButton("4"));
    keyPadPanel.add(new JButton("5"));
    keyPadPanel.add(new JButton("6"));
    keyPadPanel.add(new JButton("-"));
    keyPadPanel.add(new JButton("1"));
    keyPadPanel.add(new JButton("2"));
    keyPadPanel.add(new JButton("3"));
    keyPadPanel.add(new JButton("+"));
    keyPadPanel.add(new JButton("0"));
    keyPadPanel.add(new JButton("-"));
    keyPadPanel.add(new JButton("√"));
    keyPadPanel.add(new JButton("="));

  //gör en lista med Jbuttons som går att iterera

  // dela in knappar i 3 grupper

  //koppla callbacks

 }

}