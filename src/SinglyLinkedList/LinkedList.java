package SinglyLinkedList;

import java.util.Scanner;

public class LinkedList {
    public static Node mergeLists(Node head1, Node head2){
        Node tail = new Node();

        for (Node n = head1; n!=null; n=n.next) {
            tail = n;

        }
        for(Node n = head2; n!=null; n=n.next){
            Node x = new Node();
            x.data = n.data;
            tail.next = x;
            tail = tail.next;
        }







        return head1;

    }

    public static void main(String[] args) {

        Node a = new Node();
        a.data = 1;

        Node b = new Node();
        b.data = 2;


        Node c = new Node();
        c.data = 3;


        Node d = new Node();
        d.data = 4;


        a.next = b;
        c.next = d;










        Node n = mergeLists(a,c);
        for(Node x = n; x!=null; x=x.next){
            System.out.println(x.data);
        }

    }
}
