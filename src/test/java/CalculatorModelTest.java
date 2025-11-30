import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {

  private CalculatorModel calc;

  @BeforeEach
  void setUp() {
    calc = new CalculatorModel();
    calc.enteringNewNumber = false;
  }

  @Test
  @DisplayName("Adding two positive integers")
  void testAddTwoPositives() {
    calc.pendingOperator = "+";
    calc.setStoredValue(4);
    calc.setDisplayValue(3);
    calc.applyCurrentOperator("+");

    assertEquals(7,calc.getStoredValue());
  }

  @Test
  @DisplayName("Adding negative and positive integer")
  void testAddNegativeAndPositive() {
    calc.pendingOperator = "+";
    calc.setStoredValue(-4);
    calc.setDisplayValue(3);
    calc.applyCurrentOperator("+");

    assertEquals(-1,calc.getStoredValue());
  }

  @Test
  @DisplayName("Subtracting two positive integers")
  void testSubtractTwoPositives() {
    calc.pendingOperator = "-";
    calc.setStoredValue(4);
    calc.setDisplayValue(3);
    calc.applyCurrentOperator("+");

    assertEquals(1,calc.getStoredValue());
  }

  @Test
  @DisplayName("Subtracting positive with negative integer")
  void testSubtractPositiveWithNegative() {
    calc.pendingOperator = "-";
    calc.setStoredValue(4);
    calc.setDisplayValue(-3);
    calc.applyCurrentOperator("+");

    assertEquals(7,calc.getStoredValue());
  }

  @Test
  @DisplayName("Multiplying two positive integers")
  void testMultiplyTwoPositives() {
    calc.pendingOperator = "*";
    calc.setStoredValue(4);
    calc.setDisplayValue(3);
    calc.applyCurrentOperator("+");

    assertEquals(12, calc.getStoredValue());
  }

  @Test
  @DisplayName("Dividing two positive, divisible, integers")
  void testDivideWithDivisible() {
    calc.pendingOperator = "/";
    calc.setStoredValue(12);
    calc.setDisplayValue(3);
    calc.applyCurrentOperator("+");

    assertEquals(4, calc.getStoredValue());
  }

  @Test
  @DisplayName("Dividing with zero")
  void testDivideWithZero() {
    calc.pendingOperator = "/";
    calc.setStoredValue(12);
    calc.setDisplayValue(0);
    calc.applyCurrentOperator("+");

    assertTrue(calc.errorFlag);
  }

  // behöver fixa double-hantering senare för detta
  @Test
  @DisplayName("Dividing with non-divisor")
  void testDivideWithNonDivisor() {
    calc.pendingOperator = "/";
    calc.setStoredValue(4);
    calc.setDisplayValue(3);
    calc.applyCurrentOperator("-");

    assertEquals(1, calc.getStoredValue());
  }


}