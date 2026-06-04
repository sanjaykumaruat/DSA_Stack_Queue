package com.priorityQueue;


import java.util.PriorityQueue;

public class BankingPriorityQueue {

    public static void main(String[] args) {

        // Min heap based on priority
        PriorityQueue<BankTransaction> pq =
                new PriorityQueue<>((a, b) -> a.priority - b.priority);

        // Adding transactions
        pq.add(new BankTransaction("TXN1001", "Normal Transfer", 3));
        pq.add(new BankTransaction("TXN1002", "Fraud Alert", 1));
        pq.add(new BankTransaction("TXN1003", "High Value Transfer", 2));
        pq.add(new BankTransaction("TXN1004", "Balance Inquiry", 4));

        // Processing transactions
        while (!pq.isEmpty()) {
            BankTransaction txn = pq.poll();
            System.out.println(
                    "Processing: " + txn.transactionId +
                    " | Type: " + txn.type +
                    " | Priority: " + txn.priority
            );
        }
    }
}
