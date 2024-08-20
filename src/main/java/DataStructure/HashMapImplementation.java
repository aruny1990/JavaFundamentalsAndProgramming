package DataStructure;

import java.util.ArrayList;

class HashMap<K, V> {
    private class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private ArrayList<Entry<K, V>> bucketArray;
    private int capacity;
    private int size;

    public HashMap() {
        bucketArray = new ArrayList<>();
        capacity = 16; // Default capacity
        size = 0;

        for (int i = 0; i < capacity; i++) {
            bucketArray.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % capacity;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = bucketArray.get(bucketIndex);

        // Check if key is already present
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value; // Update value
                return;
            }
            head = head.next;
        }

        // Insert key-value pair
        size++;
        head = bucketArray.get(bucketIndex);
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = head;
        bucketArray.set(bucketIndex, newEntry);

        // If the load factor goes beyond 0.7, then double the hash table size
        if ((1.0 * size) / capacity >= 0.7) {
            ArrayList<Entry<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            capacity = 2 * capacity;
            size = 0;
            for (int i = 0; i < capacity; i++) {
                bucketArray.add(null);
            }

            for (Entry<K, V> headNode : temp) {
                while (headNode != null) {
                    put(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = bucketArray.get(bucketIndex);

        // Search key in the chain
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        // Key not found
        return null;
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = bucketArray.get(bucketIndex);

        Entry<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        size--;
        if (prev != null) {
            prev.next = head.next;
        } else {
            bucketArray.set(bucketIndex, head.next);
        }

        return head.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class HashMapImplementation {
	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Value for key 'one': " + map.get("one"));
        System.out.println("Size of map: " + map.size());

        map.remove("two");
        System.out.println("Size of map after removal: " + map.size());
        System.out.println("Value for key 'two': " + map.get("two"));

        System.out.println("Is map empty?: " + map.isEmpty());

}
}