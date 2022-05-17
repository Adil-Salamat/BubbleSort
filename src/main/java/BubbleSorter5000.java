public class BubbleSorter5000 implements Sorter5000 {



  @Override
  public  int[] sort( int[] bubbleSortArray ){


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
    return bubbleSortArray;
  }

}
