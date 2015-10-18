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
public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList theList = new LinkedList();
        theList.add("5");
        theList.add("10");
        theList.add("6");
        theList.add("11");
        theList.add("35");
        
        System.out.println("theList - print linkedlist: " + theList);
        System.out.println("Print the size of the linked list: " + theList.size());
        System.out.println("Remove the 2nd element: " + theList.remove(2));
        System.out.println("Get the 3rd element: " + theList.get(1));
        System.out.println("Print the size of the Linked List: " + theList.size());
        System.out.println("Print the linkedlist: " + theList);
    }
}
