/**
 * Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
The signature of the function is: int f(int n)
 */

 /**
  * Tests
 - 1234 --> 4321
 - 12005 --> 50021
 - 1 --> 1
 - 1000 --> 1
 - 0 --> 0
 - -12345 --> -54321
  */

// steps
// 

public class ReverseWithString {
  public static void main(String[] args) {
    System.out.println(isReversed(1234));
    System.out.println(isReversed(12005));
    System.out.println(isReversed(1));
    System.out.println(isReversed(1000));
    System.out.println(isReversed(0));
    System.out.println(isReversed(-12345));
  }
  public static int isReversed(int num) {
    boolean isNegative = num < 0;
    String numStr = Integer.toString(Math.abs(num));
    StringBuilder reversedStr = new StringBuilder(numStr).reverse();
    int reversedNum = Integer.parseInt(reversedStr.toString());
    return isNegative ? -reversedNum : reversedNum;
  }
}