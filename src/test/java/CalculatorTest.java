
import org.junit.jupiter.api.*;


class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
     calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void addition() {
        double answer = calculator.addition(2,2);
        Assertions.assertEquals(4,answer);
    }

    @Test
    void subtraction() {
        double answer = calculator.subtraction(5,2);
        Assertions.assertEquals(3,answer);
    }

    @Test
    void multiplication() {
        double answer = calculator.multiplication(10,2);
        Assertions.assertEquals(20,answer);
    }

    @Test
    void divided() {
        double answer = calculator.divided(100,2);
        Assertions.assertEquals(50,answer);
    }

}