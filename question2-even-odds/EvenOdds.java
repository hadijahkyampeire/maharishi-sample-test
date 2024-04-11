/**
 * Write a function that takes an array of integers as an argument and 
 * returns a value based on the sums of the even and odd numbers in the array. 
 * Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers. 
 * The function should return X – Y
 */

 /**
  * Testing output
  - {1} --> 1
  - {1, 2} --> -1
  - {1, 2, 3} --> 2
  - {1, 2, 3, 4} --> -2
  - {3, 3, 4, 4} --> -2
  - {3, 2, 3, 4} --> 0
  - {4, 1, 2, 3} --> -2
  - {1, 1} --> 2
  - {} --> 0
  */

// Steps
// X = Get sums of odd numbers
// Y = Get sums of even numbers
// Return X - Y

public class EvenOdds {
  public static void main(String[] arg) {
    int[] arr1 = {1};
    int[] arr2 = {1, 2};
    int[] arr3 = {1, 2, 3};

    int[] arr4 = {1, 2, 3, 4};
    int[] arr5 = {3, 3, 4, 4};
    int[] arr6 = {3, 2, 3, 4};
    int[] arr7 = {4, 1, 2, 3};
    int[] arr8 = {1, 1};
    int[] arr9 = {};

    System.out.println(evenOdds(arr1)); // Output: 1
    System.out.println(evenOdds(arr2)); // Output: -1
    System.out.println(evenOdds(arr3)); // Output: 2
    System.out.println(evenOdds(arr4)); // Output: -2
    System.out.println(evenOdds(arr5)); // Output: -2
    System.out.println(evenOdds(arr6)); // Output: 0
    System.out.println(evenOdds(arr7)); // Output: -2
    System.out.println(evenOdds(arr8)); // Output: 2
    System.out.println(evenOdds(arr9)); // Output: 0

  }
    public static int evenOdds(int[] arr) {
      int Y = 0;
      int X = 0;
      if (arr.length == 0) return 0;

      for(int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
          Y += arr[i];
        } else {
          X += arr[i];
        }
      }

      return X - Y;
    }
}
