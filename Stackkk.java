import java.util.Scanner;

public class Stackkk {

    static class Stack {
        int[] arr;
        int top;
        int size;

        // Constructor
        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }

        void push(int value) {
            if (top == size - 1) {
                System.out.println("Stack overflow");
            } else {
                top++;
                arr[top] = value;
                System.out.println(value + " pushed");
            }
        }

        void pop() {
            if (top == -1) {
                System.out.println("Stack underflow");
            } else {
                System.out.println(arr[top] + " popped");
                top--;
            }
        }

        void peep() {
            if (top == -1) {
                System.out.println("Stack underflow");
            } else {
                System.out.println("Top element: " + arr[top]);
            }
        }

        void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Stack elements:");

                for (int i = top; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter stack size:");
        int size = sc.nextInt();

        Stack s = new Stack(size);

        int choice;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peep");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.println("Enter choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter value:");
                    int value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peep();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}