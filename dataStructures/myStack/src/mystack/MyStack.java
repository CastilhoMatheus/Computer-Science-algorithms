/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mystack;

/**
 *
 * @author matheus
 */
public class MyStack {

    
    int top;
    int n;
    int[] stack;
    
    MyStack(int capacity) {
        top = -1;
        stack = new int[capacity];
    }
    
    public boolean isEmpty() {
        return top < 0;
    }
    
    public int push(int data) {
        return stack[top += 1] = data;
    }
    
    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        else {
            System.out.println("Empty stack");
            return -1;
        }
    }
    public int peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            return -1;
        }
    }
    
    public int printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print("| "+ stack[i] + " |");
        }
        System.out.println("");
        return -1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack stack = new MyStack(10);
        
        System.out.println(stack.isEmpty());
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.printStack();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        
        System.out.println(stack.peek());
    }
    
}
