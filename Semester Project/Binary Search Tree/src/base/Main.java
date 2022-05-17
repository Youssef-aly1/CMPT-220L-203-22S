package base;

    public class Main {

    public static void main(String[] args) {
        Binary_Search_Tree BT = new Binary_Search_Tree();
        BT.insert(30);
        BT.insert(70);
        BT.insert(60);
        BT.insert(10);
        BT.insert(90);

        //Add Nodes to the tree here:
        BT.insert(10);
        System.out.println("Binary search tree after insertion:");
        //Displays the binary tree
        BT.inorderTraversal(BT.root);

        Binary_Search_Tree.Node deletedNode = null;
        //Deletes node 90 which has no child
        deletedNode = BT.deleteNode(BT.root, 90);
        System.out.println("\nBinary search tree after deleting node 90:");
        BT.inorderTraversal(BT.root);

        //Deletes node 30 which has one child
        deletedNode = BT.deleteNode(BT.root, 30);
        System.out.println("\nBinary search tree after deleting node 30:");
        BT.inorderTraversal(BT.root);

        //Deletes node 50 which has two children
        deletedNode = BT.deleteNode(BT.root, 50);
        System.out.println("\nBinary search tree after deleting node 50:");
        BT.inorderTraversal(BT.root);

    }
}