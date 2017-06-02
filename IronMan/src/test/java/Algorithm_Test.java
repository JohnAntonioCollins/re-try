import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author John Antonio Collins
 * Created on 6/2/17.
 */
public class Algorithm_Test
{

    int[] p;
    Algorithm algorithm;

    @Before
    public void setUp()
    {


        algorithm = new Algorithm();
    }

    @Test
    public void powerLevel_Test_start_negative()
    {
        p = new int[]{-1, 4, 2, -3, 5, 10};
        int actual = algorithm.powerLevel(p);
        int expected = 1;
        assertEquals("only needs 1 unit of power to start", expected, actual);
    }

    @Test
    public void powerLevel_Test_no_power_needed()
    {
        p = new int[]{1, 4, 2, -3, 5, 10};
        int actual = algorithm.powerLevel(p);
        int expected = 0;
        assertEquals("needs no power to start", expected, actual);
    }

    @Test
    public void powerLevel_Test_add_power_in_middle()
    {
        p = new int[]{0, 0, 0, -3, 5, 10};
        int actual = algorithm.powerLevel(p);
        int expected = 3;
        assertEquals("needs 3 units of power mid-game", expected, actual);
    }

    @Test
    public void powerLevel_Test_add_power_at_end()
    {
        p = new int[]{0, 0, 0, 0, 0, -10};
        int actual = algorithm.powerLevel(p);
        int expected = 10;
        assertEquals("needs 10 units of power at last battle", expected, actual);
    }

    @Test
    public void powerLevel_Test_all_zeros()
    {
        p = new int[]{0, 0, 0, 0, 0, 0};
        int actual = algorithm.powerLevel(p);
        int expected = 0;
        assertEquals("needs 0 units of power, no battles or power-ups", expected, actual);
    }

    @Test
    public void powerLevel_Test_all_negatives()
    {
        p = new int[]{-1, -9, -4, -3, -5, -10};
        int actual = algorithm.powerLevel(p);
        int expected = 32;
        assertEquals("needs 32 units of power, all battles", expected, actual);
    }

}
