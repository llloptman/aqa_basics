import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    public void shouldReturn_0() {
        int actual = cashbackHacker.remain(2000);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturn_100() {
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturn_1000() {
        int actual = cashbackHacker.remain(0);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldntWorkWithNegative() {
        int actual = cashbackHacker.remain(-100);
        int expected = -1;
        assertEquals(actual,expected);
    }
}