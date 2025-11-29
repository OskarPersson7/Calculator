import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCalculator {

  private CalculatorModel calc;

  @BeforeEach
  void setUp() {
    calc = new CalculatorModel();
  }

  @Test
  @DisplayName("Adding two Positive integers")
  void testAddTwoPositives() {
    calc.setStoredValue(4);
    calc.setDisplayValue(3);
    calc.applyOperator("+");
    assertEquals(7,calc.getStoredValue() );

  }


}