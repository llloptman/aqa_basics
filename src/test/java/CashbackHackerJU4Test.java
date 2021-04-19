import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerJU4Test {
    CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    public void shouldReturn_0() {
        int actual = cashbackHacker.remain(2000);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn_100() {
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn_1000() {
        int actual = cashbackHacker.remain(0);
        int expected = 1000;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldntWorkWithNegative() {
        int actual = cashbackHacker.remain(-100);
        int expected = -1;
        assertEquals(expected,actual);
    }
}