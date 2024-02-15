import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reversed(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReverseInPlace1() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3, 2, 1 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = { 1, 2, 3 };
    int[] output1 = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[] { 3, 2, 1 }, output1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 6, 7, 8, 10 };
    int[] output1 = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[] { 10, 8, 7, 6 }, output1);
  }
}
