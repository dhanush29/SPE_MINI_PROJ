import org.junit.*;

import static org.junit.Assert.*;
public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    //TruePositive
    @Test
    public void test_root1() {
        double actual=calculator.root(9.0);
        double exp=3.0;
        assertEquals(actual,exp, DELTA);
    }
    @Test
    public void test_factorial1() {
        double actual=calculator.factorial(4);
        double exp=24;
        assertEquals(actual,exp, DELTA);
    }
    @Test
    public void test_log1() {
        double actual=calculator.log(145.256);
        double exp=4.978497702968366;
        assertEquals(actual,exp, DELTA);
    }
    @Test
    public void test_power1() {
        double actual=calculator.power(6.0,2.0);
        double exp=36.0;
        assertEquals(actual,exp, DELTA);
    }
    //FalsePositive
    @Test
    public void test_root2() {
        double actual=calculator.root(30.0);
        double exp=4.0;
        assertNotEquals(actual,exp, DELTA);
    }
    @Test
    public void test_fact2() {
        double actual=calculator.factorial(2);
        double exp=120;
        assertNotEquals(actual,exp, DELTA);
    }
    @Test
    public void test_log2() {
        double actual=calculator.log(300);
        double exp=5.799967;
        assertNotEquals(actual,exp, DELTA);
    }
    @Test
    public void test_power2() {
        double actual=calculator.power(3.0,3.0);
        double exp=30.0;
        assertNotEquals(actual,exp, DELTA);
    }

}

