    import java.util.Scanner;
    class Cycle{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            Cycle obj=new Cycle();
            Node head=null;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int m=sc.nextInt();
            head= obj.addNode(head,m);
            }
            display(head);
            int a=sc.nextInt();
            createCycle(head,1,a);
            if(detectCycle(head)){
                System.out.println("there is cycle");
            }else{
                System.out.println("no cycle");
            }

        }
        public static Node addNode(Node head,int val){
            Node newnode=new Node(val);
            if(head==null){
                head=newnode;
                return head;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            return head;
        }
        public static void createCycle(Node head,int start,int end){
            Node p1=head,p2=head;
            int s=0,e=0;
            while (s < start && p1 != null) {
                p1 = p1.next;
                s++;
            }
            // Move `p2` to the `end` position
            while (e < end && p2 != null) {
                p2 = p2.next;
                e++;
            }
            if (p1 != null && p2 != null) {
                p2.next = p1; // Creating the cycle
            }
        
        }
        public static boolean detectCycle(Node head){
            Node slow=head;
            Node fast=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }
        public static void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print("->"+temp.val);
                temp=temp.next;
            }
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