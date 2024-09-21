import java.util.Arrays;

public class Fibonacci {
  public static int[] fibonacci(int size) {
    int arr[] = new int[size];
    arr[0] = 0;
    arr[1] = 1;

    for (int i = 1; i < size - 1; i++) {
      arr[i + 1] = arr[i - 1] + arr[i];
    }

    return arr;
  }

  public static void main(String[] args) {
    int sequenceSize = 10;
    int fibonacci[] = fibonacci(sequenceSize);

    int searchNumber = 14;

    while (fibonacci[fibonacci.length - 1] < searchNumber) {
      fibonacci = fibonacci(sequenceSize += 5);
    }

    int result = Arrays.binarySearch(fibonacci, searchNumber);

    System.out.println(result >= 0 ? "Pertence" : "Não pertence");
  }
}