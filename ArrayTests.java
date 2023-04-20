import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
// new tests
  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1, 2, 3 }, input1);
	}

  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2 };
    assertArrayEquals(new int[]{ 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] test = {1.0, 2.0, 3.0, 4.0};
    boolean result = 3.0 == ArrayExamples.averageWithoutLowest(test);
    assertEquals(true, result);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] test = {1.0, 2.0, 3.0, 4.0, 3.0};
    boolean result = 3.0 == ArrayExamples.averageWithoutLowest(test);
    assertEquals(true, result);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] test = {};
    boolean result = 0.0 == ArrayExamples.averageWithoutLowest(test);
    assertEquals(true, result);
  }

  @Test
  public void testAverageWithoutLowest4() {
    double[] test = {1.0, 1.0, 1.0};
    boolean result = 1.0 == ArrayExamples.averageWithoutLowest(test);
    assertEquals(true, result);
  }

}
