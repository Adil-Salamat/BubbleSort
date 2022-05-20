package sorters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSorter5000Test {
  InsertionSorter5000 insert = new InsertionSorter5000();

  @Test
  public void insertSortTest(){
    int[] unsorted = {5,4,3,2,1};
    int[] sorted = {1,2,3,4,5};

    int[] actuallySorted = insert.sort( unsorted );

    assertThat(actuallySorted).isEqualTo(sorted);
  }
}