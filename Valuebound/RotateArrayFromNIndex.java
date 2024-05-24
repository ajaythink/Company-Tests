public class RotateArrayFromNIndex {

  public static void rotateArray(int[] arr, int n) {
    int[] temp = new int[n];
    for (int i = 0; i < n; i++) {
      temp[i] = arr[i];
      System.out.print(temp[i]+ " ");
    }
    System.out.println();
    for (int i = n; i < arr.length; i++) {
      arr[i - n] = arr[i];
      System.out.print(arr[i - n] + " ");
    }
    System.out.println();
    for (int i = 0; i < n; i++) {
      arr[arr.length - n + i] = temp[i];
    }
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int n = 6;
    rotateArray(arr, n);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
