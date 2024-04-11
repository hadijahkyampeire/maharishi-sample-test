/**
 * Consider an array A with n of positive integers. An integer idx is called a POE (point of equilibrium) of A, 
 * if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1]. 
 * Write a function to return POE of an array, if it exists and -1 otherwise. 
The signature of the function is:
int f(int[] a)
 */

 /**
  * Tests
  - {1, 8, 3, 7, 10, 2} --> 3 Reason: a[0] + a[1] + a[2] is equal to a[4] + a[5]
  - {1, 5, 3, 1, 1, 1, 1, 1, 1} --> 2 Reason: a[0] + a[1] is equal to a[3] + a[4] + a[5] + a[6] + a[7] + a[8]
  - {2, 1, 1, 1, 2, 1, 7} --> 5 Reason: a[0] + a[1] + a[2] + a[3] + a[4] is equal to a[6]
  - {1, 2, 3} --> -1 Reason: No POE.
  - {3, 4, 5, 10} --> -1 No POE
  - {1, 2, 10, 3, 4} --> -1
  */

// steps
// If array.length <= 3 return -1 because no index can be added to another and leave a POE

public class PointOfEquilibrium {
  public static void main(String[] arg) {
    int[] arr1 = {1, 8, 3, 7, 10, 2};
    int[] arr2 = {1, 5, 3, 1, 1, 1, 1, 1, 1};
    int[] arr3 = {2, 1, 1, 1, 2, 1, 7};
    int[] arr4 = {1, 2, 3};
    int[] arr5 = {3, 4, 5, 10};
    int[] arr6 = {1, 2, 10, 3, 4};
  

    System.out.println(isPointOfEquilibrium(arr1)); // Output: 3
    System.out.println(isPointOfEquilibrium(arr2)); // Output: 2
    System.out.println(isPointOfEquilibrium(arr3)); // Output: 5
    System.out.println(isPointOfEquilibrium(arr4)); // Output: -1
    System.out.println(isPointOfEquilibrium(arr5)); // Output: -1
    System.out.println(isPointOfEquilibrium(arr6)); // Output: -1


  }
    public static int isPointOfEquilibrium(int[] arr) {
      int poeIndex = -1;

      int totalSum = 0;
      for(int num: arr) {
        totalSum +=num;
      }

      int leftSum = 0;
      for(int i=0; i < arr.length; i++) {
        int rightSum = totalSum - leftSum - arr[i];
        if(leftSum == rightSum) {
          poeIndex = i;
          break;
        }
        leftSum +=arr[i];
      }
      return poeIndex;
    }
}