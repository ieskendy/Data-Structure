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
public class LinkedList {

    private Node head;
    private int listCount;

    public LinkedList() {
        head = new Node(null);
        listCount = 0;
    }

    public void add(Object data) {
        Node temp = new Node(data);
        Node current = head;
        while (current.getNext() != null) {
            current.setNext(temp);
            listCount++;
        }
    }

    public void add(Object data, int index) {
        Node temp = new Node(data);
        Node current = head;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        listCount++;
    }

    public Object get(int index) {
        if (index <= 0) {
            return null;
        }
            Node current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null){
                return null;
            }
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean remove(int index) {
        if (index < 1 || index > size()) {
            return false;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return false;
            }
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }

    public int size() {
        return listCount;
    }

    public String tostring() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }
}
