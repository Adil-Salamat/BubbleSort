package start;

import exceptions.SorterLoaderException;
import sorters.*;

public class SorterFactory{
  public static Sorter5000 getSorter(int choice) throws SorterLoaderException {
    switch (choice){
      case 1 :
        return new BubbleSorter5000();

      case 2 :
        return new ActualMergeSorter5000();

      case 3 :
        return new BinaryTreeSorter5000();

        case 4: return new InsertionSorter5000();

      default: throw new SorterLoaderException("Invalid sorter choice: " + "'" +choice + "'");

    }
  }
}
