class Queue_LL{
    Node start;
    Node end;
    public void push(int val){
        Node newnode=new Node(val);
        if(start==null && end==null){
            end=newnode;
            start=newnode;
        }
        end.next=newnode;
        end=end.next;
    }
    public void pop(){
        start=start.next;
    }
    public void top(){
        System.out.println("top->"+start.val);
    }
    public void printall(){
        while(start!=null){
            System.out.print("->"+start.val);
            start=start.next;
        }
    }
    public static void main(String args[]){
        Queue_LL obj=new Queue_LL();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
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