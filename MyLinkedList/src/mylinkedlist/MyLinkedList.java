/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mylinkedlist;

/**
 *
 * @author matheus
 */
public class MyLinkedList {
    
    private Node head;
    private int size;
    
    public MyLinkedList() {
        this.size = 0;
    }
    
    public void insert (int data) {         
        Node newNode = new Node(data);
        newNode.next = null;
        
        if (head == null) {
            head = newNode;
        } else {
            Node auxNode = head;
            
            while (auxNode.next != null) {
                auxNode = auxNode.next;
            }
            auxNode.next = newNode;
        }
        size += 1;
    }
    
    public void printList () {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        
        size += 1;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int delete() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else if (head.next == null) {
            Node n = head;
            head = null;
            size -= 1;
            return n.data;
        } else {
            Node auxNode = head;
            
            while (auxNode.next.next != null) {
                auxNode = auxNode.next;
            }
            Node n = auxNode.next;
            auxNode.next = null;
            size -= 1;
            return n.data;
        }
    }
    
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else if (head.next == null) {
            Node n = head;
            head = null;
            size -= 1;
            return n.data;
        } else {
            Node auxNode = head;
            head = head.next;
            Node n = auxNode;
            auxNode = null;
            size -= 1;
            return n.data;
        }
    }
    
    private class Node {
        
        private int data;
        private Node next;
        
        public Node (int data) {
            this.data = data;
        }
        
        public Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyLinkedList ll = new MyLinkedList();
        
        System.out.println(ll.isEmpty());
        ll.insert(1);
        ll.insertFirst(0);
        ll.insert(2);
        ll.insert(3);
        System.out.println(ll.isEmpty());
        System.out.println(ll.delete());
        System.out.println(ll.deleteFirst());
                System.out.println(ll.deleteFirst());
        System.out.println(ll.deleteFirst());
        System.out.println(ll.isEmpty());

        ll.printList();
    }
    
}
