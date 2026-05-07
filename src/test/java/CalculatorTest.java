import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator ;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }


    // void
    @Test
    @DisplayName("Should add two positive numbers correctly ")
    void testAddPositiveNumbers() {
     double result =   calculator.add(5,6);
       assertEquals(11,result);
    }

    @Test
    @DisplayName("Should add two  negative numbers correctly ")
    void  testAddNegativeNumbers() {
        double result =   calculator.add(-5,-3);
        assertEquals(-8,result);

    }

    @Test
    void  testMultiplyPositiveNumbers() {
       double result = calculator.multiply(5,10);
       assertEquals(50,result);
    }

    @Test
    void  testMultiplyNegativeNumbers() {
        double result = calculator.multiply(-5,-10);
        assertEquals(50,result);
    }

    @Test
    void testSubtractPositiveNumbers() {
        double result = calculator.subtract(5,6);
        assertEquals(-1,result);
    }

    @Test
    void testDividePositiveNumbers() {
        double result = calculator.divide(5,10);
        assertEquals(0.5,result);
    }

    @Test
    void testDivideZeroThrowsException() {

        IllegalArgumentException ex =    assertThrows(IllegalArgumentException.class,()->calculator.divide(10,0));

        assertEquals("Division by zero not allowed", ex.getMessage());
    }


    @AfterEach
    void tearDown() {
        calculator = null;
    }
    @Test
   void testEvenNumber(){
        boolean result = calculator.isEven(4);
       boolean result2 = calculator.isEven(5);
       boolean result3 = calculator.isEven(-6);
        assertTrue(result);
        assertFalse(result2);
        assertTrue(result3);
   }
}