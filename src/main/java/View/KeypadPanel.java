package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class KeypadPanel extends JPanel {

  private JPanel keyPadPanel;

  public KeypadPanel() {
    keyPadPanel.setLayout(new GridLayout(5,4));


    //gör en array med Strängrepresentationer som går att iterera
    String[] buttonValues = {
        "AC", "+/-", "%", "÷",
        "7", "8", "9", "×",
        "4", "5", "6", "-",
        "1", "2", "3", "+",
        "0", ".", "√", "="
    };

    // dela in symboler i grupper
    String[] rightSymbols = {"÷", "×", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

    //iterera över symbolerna och lägg till knappar i panelen

    //koppla callbacks

 }

}