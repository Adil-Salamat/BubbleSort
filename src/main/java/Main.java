import java.util.Arrays;

public class Main {
  public static void main (String []args){

    int [] bubbleSortArray = {4, 7, -9, 11, 256, 3, 1, 95};
    int i = 1;
    int j = 0;
    int x = 0;
      while(j < bubbleSortArray.length) {
        i=1;
        while ( i < bubbleSortArray.length ) {
          if ( bubbleSortArray[ i - 1 ] > bubbleSortArray[ i ] ) {
            x = bubbleSortArray[ i - 1 ];
            bubbleSortArray[ i - 1 ] = bubbleSortArray[ i ];
            bubbleSortArray[ i ] = x;
          }
          i++;
        }
        j++;
      }
    System.out.println(Arrays.toString(bubbleSortArray));

  }
}
