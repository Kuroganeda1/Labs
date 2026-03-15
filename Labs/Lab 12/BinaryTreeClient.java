public class BinaryTreeClient {
    public static void main(String args[]) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        // Inserting nodes into the binary tree
        int idata[] = {50, 30, 70, 20, 40, 60, 80};
        for (int val : idata) {
            tree.insert(val); // Assume insert method is implemented
        }

        // Testing if the tree is a Binary Search Tree
        System.out.println("Is the tree a BST? " + tree.isBinarySearchTree());

        // Counting leaves and nodes
        System.out.println("Number of leaves: " + tree.treeLeavesCount());
        System.out.println("Total number of nodes: " + tree.treeNodeCount());

        // Creating another tree for similarity check
        BinaryTree<Integer> tree2 = new BinaryTree<>();
        int idata2[] = {50, 30, 70, 20, 40, 60, 80};
        for (int val : idata2) {
            tree2.insert(val); // Assume insert method is implemented
        }

        // Checking if both trees are similar
        System.out.println("Are both trees similar? " + tree.similarTrees(tree2.root));
    }
}

