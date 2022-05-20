package sorters;

public class InsertionSorter5000 implements Sorter5000{
  @Override
  public int[] sort( int[] insertArray ) {

    int i = 0;
    int j;
    int temp = 0;

    while(i < insertArray.length) {
      j=insertArray.length-1 ;
     while (j!=0) {
       if (insertArray [j] < insertArray[j-1] ){
         temp = insertArray[ j-1 ];
         insertArray[j-1] = insertArray[j];
         insertArray[j] = temp;
       }
       j--;
     }
     i++;
    }


    return insertArray;
  }
}
