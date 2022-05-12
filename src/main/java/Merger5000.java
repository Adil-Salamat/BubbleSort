public class Merger5000 {

  //INCOMPLETE BUT IMPLEMENTED CORRECTLY IN ActualMergeSorter5000 CLASS
  public static int[] merger5000( int[] array3, int[] array4 ) {

    int[] merge = new int[ array3.length + array4.length ];
    int[] sortedMerge = new int[array3.length + array4.length];


    int first=0;
    int sec=0;
    int i=0;


    while(first < array3.length && sec < array4.length){

      if(array3[first]< array4[sec]){

        merge[i] = array3[first];
        first++;
      }else {
        merge[ i ] = array4[ sec ];
        sec++;
      }

      i++;

    }


    return merge;
  }

}
