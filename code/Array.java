public class Array {
  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
    arr[i] = newArray[arr.length - i - 1];
//      newArray[i] = arr[arr.length - i - 1];
    }
  return arr;
//    return newArray;
  }
}