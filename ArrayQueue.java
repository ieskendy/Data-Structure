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
public class ArrayQueue {

    private int QSIZE;
    private int[] queue;
    private int nItems;
    private int front;
    private int rear;

    public ArrayQueue(int size) {
        QSIZE = size;
        queue = new int[QSIZE];
        front = 0;
        rear = -1;
        nItems = 0;

    }

    public void showQueue() {
        int i;
        for (i = 0; i < QSIZE; i++) {
            System.out.printf("Queue[%d] = %d\n", i, queue[i]);
        }
    }

    public boolean isEmpty() {
        if (nItems == 0) {
            System.out.println("QUEUE is EMPTY");
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (nItems == QSIZE) {
            System.out.println("Queue is FULL");
            return true;
        } else {
            return false;
        }
    }

    public boolean enqueue(int num) {
        System.out.print("Trying to enqueue " + num + "... ");
        if (!isFull()) {
            queue[nItems] = num;
            System.out.println("Added " + num);
            nItems++;
            return true;
        } else {
            System.out.println("Failed to enqueue " + num);
            return false;
        }
    }

    public long remove() // take item from front of queue
    {
        long temp = queue[front++]; // get value and incr front
        if (front == QSIZE) // deal with wraparound
        {
            front = 0;
        }
        nItems--;
// one less item
        return temp;
    }

    public void dequeue() {
        System.out.print("Dequeuing... ");
        if (!isEmpty()) {
            int num = queue[0];
            System.out.println("Removed " + num);
            rearrangeQueue();
        } else {
            System.out.println("Failed to dequeue");
        }
    }

    private void rearrangeQueue() {
        System.out.println("Rearranging Queue");
        int[] temp = new int[nItems];
        int i;
        for (i = 0; i < (nItems - 1); i++) {
            temp[i] = queue[i + 1];
        }
        nItems--;
        for (i = 0; i < QSIZE; i++) {
            if (i <= nItems) {
                queue[i] = temp[i];
            } else {
                queue[i] = 0;
            }
        }
    }

    public int peekFront() {
        return queue[0];
    }

    public int peekRear() {
        return queue[nItems];
    }

}
