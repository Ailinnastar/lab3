import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

class SMytringChecker implements StringChecker {
    public boolean checkString(String s) {
        return (s instanceof String);
    }
}

public class ListTests {
    @Test
    public void filterTest1() {
        List<String> list = Arrays.asList("A", "B", "C");
        SMytringChecker sc = new SMytringChecker();
        List<String> result = ListExamples.filter(list, sc);

        System.out.println(result.toArray()[1]);
        assertEquals("A", result.toArray()[2]);
        assertArrayEquals(list.toArray(), result.toArray());

    }
}
