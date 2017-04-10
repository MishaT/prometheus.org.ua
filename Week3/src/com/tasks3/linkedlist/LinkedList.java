package com.tasks3.linkedlist;


public class LinkedList {
    private int listCount;
    private Node headNode;
	
	public LinkedList() {
        headNode = new Node();
        headNode.setData(null);
        listCount = 0;
	}

	public void add(Integer data) {
        Node newNode = new Node();
        Node currentNode = headNode;
        newNode.setData(data);
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
        listCount++;
	}

	public Integer get(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }
        Node current = headNode;
        for (int i = 0; i <= index; i++) {
            current = current.getNext();
        }
        return current.getData();
	}

	public boolean delete(int index) {
        if (index < 0 || index > size()) {
            return false;
        }
        Node current = headNode;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
	}

	public int size() {
        return listCount;
	}
}   
      