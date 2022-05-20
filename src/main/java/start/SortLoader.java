package start;

import display.DisplayManager;
import exceptions.SorterLoaderException;
import sorters.Sorter5000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortLoader {

  private final static Scanner scanner = new Scanner( System.in );

  public static void start() {

    try {
      DisplayManager.displaySortChoices();
      Sorter5000 sorter = SorterFactory.getSorter( scanner.nextInt() );


      System.out.println( "enter size of array u wanna generate: " );

      int[] arrayToSort = createArray( scanner.nextInt() );

      int[] arrayToSort2 = arrayToSort;
      for(int i = 0; i <arrayToSort.length; i++){
        arrayToSort2[i] = arrayToSort[ i ];
      }
      System.out.println( Arrays.toString( arrayToSort2 ));


      System.out.println( "Would you like to compare with another array?: " );

      DisplayManager.displayCompareChoices();
      if(scanner.nextInt() == 1) {
        DisplayManager.displaySortChoices();
        Sorter5000 sorter2 = SorterFactory.getSorter( scanner.nextInt() );
        DisplayManager.printBeforeSortTwo( sorter, sorter2,arrayToSort, arrayToSort2 );
        DisplayManager.printResultTwo( sorter,sorter2,arrayToSort, arrayToSort2 );


      }else {
        DisplayManager.printBeforeSort( sorter, arrayToSort );
        DisplayManager.printResult( sorter, arrayToSort );
      }

    } catch ( SorterLoaderException e ) {
      System.out.println(e.getMessage());
    }
  }

  private static int[] createArray( int size ) {
    int[] unsortedArray = new int[ size ];

    Random random = new Random();

    for ( int i = 0; i < size; i++ ) {
      unsortedArray[ i ] = random.nextInt(size*10);
    }
    return unsortedArray;
  }
}
