import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AAAPatternTest {

    private int number;

    @Before
    public void setUp() {
        // Setup
        number = 14;
        System.out.println("Setup executed");
    }

    @After
    public void tearDown() {
        // Teardown
        System.out.println("Teardown executed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int value = number;

        // Act
        int result = value + 3;

        // Assert
        assertEquals(20, result);
    }
}
