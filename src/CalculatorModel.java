public class CalculatorModel {
  private int storedValue; //sparas i beräkningen
  private String displayValue; //det som visas på displayen
  String pendingOperator;

  boolean enteringNewNumber; //avgör om nästa tal ska skriva över eller adderas till display
  boolean errorFlag;

  public CalculatorModel() {
    enteringNewNumber = true;
  }

  void inputDigit(int digit) {
    if (enteringNewNumber) {
      displayValue = Integer.toString(digit);
      enteringNewNumber = false;
    } else {
      displayValue += Integer.toString(digit);
    }
  }

  void applyOperator(String op) {
    //ska ta in och använda operator
    int displayInt = Integer.parseInt(displayValue);

    if (storedValue == 0) {
      storedValue = displayInt;
      enteringNewNumber = true;
      pendingOperator = op;
      return;
    }

    if (pendingOperator == null) {
      storedValue = displayInt;
      pendingOperator = op;
      enteringNewNumber = true;
      return;
    }
    if (pendingOperator.equals("/") && displayValue.equals("0")) {
      errorFlag = true;
      return;
    }
    switch(pendingOperator) {
      case "+":
        storedValue += displayInt;
        break;
      case "-":
        storedValue -= displayInt;
        break;
      case "*":
        storedValue *= displayInt;
        break;
      case "/":
        storedValue /= displayInt;
    }

    pendingOperator = op;
    enteringNewNumber = true;

  }

  void clear() {

  }

  void equals() {
    int displayInt = Integer.parseInt(displayValue);

    if (pendingOperator == null) {
      enteringNewNumber = true;
      return;
    }
    if (pendingOperator.equals("/") && displayValue.equals("0")) {
      errorFlag = true;
      return;
    }
    switch(pendingOperator) {
      case "+":
        storedValue += displayInt;
        break;
      case "-":
        storedValue -= displayInt;
        break;
      case "*":
        storedValue *= displayInt;
        break;
      case "/":
        storedValue /= displayInt;
    }
    displayValue = Integer.toString(storedValue);
    enteringNewNumber = true;

  }

  String getDisplay() {
    if (errorFlag) {
      return "Syntax Error";
    }
    return displayValue;
  }

}
