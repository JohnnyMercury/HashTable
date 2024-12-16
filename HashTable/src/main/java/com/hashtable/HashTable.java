package com.hashtable;

import java.util.LinkedList;

public class HashTable {
    private static class Entry {
        int key;
        String value;
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry>[] table;

    public HashTable(int size) {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % table.length;
    }

    public void insert(int key, String value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value; // Update value
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public void delete(int key) {
        int index = hash(key);
        table[index].removeIf(entry -> entry.key == key);
    }

    public String lookup(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    public void printTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Index " + i + ": ");
            for (Entry entry : table[i]) {
                System.out.print("(" + entry.key + ", " + entry.value + ") ");
            }
            System.out.println();
        }
    }
}
