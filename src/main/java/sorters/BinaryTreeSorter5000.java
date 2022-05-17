package sorters;

public class BinaryTreeSorter5000 implements Sorter5000 {
  @Override
  public int[] sort( int[] inputArray ) {
    Node tree = Node.makeTree(inputArray);
    int[] sortedArray = Node.readTree(tree);
    return sortedArray;
  }
}
