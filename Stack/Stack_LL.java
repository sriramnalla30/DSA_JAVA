class Stack_LL{
    Node top;
    public  void push(int val){
        Node newnode=new Node(val);
        if(top==null){
            top=newnode;
            return;
        }
        newnode.next=top;
        top=newnode;
       // int size=size+1;
    }
    public void pop(){
        if (top == null) { // Check for underflow (empty stack).
            System.out.println("Stack is empty! No top element.");
            return;
        }
        top=top.next;
    }
    public void top(){
        if (top == null) { // Check for underflow (empty stack).
            System.out.println("Stack is empty! No top element.");
            return;
        }
        System.out.print("top->"+top.val);
    }
    public void printall(){
        if (top == null) { // Check for underflow (empty stack).
            System.out.println("Stack is empty! No top element.");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.print("->"+temp.val);
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        Stack_LL obj=new Stack_LL();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.pop();
        obj.pop();
        obj.top();
        System.out.println();
        obj.printall();
    }
}

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}