import java.util.Scanner;

public class Bst {

    // Node of BST
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root = null;

    // INSERT
    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } 
        else if (data > root.data) {
            root.right = insert(root.right, data);
        } 
        else { 

            System.out.println("Duplicate value not allowed.");
        }

        return root;
    }

    // SEARCH              
    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } 
        else {
            return search(root.right, key);
        }
    }

    // DELETE
    static Node delete(Node root, int key) {

        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } 
        else if (key > root.data) {
            root.right = delete(root.right, key);
        } 
        else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Only left child
            if (root.right == null) {
                return root.left;
            }
        }

        return root;
    }

    // INORDER
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // PREORDER
    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // POSTORDER
    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // DISPLAY TREE
    static void display(Node root, int space) {
        if (root == null) {
            return;
        }

        space += 5;

        // Display right subtree
        display(root.right, space);

        System.out.println();

        for (int i = 5; i < space; i++) {
            System.out.print(" ");
        }

        System.out.println(root.data);

        // Display left subtree
        display(root.left, space);
    }

    // MAIN
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, value;

        do {
            System.out.println("\n===== BINARY SEARCH TREE =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Inorder");
            System.out.println("5. Preorder");
            System.out.println("6. Postorder");
            System.out.println("7. Display Tree");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();

                    root = insert(root, value);
                    System.out.println("Value inserted.");
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();

                    if (search(root, value)) {
                        root = delete(root, value);
                        System.out.println("Value deleted.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();

                    if (search(root, value)) {
                        System.out.println("Value found.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 4:
                    System.out.print("Inorder: ");
                    inorder(root);
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Preorder: ");
                    preorder(root);
                    System.out.println();
                    break;

                case 6:
                    System.out.print("Postorder: ");
                    postorder(root);
                    System.out.println();
                    break;

                case 7:
                    if (root == null) {
                        System.out.println("Tree is empty.");
                    } else {
                        System.out.println("BST:");
                        display(root, 0);
                    }
                    break;

                case 8:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);

        sc.close();
    }
}

