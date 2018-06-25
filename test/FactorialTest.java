import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial0() {
        int N = 0;
        int expected = 1;

        int result = (int) Factorial.factorial(N);
        assertEquals(expected, result);
    }

    @Test
    public void factorial1() {
        int N = 1;
        int expected = 1;

        int result = (int) Factorial.factorial(N);
        assertEquals(expected, result);
    }

    @Test
    public void factorial2() {
        int N = 6;
        int expected = 720;

        int result = (int) Factorial.factorial(N);
        assertEquals(expected, result);
    }
    @Test
    public void factorial3() {
        int N = 5;
        int expected = 120;

        int result = (int) Factorial.factorial(N);
        assertEquals(expected, result);
    }
}