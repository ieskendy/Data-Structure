# Data-Structure
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACT;

/**
 *
 * @author student
 */
public class Stack {

    private int MAXSIZE;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        MAXSIZE = size;
        stackArray = new int[MAXSIZE];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == (MAXSIZE - 1));
    }

    public int pop() {
        return stackArray[top--];
    }

    public void push(int number) {
        stackArray[++top] = number;
    }

    private int peek() {
        return stackArray[top];
    }
}
