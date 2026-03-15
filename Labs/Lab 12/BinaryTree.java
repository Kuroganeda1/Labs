public class BinaryTree<T extends Comparable<T>> {
    private BinaryTreeNode<T> root;

    // Constructors
    public BinaryTree() {
        root = null;
    }

    public BinaryTree(BinaryTreeNode<T> iRoot) {
        root = iRoot;
    }

    public BinaryTree(BinaryTree<T> iOther) {
        if (iOther.root != null) {
            root = new BinaryTreeNode<>(iOther.root.data);
            copyNodes(root, iOther.root);
        } else {
            root = null;
        }
    }

    // Helper method to copy nodes
    private void copyNodes(BinaryTreeNode<T> newNode, BinaryTreeNode<T> oldNode) {
        if (oldNode.left != null) {
            newNode.left = new BinaryTreeNode<>(oldNode.left.data);
            copyNodes(newNode.left, oldNode.left);
        }
        if (oldNode.right != null) {
            newNode.right = new BinaryTreeNode<>(oldNode.right.data);
            copyNodes(newNode.right, oldNode.right);
        }
    }

    // Method to check if the binary tree is a BST
    public boolean isBinarySearchTree() {
        return isBST(root, null, null);
    }

    // Helper method to check the BST properties
    private boolean isBST(BinaryTreeNode<T> iNode, T iMin, T iMax) {
        if (iNode == null) {
            return true;
        }
        if ((iMin != null && iNode.data.compareTo(iMin) <= 0) ||
            (iMax != null && iNode.data.compareTo(iMax) >= 0)) {
            return false;
        }
        return isBST(iNode.left, iMin, iNode.data) &&
               isBST(iNode.right, iNode.data, iMax);
    }

    // Method to count the number of leaves in the tree
    public int treeLeavesCount() {
        return leavesCount(root);
    }

    // Helper method to count leaves recursively
    private int leavesCount(BinaryTreeNode<T> iNode) {
        if (iNode == null) {
            return 0;
        }
        if (iNode.left == null && iNode.right == null) {
            return 1;
        }
        return leavesCount(iNode.left) + leavesCount(iNode.right);
    }

    // Method to count the total number of nodes in the tree
    public int treeNodeCount() {
        return nodeCount(root);
    }

    // Helper method to count nodes recursively
    private int nodeCount(BinaryTreeNode<T> iNode) {
        if (iNode == null) {
            return 0;
        }
        return 1 + nodeCount(iNode.left) + nodeCount(iNode.right);
    }

    // Method to check if two trees are similar
    public boolean similarTrees(BinaryTreeNode<T> iOtherTree) {
        return similar(root, iOtherTree);
    }

    public void insert(int iVal) {    
  BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(iVal);   // create the node

  // TREE IS EMPTY
  if (root == null) {               
    root = newNode;
    return;
  }

  // Walk the tree to find the correct spot
  BinaryTreeNode<Integer> parent  = null;
  BinaryTreeNode<Integer> current = root;

  while (current != null) {
    parent = current;
    if (iVal < current.data) {
      current = current.left;
    } else if (iVal > current.data) {
      current = current.right;
    } else {                         // value already exists – do nothing
      return;
    }
  }

  // parent points to the node where newNode should attach
  if (iVal < parent.data) {
    parent.left = newNode;
  } else {
    parent.right = newNode;
  }
}
    // Helper method to compare the structure o
