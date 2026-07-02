import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ApplicationTest {
    @Test
    public void testMultiplication() {
        MultiplicationApp app = new MultiplicationApp();
        assertEquals(5, app.multiply(2, 3));
    }
}
