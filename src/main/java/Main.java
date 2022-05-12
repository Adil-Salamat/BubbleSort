import java.util.Arrays;

public class Main {
  public static void main (String []args){
    int [] bubbleSortArray = {4, 7, -9, 11, 256, 3, 1, 95};

    int[] array1 = {1,7,3,4,5};
    int[] array2 = {10,9,8,7,6};

    System.out.println(Arrays.toString(BubbleSorter5000.bubbleSorter5000(bubbleSortArray)));

    System.out.println(Arrays.toString(MergeSorter5000.mergeSorter5000(array1, array2)));

  }
}
