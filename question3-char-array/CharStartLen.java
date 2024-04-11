/**
 * Write a function that accepts a character array, a zero-based start position and a length. 
 * It should return a character array containing containing lengthcharacters starting with the startcharacter of the input array. 
 * The function should do error checking on the start position and the length and return null if the either value is not legal.
The function signature is:
char[ ] f(char[ ] a, int start, int len)
 */

 /**
  * Testing
  - {'a', 'b', 'c'}, 0, 4 --> null
  - {'a', 'b', 'c'}, 0, 3 --> {'a', 'b', 'c'}
  - {'a', 'b', 'c'}, 0, 2 --> {'a', 'b'}
  */
 // steps
 // Make all the error checks
 // Initiate a new array to handle the chars within the bounds
 // Loop through without exceeding the len
 // make the elements of the new Array equal to arr[start + i]
 
 public class CharStartLen {
  public static void main(String[] arg) {
    char[] arr1 = {'a', 'b', 'c'};
    char[] emptyArr = {};

    printArray(charStartLen(arr1, 0, 4)); // Output: null
    printArray(charStartLen(arr1, 0, 3)); // Output: {'a', 'b', 'c'}
    printArray(charStartLen(arr1, 0, 2)); // Output: {'a', 'b'}
    printArray(charStartLen(arr1, 0, 1)); // Output: {'a'}
    printArray(charStartLen(arr1, 1, 3)); // Output: null
    printArray(charStartLen(arr1, 1, 2)); // Output: {'b', 'c'}
    printArray(charStartLen(arr1, 1, 1)); // Output: {'b'}
    printArray(charStartLen(arr1, 2, 2)); // Output: null
    printArray(charStartLen(arr1, 2, 1)); // Output: {'c'}
    printArray(charStartLen(arr1, 3, 1)); // Output: null
    printArray(charStartLen(arr1, 1, 0)); // Output: {}
    printArray(charStartLen(arr1, -1, 2)); // Output: null
    printArray(charStartLen(arr1, -1, -2)); // Output: null
    printArray(charStartLen(emptyArr, 0, 1)); // Output: null

  }

  public static char[] charStartLen(char[] a, int start, int len) {
  if (len == 0) return new char[]{};
  if ((start + len) > a.length || start < 0 ||  start >= a.length) return null;

  char[] finalArray = new char[len];

  if(len > a.length) return null;
  for(int i = 0; i < len; i++) {
    finalArray[i] = a[start + i];
  }

  return finalArray;
  }

  // To help print my array
  public static void printArray(char[] arr) {
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