package data_structure;

public class LinkList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(7);
        list.insert(1);
        list.insertAtStart(100);
        list.insertAt(3, 7852369);

        list.deleteAt(3);

        list.show();
    }

}


class LinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {

                n = n.next;

            }
            n.next = node;

        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();

        node.data = data;
        node.next = null;
        node.next = head;
        head = node;

    }


    public void insertAt(int index, int data) {

        Node node = new Node();

        node.data = data;
        node.next = null;
        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;

        }
        node.next = n.next;
        n.next = node;


    }

    public void deleteAt(int index) {

        if (index == 0) {

            head=head.next;


        }
        else{
            Node n=head;
            for (int i = 0; i < index - 1; i++) {
                 n = n.next;
            }
            Node nn=n.next;
            n.next=nn.next;
            System.out.println("nn "+nn.data);
        }

    }

    public void show() {

        Node node = head;

        while (node.next != null) {

            System.out.println(node.data);
            node = node.next;


        }
        System.out.println(node.data);


    }


}

class Node {
    int data;
    Node next;
}
