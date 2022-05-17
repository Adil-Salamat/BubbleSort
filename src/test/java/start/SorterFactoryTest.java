package start;

import exceptions.SorterLoaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterFactoryTest {
  @Test
  public void jabroni() throws SorterLoaderException {

    assertEquals( "BubbleSorter5000", SorterFactory.getSorter(1).getClass().getSimpleName() );
    assertEquals( "ActualMergeSorter5000", SorterFactory.getSorter(2).getClass().getSimpleName() );
    assertEquals( "BinaryTreeSorter5000", SorterFactory.getSorter(3).getClass().getSimpleName() );

  }

}