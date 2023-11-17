import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  // @Test
  // public void testReversed() {
  //   int[] input1 = { };
  //   assertArrayEquals(new int[]{ }, Array.reversed(input1));
  
  //   int[] input2 = { 1, 2, 3 };
  //   assertArrayEquals(new int[]{ 3, 2, 1 }, Array.reversed(input2));
  // }
  @Test
  public void testReversed() {
      int[] input2 = { 1, 2, 3 };
      assertArrayEquals(new int[]{ 3, 2, 1 }, Array.reversed(input2));
  }

  @Test
  public void testReversed2() {
      int[] input1 = { };
      assertArrayEquals(new int[]{ }, Array.reversed(input1));
  }
}