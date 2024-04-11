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
// First rule out zero
// 
// Initiate reverse to be zero
// Loop through the numbers in a while loop
// initiate a digit to always be the current number % 10 --> that gives us the remainder
// Multiply the reversedNum by 10 and add the result from above i.e the reminder

public class ReverseWithInt {
  public static void main(String[] args) {
    System.out.println(isReversed(1234)); 
    System.out.println(isReversed(12005));
    System.out.println(isReversed(1));
    System.out.println(isReversed(1000));
    System.out.println(isReversed(0));
    System.out.println(isReversed(-12345));
  }
   public static int isReversed(int num) {
      int sign = num < 0 ? -1 : 1;
      if(num == 0) return 0;
      num = Math.abs(num);
      int reversedNum = 0;
      while(num != 0) {
        int digit = num % 10;
        reversedNum = reversedNum * 10 + digit;
        num = num / 10;
      }
      return reversedNum * sign;
   }
   // check 4 -> 43 --> 432 --> 4321
}