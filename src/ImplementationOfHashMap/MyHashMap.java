package ImplementationOfHashMap;

public class MyHashMap<K, V> {
    private static final int  INITIAL_SIZE = 1<<4; //16
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    Entry[] hashTable;

    MyHashMap(){

        hashTable= new Entry[INITIAL_SIZE];
    }

    MyHashMap(int capacity) {
        int tableSize = tableSizeFor(capacity);
        hashTable= new Entry[tableSize];
    }

    final int tableSizeFor(int cap) {
        int n = -1 >>> Integer.numberOfLeadingZeros(cap - 1);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public void put(K key, V value) {

        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if(node == null) {

            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        } else {
            Entry previousNode = node;
            while (node != null) {
                if (node.key == key) {
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key,value);
            previousNode.next = newNode;
        }
    }

    public V get(K key) {

        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        while(node != null) {
            if(node.key.equals(key)) {
                return (V)node.value;
            }
            node = node.next;
        }
        return null;
    }
}
