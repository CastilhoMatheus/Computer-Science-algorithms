/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myqueue;

/**
 *
 * @author matheus
 */
public class MyQueue {
    
    private int right = 0;
    private int[] queue;
    
    MyQueue(int n) {
        queue = new int[n];
    }
    
    public boolean isEmpty() {
        return right == 0;
    }
    
    public void enqueue(int data) {
        if (right == queue.length) {
            System.out.println("Queue is full");
        } else {
            queue[right++] = data;
        }
    }
    
    /*
        
        [] [] [] [] []
    
    */
    public int dequeue() {
        int deleted = queue[0];
        for (int i = 0; i < right; i++) {
            queue[i] = queue[i+1];
        }
        right--;
        return deleted;
    }
    
    public void printQueue() {
        for (int i = 0; i < right; i++) {
            System.out.print(queue[i] + " -> ");   
        }
        System.out.println("");
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyQueue q = new MyQueue(10);
        
        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.printQueue();
        
        q.dequeue();
        q.dequeue();
        
        
        q.printQueue();

    }
    
}
