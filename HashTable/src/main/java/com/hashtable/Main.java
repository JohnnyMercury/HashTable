package com.hashtable;

public class Main {
    public static void main(String[] args) {
        com.hashtable.HashTable hashTable = new com.hashtable.HashTable(10);

        // Insert 10 key-value pairs
        for (int i = 0; i < 10; i++) {
            hashTable.insert(i, "Value" + i);
        }

        System.out.println("Hash Table Before Deletion:");
        hashTable.printTable();

        // Perform Deletion
        hashTable.delete(5);

        System.out.println("Hash Table After Deletion:");
        hashTable.printTable();

        // Perform Lookup
        String value = hashTable.lookup(5);
        System.out.println("Lookup Key 5: " + (value == null ? "Not Found" : value));
    }
}
