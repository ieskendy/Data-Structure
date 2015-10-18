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
public class ArrayQueueApp {

    public static void main(String[] args) {
        ArrayQueue app = new ArrayQueue(5); // queue holds 5 items//
        app.enqueue(10);
        app.enqueue(20);
        app.enqueue(30);
        app.enqueue(40);
        app.enqueue(50);
        // remove
        app.remove();
        app.remove();
        app.remove();
        // insert more
        app.enqueue(20);
        app.enqueue(30);
        app.enqueue(90);
        app.enqueue(60);
        
        while (!app.isEmpty()) { 
        // remove and display
        //long n = theQueue.remove()
            long n = app.remove();
            System.out.print(n);
            System.out.print("");
            System.out.println("");
        }
        
    }
}
