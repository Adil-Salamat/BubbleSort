public class ActualMergeSorter5000 implements Sorter5000 {
  @Override
  public int[] sort( int[] mergeSortArray ){

    // variable for length of array, use this a lot
    int mergeSortArrayLength = mergeSortArray.length;

    // this if statement is to see if there are any arrays with only 1 value, to break call loop
    if (mergeSortArrayLength <=1){
      return mergeSortArray;
    }

    // middle is to find half point of array
    int middle = mergeSortArrayLength/2;
    //left half is made up of the first half so middle is fine
    int[] leftHalf = new int[middle];
    //right half is used making the total length - middle/left half as array length may be an odd number
    int[] rightHalf = new int [mergeSortArrayLength-middle];

    // this loop populates the left half
    for(int i =0; i < middle; i++){
      leftHalf[i] = mergeSortArray[i];
    }

    //this for loop fills in right half, j is assigned to middle so it starts from the end of left half,
    //j/middle is taken away from itself so that it is reset to 0 while mergeSortArray[j] starts from where left ended
    for(int j =middle; j < mergeSortArrayLength; j++){
      rightHalf[j - middle] = mergeSortArray[j];
    }

    //call the method we just made for each half, this is the divide part of the sort method
    sort( leftHalf );
    // this comment is to show where leftHalf would break after the if<=1 statement
    sort( rightHalf );
    // this comment is to show where rightHalf would break after the if<=1 statement

    //calls the method made below, the parameters passed after divide step of merge sort method
    merge(mergeSortArray, leftHalf, rightHalf);


    // this returns to main the final result
    return mergeSortArray;
  }


  // this is the while loop made in Merger5000 with the addition of what to do if numbers are left out
  public static void merge(int[] mergeSortArray, int[] leftHalf, int[] rightHalf){
    int leftLength = leftHalf.length;
    int rightLength = rightHalf.length;

    int a = 0;
    int b = 0;
    int c = 0;

    // this while loop compares values in left and right to see which is bigger
    // the mistake I made was having the mergeSortArray increment inside the if and else statements and not outside
    while(a < leftLength && b < rightLength){
      if(leftHalf[a] <= rightHalf[b]){
        mergeSortArray[c] = leftHalf[a];
        a++;
      }
      else{
        mergeSortArray[c] = rightHalf[b];
        b++;
      }
      c++;
    }

    // this is what I was missing from Merger5000 class, both loops check for unevenness and add to end
    while(a < leftLength){
      mergeSortArray[c] = leftHalf[a];
      a++;
      c++;
    }

    while(b < rightLength){
      mergeSortArray[c] = rightHalf[b];
      b++;
      c++;
    }
  }


  }
