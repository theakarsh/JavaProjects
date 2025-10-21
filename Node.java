class Node
{
    int data;
    Node link;
    public Node(int data)
    {
        this.data = data;
        this.link = null;
    }
}
class SinglyLinkedList
{
    public Node start = null;
    public Node tail = null;
    public void addNode(int data) {
        Node newNode = new Node(data);  //Create a new node
        if(start == null)
        {
            start = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's link will point to newNode
            tail.link = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }
    public void display()
    {
        Node current = start;
        if(start == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        //Displays the nodes present in the list
        sList.display();
    }
}