package powerpackage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assertEquals(1, PowerFinder.of(1, 1));
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assertEquals(2, PowerFinder.of(2, 1));
    }

    @Test
    public void twoPowerTwoIsFour() {
        assertEquals(4, PowerFinder.of(2, 2));
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assertEquals(9, PowerFinder.of(3, 2));
    }
}
