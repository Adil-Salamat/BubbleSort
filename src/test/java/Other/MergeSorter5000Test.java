//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//class MergeSorter5000Test {
//
//  @Test
//  public void mergeSortTest(){
//    int[] array1 = {1,4,5,6,7};
//    int[] array2 = {5,6,3};
//    int[] sorted = {1,3,4,5,5,6,6,7};
//
//    int[]merge = MergeSorter5000.mergeSorter5000( array1,array2 );
//
//    int[] actuallySorted = Sorters.BubbleSorter5000.bubbleSorter5000( merge );
//
//    assertThat(actuallySorted).isEqualTo(sorted);
//  }
//
//  @Test
//  public void mergeSortTestDuplicate(){
//    int[] array1 = {1,1,1,1,1};
//    int[] array2 = {1,1,1,1,1};
//    int[] sorted = {1,1,1,1,1,1,1,1,1,1};
//
//    int[]merge = MergeSorter5000.mergeSorter5000( array1,array2 );
//
//    int[] actuallySorted = Sorters.BubbleSorter5000.bubbleSorter5000( merge );
//
//    assertThat(actuallySorted).isEqualTo(sorted);
//  }
//
//  @Test
//  public void mergeSortTestNeg(){
//    int[] array1 = {1,4,-5,6,7};
//    int[] array2 = {5,6,-3};
//    int[] sorted = {-5,-3,1,4,5,6,6,7};
//
//    int[]merge = MergeSorter5000.mergeSorter5000( array1,array2 );
//
//    int[] actuallySorted = Sorters.BubbleSorter5000.bubbleSorter5000( merge );
//
//    assertThat(actuallySorted).isEqualTo(sorted);
//  }
//
//  @Test
//  public void mergeSortTestEmpty(){
//    int[] array1 = {};
//    int[] array2 = {};
//    int[] sorted = {};
//
//    int[]merge = MergeSorter5000.mergeSorter5000( array1,array2 );
//
//    int[] actuallySorted = Sorters.BubbleSorter5000.bubbleSorter5000( merge );
//
//    assertThat(actuallySorted).isEqualTo(sorted);
//  }
//
//  @Test
//  public void mergeSortTestOneEmpty(){
//    int[] array1 = {};
//    int[] array2 = {1,9,345,6};
//    int[] sorted = {1,6,9,345};
//
//    int[]merge = MergeSorter5000.mergeSorter5000( array1,array2 );
//
//    int[] actuallySorted = Sorters.BubbleSorter5000.bubbleSorter5000( merge );
//
//    assertThat(actuallySorted).isEqualTo(sorted);
//  }
//}