import static org.junit.Assert.*;
import org.junit.*;

public class Demo1Test {
    @Test
    public void testMultiplyInt() {
        assertEquals(8, Demo1.multiplyInt(2, 4));
    }
}
