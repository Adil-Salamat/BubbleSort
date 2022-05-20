package sorters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BinaryTreeSorter5000Test {
  BinaryTreeSorter5000 binary = new BinaryTreeSorter5000();

  @Test
  void binaryTreeSorter5000Even() {

    int[] array = {3,456,7,3,234,675,87,5,4,3};
    int[] sorted = {3, 3, 3, 4, 5, 7, 87, 234, 456, 675};

    int[]merge = binary.sort(array);

    assertThat(merge).isEqualTo(sorted);

  }

  @Test
  void binaryTreeSorter5000Sorted() {

    int[] array = {1,17,18,43,234,675};
    int[] sorted = {1, 17, 18, 43, 234, 675};

    int[]merge = binary.sort(array);

    assertThat(merge).isEqualTo(sorted);

  }

  @Test
  void binaryTreeSorter5000Decending() {

    int[] array = {100,90,80,76,50,40,30,20};
    int[] sorted = {20, 30, 40, 50, 76, 80, 90, 100};

    int[]merge = binary.sort(array);

    assertThat(merge).isEqualTo(sorted);

  }

  @Test
  void binaryTreeSorter5000Dup() {

    int[] array = {100,90,90,90,50,40,30,20};
    int[] sorted = {20, 30, 40, 50, 90, 90, 90, 100};

    int[]merge = binary.sort(array);

    assertThat(merge).isEqualTo(sorted);

  }

}