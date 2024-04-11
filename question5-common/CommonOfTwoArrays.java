/**
 * Write a function to return an array containing all elements common to two given arrays containing distinct positive integers. You should not use any inbuilt methods. You are allowed to use any number of arrays.
The signature of the function is:
int[] f(int[] first, int[] second)
 */

 /**
  * Test output
  - {1, 8, 3, 2}, {4, 2, 6, 1} --> {1, 2}
  - {1, 8, 3, 2, 6}, {2, 6, 1} --> {1, 2, 6}
  - {1, 2}, {3, 4} --> {}
  - {1, 2}, {} --> {}
  - {1, 2}, null --> null
  - null, {} --> null
  - null, null --> null
  */

 // steps
 // First return null where any array is null
 // Return an empty array if any one of the arrays is empty

 public class CommonOfTwoArrays {
  public static void main(String[] arg) {
    int[] arr11 = {1, 8, 3, 2};
    int[] arr12 = {4, 2, 6, 1};
    int[] arr21 = {1, 8, 3, 2, 6};

    int[] arr22 = {2, 6, 1};
    int[] arr31 = {1, 2};
    int[] arr32 = {3, 4};
    int[] arr41 = {1, 2};
    int[] arr42 = {};
    int[] arr51 = {1, 2};
    int[] arr52 = null;
    int[] arr61 = null;
    int[] arr62 = {};

    printArray(commonElements(arr11, arr12)); // Output: {1, 2}
    printArray(commonElements(arr21, arr22)); // Output: {1, 2, 6}
    printArray(commonElements(arr31, arr32)); // Output: {}
    printArray(commonElements(arr41, arr42)); // Output: {}
    printArray(commonElements(arr51, arr52)); // Output: null
    printArray(commonElements(arr61, arr62)); // Output: null
  }

  public static int[] commonElements(int[] arr1, int[] arr2) {
    if (arr1 == null || arr2 == null) return null;
    if (arr1.length == 0 || arr2.length == 0) return new int[0];

    int min = (arr1.length < arr2.length) ? arr1.length : arr2.length;
    int[] a, b;
    if (min == arr1.length) {
      a = arr1;
      b = arr2;
    } else {
      a = arr2;
      b = arr1;
    }

    int[] commonElementsArray = new int[min];
    int commonIndex = 0;
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          commonElementsArray[commonIndex] = arr1[i];
          commonIndex++;
        }
      }
    }
    // Create a new array with the exact size of the common elements
    int[] finalResult = new int[commonIndex];
    // Copy the common elements to the new array
    for (int k = 0; k < finalResult.length; k++) {
      finalResult[k] = commonElementsArray[k];
    }

    return finalResult;
  }

      // To help print my array
  public static void printArray(int[] arr) {
    if (arr == null) {
        System.out.println("null");
        return;
    }
    System.out.print("{");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("}");
  }
 }