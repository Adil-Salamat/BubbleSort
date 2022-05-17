package display;

import sorters.Sorter5000;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {
  public static ArrayList<String> getMenuItems(){
    return new ArrayList<>( Arrays.asList("BubbleSorter5000","MergeSorter5000","BinaryTreeSorter5000"));
  }

  public static void printBeforeSort( Sorter5000 sorter, int[] arrayToSort){
    System.out.println("Sorting using the " + sorter);
    System.out.println("Before sorting: \n" + Arrays.toString(arrayToSort));
  }

  public static void printResult(Sorter5000 sorter, int[] arrayToSort){
    long start = System.nanoTime();
    int[] sortedArray = sorter.sort(arrayToSort);
    long end = System.nanoTime();
    System.out.println("After Sorting: \n" + Arrays.toString(sortedArray));
    System.out.println("Time Taken: \n" + (end-start) + "nano seconds.");;
  }

  public static void displaySortChoices(){
    System.out.println("Enter the number of the sorter you wanna use: ");
    for(int i=0; i<getMenuItems().size(); i++){
      System.out.println(i+1 + ", " + getMenuItems().get(i));
    }
  }
}
