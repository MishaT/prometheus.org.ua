package com.tasks3.linkedlist;

class LinkedListRunner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));

        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            list.add(i);
            cnt++;
        }
        list.delete(2);
        System.out.print("cnt " + cnt + " ");
        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            System.out.print("," + list.get(i));
        }
    }

}
