package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display result after adding two positive numbers")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }

    @Test
    @DisplayName("should display result 0 after pressing the clear key")
    void calculatorCanDoClear() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("x");
        calc.pressDigitKey(5);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after pressing a dezimal number")
    void calculatorCanDoDotKey() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(0);
        calc.pressDotKey();
        calc.pressDigitKey(1);
        assertEquals("0.1", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after pressing a negative number")
    void calculatorCanDoNegative() {
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(5);
        assertEquals("-5", calc.readScreen());
    }



}
