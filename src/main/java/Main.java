import sorters.ActualMergeSorter5000;
import sorters.BinaryTreeSorter5000;
import sorters.BubbleSorter5000;
import sorters.InsertionSorter5000;

import java.util.Arrays;

public class Main {

  public static void main (String []args){
    int [] bubbleSortArray = {4, 7, -9, 11, 256, 3, 1, 95};

    int[] mergeSortArray = {9,34,5,876,3,1,2,21};

    //int[] array1 = {1,7,3,4,5};
    // int[] array2 = {10,9,8,7,6};
    // int[] array3 = {1,3,5,5,9};
    // int[] array4 = {2,4,6};

    int[] treeArray= {5,7,2,4,57657,98,65};

    int[] insertArray = {13,5,9,34,56,78,6};

    BubbleSorter5000 bubble = new BubbleSorter5000();
    ActualMergeSorter5000 merger = new ActualMergeSorter5000();
    BinaryTreeSorter5000 binary = new BinaryTreeSorter5000();
    InsertionSorter5000 insert = new InsertionSorter5000();


    System.out.println(Arrays.toString(bubble.sort(bubbleSortArray)));

    //System.out.println(Arrays.toString(MergeSorter5000.mergeSorter5000(array1, array2)));


    //technically fails but left on purpose
    //System.out.println(Arrays.toString(Merger5000.merger5000(array3, array4)));

    System.out.println(Arrays.toString(merger.sort(mergeSortArray)));

    System.out.println(Arrays.toString(binary.sort(treeArray)));


  }
}
