package com.priorityQueue;

import java.util.PriorityQueue;

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}

public class P5_TaskScheduler {

    public static void main(String[] args) {

        PriorityQueue<Task> pq = new PriorityQueue<>(
            (a, b) -> a.priority - b.priority
        );

        pq.add(new Task("Low Priority Task", 3));
        pq.add(new Task("High Priority Task", 1));
        pq.add(new Task("Medium Priority Task", 2));

        while (!pq.isEmpty()) {
            Task task = pq.poll();
            System.out.println(task.name);
        }
    }
}
