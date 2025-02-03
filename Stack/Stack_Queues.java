//Implementing Stack Using Queus
//1)perform queue operations means you have to push at the first and delete at the last but the element you are deleting 
//should be the first element due to the stack should be followed LIFO and Queue here is to perform his operations but 
//validated with stack condition(LIFO)
// 2)say we are having an operations push(10),push(20),push(30),push(40),push(50),pop()
// 10,20,30,40,50 this is stack but when poping(we are folowing queue) 10 is getting deleted but according to stack 50 should poped so we reverse the values say
// 10,20 reverse 20,10 now pop 20 will go bcoz its the top according to stack
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Stack_Queues {
    Node front; // Represents the start of the queue
    Node rear;  // Represents the end of the queue

    public void push(int val) {
        Node newNode = new Node(val);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
    }

    public void pop() {
        if (front == null) {
            System.out.println("Stack is empty. Nothing to pop.");
            return;
        }
        if (front == rear) { // Single element case
            System.out.println("Popped: " + front.val);
            front = rear = null;
        } else {
            System.out.println("Popped: " + front.val);
            front = front.next;
        }
    }

    public void top() {
        if (front == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top: " + front.val);
        }
    }

    public void printAll() {
        if (front == null) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_Queues stack = new Stack_Queues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.printAll();

        stack.top();

        stack.pop();
        stack.printAll();

        stack.pop();
        stack.printAll();

        stack.top();
    }
}
