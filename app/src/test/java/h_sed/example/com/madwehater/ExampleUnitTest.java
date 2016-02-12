package h_sed.example.com.madwehater;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void geoLocation_isCorrect() throws Exception {
        double actual = -33.8650;
        double expected = -33.8650;
        assertEquals("A simple test to get the geo location", expected, actual, 0.100);
    }

}