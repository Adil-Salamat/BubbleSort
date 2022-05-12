import java.util.Arrays;

public class Main {
  public static void main (String []args){
    int [] bubbleSortArray = {4, 7, -9, 11, 256, 3, 1, 95};

    int[] mergeSortArray = {9,34,5,876,3,1,2,21};

    int[] array1 = {1,7,3,4,5};
    int[] array2 = {10,9,8,7,6};

    int[] array3 = {1,3,5,5,9};
    int[] array4 = {2,4,6};


    System.out.println(Arrays.toString(BubbleSorter5000.bubbleSorter5000(bubbleSortArray)));

    System.out.println(Arrays.toString(MergeSorter5000.mergeSorter5000(array1, array2)));


    //technically fails but left on purpose
    System.out.println(Arrays.toString(Merger5000.merger5000(array3, array4)));

    System.out.println(Arrays.toString(ActualMergeSorter5000.actualMergeSorter5000(mergeSortArray)));

  }
}
