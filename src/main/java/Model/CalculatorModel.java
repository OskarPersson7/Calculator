package Model;

public class CalculatorModel {
  private int storedValue; //sparas i beräkningen
  private String displayValue = "0"; //det som visas på displayen
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



  void applyCurrentOperator(String nextOp) {

    int displayInt = Integer.parseInt(displayValue);

    if (enteringNewNumber) {
      pendingOperator = nextOp;
      return;
    }

    if (pendingOperator == null) {
      storedValue = displayInt;
      pendingOperator = nextOp;
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

    pendingOperator = nextOp;
    enteringNewNumber = true;

  }

  void clear() {
    storedValue = 0;
    displayValue = "0";
    pendingOperator = null;

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
        storedValue /= displayInt; //eventuellt behöver värdena sparas som double
    }
    displayValue = Integer.toString(storedValue);
    enteringNewNumber = true;

  }

  String getDisplayValue() {
    if (errorFlag) {
      return "Syntax Error";
    } else {
      return this.displayValue;
    }
  }

  public int getStoredValue() {
    return this.storedValue;
  }

  public void setDisplayValue(int n) {
    this.displayValue = Integer.toString(n);
  }

  public void setStoredValue(int n) {
    this.storedValue = n;
  }

  public boolean isEnteringNewNumber() {
    return enteringNewNumber;
  }

  public void setEnteringNewNumber(boolean enteringNewNumber) {
    this.enteringNewNumber = enteringNewNumber;
  }

  public String getPendingOperator() {
    return pendingOperator;
  }

  public void setPendingOperator(String pendingOperator) {
    this.pendingOperator = pendingOperator;
  }
}
