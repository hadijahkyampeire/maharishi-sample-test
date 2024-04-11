/* 
An array with an odd number of elements is said to be centered if all elements (except the middle one) 
are strictly greater than the value of the middle element. 
Note that only arrays with an odd number of elements have a middle element. 
Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0. 
*/

/**
 * Testing
- {1, 2, 3, 4, 5} ==> 0
- {3, 2, 1, 4, 5} ==> 1
- {} ==> 0
- {10} ==> 1
- {3, 2, 1, 4, 1} ==> 0
- {1, 2, 3, 4} ==> 0
 */

// Exclude empty array and even size array
// If size is one 

public class IsCentered {
  public static void main(String[] arg) {
    int[] arr1 = {5, 3, 3, 4, 5};
    int[] arr2 = {3, 2, 1, 4, 5};
    int[] arr3 = {3, 2, 1, 4, 1};

    int[] arr4 = {3, 2, 1, 1, 4, 6};
    int[] arr5 = {};
    int[] arr6 = {10};

    System.out.println(isCentered(arr1)); // Output: 0
    System.out.println(isCentered(arr2)); // Output: 1
    System.out.println(isCentered(arr3)); // Output: 0


    System.out.println(isCentered(arr4)); // Output: 0
    System.out.println(isCentered(arr5)); // Output: 0
    System.out.println(isCentered(arr6)); // Output: 1

  }
    public static int isCentered(int[] arr) {
      if (arr.length == 0 || arr.length % 2 == 0) return 0;

      if (arr.length == 1) return 1;

      int centeredIndex = arr.length / 2;
      int centeredNumber = arr[centeredIndex];

      for(int i = 0; i < arr.length; i++) {
        if (i != centeredIndex) {
          if (centeredNumber >= arr[i]) {
            return 0;
          }
        }
      }
      return 1;
    }
}