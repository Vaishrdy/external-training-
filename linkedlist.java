class Node{
    int data;//to store data
    Node next;//to store next address
    public Node (int value){
        this.data=value;
        next=null;
    }
}

class Linked{
    public Node addElementAtStart(Node head,int data){
        Node first=new Node(data);
        Node temp=head;
        head=first;
        head.next=temp;
        return head;

    }
    public void addElement(Node head,int data){
        Node new_node= new Node(data);
        Node curr=head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next = new_node;
    }
    public void deleteElement(Node head){
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        System.out.println();
    }
    public void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }
}
public class linklist{
    public static void main(String args[]){
        Linked l1=new Linked();
        Node head = new Node(10);
        l1.addElement(head,20);
        l1.addElement(head,30);
        l1.addElement(head,40);
        l1.addElement(head,50);
        l1.printList(head);
        l1.deleteElement(head);
        l1.printList(head);
        head=l1.addElementAtStart(head,5);
        l1.printList(head);
    }
}

//delete a node with a particular value
//insert a value at particular position
