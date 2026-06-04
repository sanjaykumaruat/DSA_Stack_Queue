package com.priorityQueue;

import java.util.PriorityQueue;
import java.util.Collections;

public class P2_MaxHeapDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
