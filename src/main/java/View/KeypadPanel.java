package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Set;

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
    Set<String> binaryOps = {"÷", "×", "-", "+"};
    Set<String> unaryOps = {"+/-", "%", "√"};
    Set<String> digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    //iterera över symbolerna och lägg till knappar i panelen
    for (int i = 0; i < buttonValues.length; i++) {
      JButton button = new JButton();
      String buttonValue = buttonValues[i];
      button.setFont(new Font("Arial", Font.PLAIN, 30));
      button.setText(buttonValue);
      keyPadPanel.add(button);

      if (digits.contains(buttonValue)) {
        button.setActionCommand("DIGIT:" + buttonValue);
      } else if (binaryOps.contains(buttonValue)) {
        button.setActionCommand("BINOP:" + buttonValue);
      } else if (unaryOps.contains(buttonValue)) {
        button.setActionCommand("UNOP:" + buttonValue);
      } else {
        button.setActionCommand("ACTION:" + buttonValue);
      }
    }

    //koppla callbacks, använd listeners, använd grupperna

 }

}