class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

class Main{
    Node head;
    public void addNode(int val){

        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }
    public void addFirst(int val){
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
    }
    public void deleteFirst(){
        head=head.next;
    }
    public void deleteLast(){
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }
    public void addPrior(int val,int index){
        
    }
    public void printlist(){
        Node current=head;
        while(current!=null){
            System.out.print("->"+current.val);
            current=current.next;
        }
    }
    public static void main(String args[]){
        Main obj=new Main();
        obj.addNode(10);
        obj.addNode(20);
        obj.addNode(30);
        obj.addFirst(5);
        obj.deleteFirst();
        obj.deleteLast();
        obj.printlist();
        
    }
}