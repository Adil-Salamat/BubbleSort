package display;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sorters.Sorter5000;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {
  private static Logger logger = LogManager.getLogger( "timer" );

  public static ArrayList< String > getMenuItems() {
    return new ArrayList<>( Arrays.asList( "BubbleSorter5000", "MergeSorter5000",
            "BinaryTreeSorter5000", "InsertionSorter5000" ) );
  }

  public static ArrayList< String > getYesOrNo() {
    return new ArrayList<>( Arrays.asList( "Yes", "No" ) );
  }

  public static void printBeforeSort( Sorter5000 sorter, int[] arrayToSort ) {
    System.out.println( "Sorting using the " + sorter );
    System.out.println( "Before sorting: \n" + Arrays.toString( arrayToSort ) );
  }

  public static void printResult( Sorter5000 sorter, int[] arrayToSort ) {
    long start = System.nanoTime();
    int[] sortedArray = sorter.sort( arrayToSort );
    long end = System.nanoTime();
    System.out.println( "After Sorting: \n" + Arrays.toString( sortedArray ) );
    System.out.println( "Time Taken: \n" + ( end - start ) + "nano seconds." );
    ;
    logger.info( end - start + " nano seconds" );
  }

  public static void displaySortChoices() {
    System.out.println( "Enter the number of the sorter you wanna use: " );
    for ( int i = 0; i < getMenuItems().size(); i++ ) {
      System.out.println( i + 1 + ", " + getMenuItems().get( i ) );
    }
  }
    public static void displayCompareChoices() {
      System.out.println( "Enter the number to choose Yes or No: " );
      for ( int i = 0; i < getYesOrNo().size(); i++ ) {
        System.out.println( i + 1 + ", " + getYesOrNo().get( i ) );
      }
    }
  public static void printBeforeSortTwo( Sorter5000 sorter, Sorter5000 sorter2, int[] arrayToSort ,int[] arrayToSort2) {
    System.out.println( "Sorting using the " + sorter );
    System.out.println( "Comparing using the " + sorter2 );
    System.out.println( "Before sorting: \n" + Arrays.toString( arrayToSort ) );
    System.out.println( "Before sorting: \n" + Arrays.toString( arrayToSort2 ) );
  }

  public static void printResultTwo( Sorter5000 sorter, Sorter5000 sorter2, int[] arrayToSort, int[] arrayToSort2 ) {
    long start = System.nanoTime();
    int[] sortedArray = sorter.sort( arrayToSort );
    long end = System.nanoTime();

    long start2 = System.nanoTime();
    int[] sortedArray2 = sorter2.sort(arrayToSort2);
    long end2 = System.nanoTime();

    long  timer = end - start;
    long  timer2 = end2 - start2;

    long dif = Math.abs( (timer - timer2));

    System.out.println( "After Sorting: \n" + Arrays.toString( sortedArray ) );
    System.out.println( "Time Taken: \n" + timer + " nano seconds." );

    System.out.println( "After Sorting: \n" + Arrays.toString( sortedArray2 ) );
    System.out.println( "Time Taken: \n" + timer2 + " nano seconds." );

    System.out.println("Time Difference: \n" + dif +" nano seconds" );

    //logger.info( end - start + " nano seconds" );
  }
  }

