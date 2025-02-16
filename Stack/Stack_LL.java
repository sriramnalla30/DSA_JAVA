class Stack_LL{
    Node top;
    int size=0;
    public static void main(String args[]){
        Stack_LL obj=new Stack_LL();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.top();
        obj.pop();
        obj.top();
    }
    public  void push(int x){
        Node newnode=new Node(x);
        newnode.next=top;
        top=newnode;
        System.out.println("Data Inserted: "+newnode.val);
        printall();
        size++;
    }
    public  void pop(){
        if(top==null){
            System.out.println("Stack is Empty");
            return ;
        } 
        Node temp=top;
        top=top.next;
        size--;
    }
    public  void top(){
        System.out.println("Top Element: "+top.val);
        printall();
    }
    public  void printall(){
        Node temp = top; 
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
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