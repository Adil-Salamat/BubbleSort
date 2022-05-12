import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ActualMergeSorter5000Test {

  @Test
  void actualMergeSorter5000Even() {

      int[] array = {3,456,7,3,234,675,87,5,4,3};
      int[] sorted = {3, 3, 3, 4, 5, 7, 87, 234, 456, 675};

      int[]merge = ActualMergeSorter5000.actualMergeSorter5000(array );

      assertThat(merge).isEqualTo(sorted);

  }
  @Test
  void actualMergeSorter5000Odd() {

    int[] array = {3,456,7,3,234,675,87,5,4,3,-9};
    int[] sorted = {-9,3, 3, 3, 4, 5, 7, 87, 234, 456, 675};

    int[]merge = ActualMergeSorter5000.actualMergeSorter5000(array );

    assertThat(merge).isEqualTo(sorted);

  }

  @Test
  void actualMergeSorter5000Empty() {

    int[] array = {};
    int[] sorted = {};

    int[]merge = ActualMergeSorter5000.actualMergeSorter5000(array );

    assertThat(merge).isEqualTo(sorted);

  }

  @Test
  void actualMergeSorter5000Single() {

    int[] array = {5};
    int[] sorted = {5};

    int[]merge = ActualMergeSorter5000.actualMergeSorter5000(array );

    assertThat(merge).isEqualTo(sorted);

  }

  @Test
  void actualMergeSorter5000Neg() {

    int[] array = {-5,-7,-4564,-6,-345,-2,-43,-5,0};
    int[] sorted = {-4564, -345, -43, -7, -6, -5, -5, -2, 0};

    int[]merge = ActualMergeSorter5000.actualMergeSorter5000(array );

    assertThat(merge).isEqualTo(sorted);

  }

  @Test
  void actualMergeSorter5000Duplicate() {

    int[] array = {5,5,5,5,5,5,5,5,5,5,5};
    int[] sorted = {5,5,5,5,5,5,5,5,5,5,5};

    int[]merge = ActualMergeSorter5000.actualMergeSorter5000(array );

    assertThat(merge).isEqualTo(sorted);

  }


  @Test
  void merge() {
  }
}