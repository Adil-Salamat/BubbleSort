import java.util.ArrayList;

public class Node {

  public int nodeValue;

  //reference type
  public Node left;
  public Node  right;


  public Node(int nodeValue) {

    this.nodeValue = nodeValue;
  }


  public static Node makeTree( int[] treeArray){
    // make root node that is first number
    Node rootNode = new Node( treeArray[ 0 ] );

    // loops through other numbers starting from postion 1, turn each int into special node object
    for(int i=1; i<treeArray.length; i++) {
      int temp   = treeArray[i];
      //takes node number makes it into new node
      Node tempNode = new Node(temp);


      //now i have the number i pass to other method telling it to find a place for it
      rootNode.addToTree(tempNode);

    }
    return rootNode;
  }

  public void addToTree(Node newNode){
    // this is recursion
    // is the newNode just given greater than the value of nodeValue
    if(newNode.nodeValue > nodeValue){
      if(right == null){
        right = newNode;
      }else{
         right.addToTree(newNode);
      }
    }else{
      if(left == null){
        left = newNode;
      }else{
        left.addToTree(newNode);
      }
    }
  }

  public static int[] readTree(Node rootNode){
    //make empty list called sortedArray
    ArrayList<Integer> sortedArray = new ArrayList<Integer>();

    //pass in rootNode, sortedArray
    Node.inOrder(rootNode,sortedArray);

    //convert to array
    return Util.convertIntegers(sortedArray);
  }



    //takes node, arraylist
  public static void inOrder(Node tree, ArrayList<Integer> sortedArray){
    //is the node we are  looking at exist?
    if(tree != null){
      //if it does exist it means we  have a value and potentially a left or right side.
      //recursively call left node
      inOrder(tree.left, sortedArray);
      //when null(it doesnt have a left) add to array
      sortedArray.add(tree.nodeValue);
      //same to right
      inOrder(tree.right, sortedArray);
    }
  }



}
