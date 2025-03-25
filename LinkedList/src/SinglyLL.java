public class SinglyLL {

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;}
    }

    Node head;
    public SinglyLL(){
        this.head = null;

    }

//    public void insertHead(int val){
//        Node node = new Node(val);
//        if(head == null){
//            head = node;
//            return;
//        }
//        node.next = head;
//        head = node;
//    }


    public void delete(Node node){
        if(node.next == null)return ;
        node.data = node.next.data;
        node.next = node.next.next;

    }
    public void insert(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            return ;
        }
        Node tail = getLast();

        tail.next = node;
    }


    public Node getLast(){
        Node temp = head;
        if(head == null)return head;

        while(temp.next!=null){
            temp = temp.next;
        }
        return temp;
    }

    public int size(){
        Node temp = head;
int size =0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insert(3);
        list.insert(4);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.display();
        System.out.println(list.size());
    }
}