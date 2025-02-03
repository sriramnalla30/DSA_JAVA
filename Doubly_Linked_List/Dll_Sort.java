import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Node head=null;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
        head=push(head,m);
    }
    head=sort(head);
    display(head);
    }
    public static Node push(Node head,int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.prev=null;
        newnode.next=head;
        if(head!=null)
         {head.prev=newnode;}
         head=newnode;
         return head;
    }
    public static Node sort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node sortedhead=new Node();
        Node sortedTail=sortedhead;
        Node current=head;
        Node last=head;
        Node newnode;
        while(last.next!=null){
            last=last.next;
        }
        while(current!=last){
            if(current.data<=last.data){
                sortedTail.next=current;
                newnode=current.next;
                current.prev=sortedTail;
                current.next=null;
                current=newnode;
                sortedTail=sortedTail.next;
            }else{
                sortedTail.next=last;
                newnode=last.prev;
                last.prev.next=null;
                last.prev=sortedTail;
                last=newnode;
                sortedTail=sortedTail.next;
            }
        }
        sortedTail.next=current;
        current.prev=sortedTail;
        return sortedhead.next;
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print("->"+head.data);
            head=head.next;
        }
    }
    
}
class Node{
    int data;
    Node prev;
    Node next;
}