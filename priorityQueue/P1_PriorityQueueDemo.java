package com.priorityQueue;

import java.util.PriorityQueue;

public class P1_PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
