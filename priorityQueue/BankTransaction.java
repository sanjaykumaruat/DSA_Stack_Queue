package com.priorityQueue;


class BankTransaction {
    String transactionId;
    String type;
    int priority;

    BankTransaction(String transactionId, String type, int priority) {
        this.transactionId = transactionId;
        this.type = type;
        this.priority = priority;
    }
}
