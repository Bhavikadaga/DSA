import java.util.Scanner;

public class Queue {

    int[] arr;
    int front;
    int rear;
    int size;

    // Constructor
    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }

            rear++;
            arr[rear] = value;

            System.out.println(value + " inserted");
        }
    }

    // Dequeue
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front] + " deleted");
            front++;

            // Queue becomes empty
            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    // Peek
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + arr[front]);
        }
    }

    // isEmpty
    boolean isEmpty() {
        return front == -1;
    }

    // isFull
    boolean isFull() {
        return rear == size - 1;
    }

    // Delete entire queue
    void deleteQueue() {
        front = -1;
        rear = -1;

        System.out.println("Queue deleted");
    }

    // Display
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");

            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter queue size:");
        int size = sc.nextInt();

        Queue q = new Queue(size);

        int choice;

        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. Delete Queue");
            System.out.println("7. Display");
            System.out.println("8. Exit");

            System.out.println("Enter choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter value:");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    System.out.println(q.isEmpty());
                    break;

                case 5:
                    System.out.println(q.isFull());
                    break;

                case 6:
                    q.deleteQueue();
                    break;

                case 7:
                    q.display();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}