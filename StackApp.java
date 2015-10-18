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
public class StackApp{

    public static void main(String[] args) {
        System.out.println ("The Stack:)");
        Stack app = new Stack (10);
        app.push(50);
        app.push(45);
        app.push(40);
        app.push(35);
        app.push(30);
        app.push(25);
        app.push(20);
        app.push(15);
        app.push(10);
        app.push(5);
        
        while (!app.isEmpty()){
            int value = app.pop();
            System.out.print (value);
            System.out.print(" ");
        } 
        System.out.println (" ");
    }
}
