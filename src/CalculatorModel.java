public class CalculatorModel {
  private int currentValue;
  private int storedValue;
  char pendingOperator;

  boolean enteringNewNumber;
  boolean errorFlag;

  public CalculatorModel() {
    enteringNewNumber = true;
  }

  void inputDigit(char digit) {
    if ()

  }

  void applyOperator(char op) {
    //ska ta in och använda operator
    if (pendingOperator == '/' && currentValue == 0) {
      errorFlag = true;
    }
      storedValue = storedValue (pendingOp) currentValue;
    pendingOperator = op;

  }

  void clear() {
    //resettar det mesta
  }

  void equals() {
    //beräknar värde
  }

  String getDisplay() {
    if (errorFlag) {
      return "Syntax Error";
    }

    return "implement";
  }

}
