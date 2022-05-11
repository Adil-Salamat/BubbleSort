import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSorter5000Test {
  @Test
  public void bubbleSortTest(){
    int[] unsorted = {5,4,3,2,1};
    int[] sorted = {1,2,3,4,5};

    int[] actuallySorted = BubbleSorter5000.bubbleSorter5000( unsorted );

    assertThat(actuallySorted).isEqualTo(sorted);
  }

  @Test
  public void bubbleSortTestNeg(){
    int[] unsorted = {-5,4,3,-2,1};
    int[] sorted = {-5,-2,1,3,4};

    int[] actuallySorted = BubbleSorter5000.bubbleSorter5000( unsorted );

    assertThat(actuallySorted).isEqualTo(sorted);
  }
  @Test
  public void bubbleSortTestPresorted(){
    int[] unsorted = {1,2,3,4,5};
    int[] sorted = {1,2,3,4,5};

    int[] actuallySorted = BubbleSorter5000.bubbleSorter5000( unsorted );

    assertThat(actuallySorted).isEqualTo(sorted);
  }
}