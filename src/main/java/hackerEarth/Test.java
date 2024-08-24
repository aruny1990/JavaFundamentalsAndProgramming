package hackerEarth;

import java.util.ArrayList;

class HashMap<K,V> {

	int capacity;
	int size;
	class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key, V value) {
			this.key=key;
			this.value = value;
			this.next= null;
		}
		
		
	}
	
	ArrayList<Entry<K,V>> bucketList;
	
	public HashMap() {
		capacity = 16;
		size=0;
		bucketList = new ArrayList<Entry<K,V>>();
		
		for(int i=0; i<capacity;i++) {
			bucketList.add(null);
		}
	}
	
	public void put(K key, V value) {
		
		int bucketId = getBucketId(key);
		Entry<K,V> head = bucketList.get(bucketId);
		
		//Check if head has value
		while(head!=null) {
			if(head.value.equals(value)) {
				head.value = value;
			}
			head = head.next;
		}
		
		size++;
		head = bucketList.get(bucketId);
		Entry<K,V> newEntry = new Entry<K,V>(key,value);
		newEntry.next= null;
		bucketList.set(bucketId, newEntry);
		
		
	}

	private int getBucketId(K key) {
		// TODO Auto-generated method stub
		return key.hashCode()%capacity; //range 0 -15
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public V get(K key) {
		int bucketId = getBucketId(key);
		Entry<K, V> head = bucketList.get(bucketId);
		
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
}


public class Test{
	
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap();
		map.put("one", 1);
		map.put("two", 2);
		System.out.println("Size of the hasmap is "+map.size());
		System.out.println("check if the hashmap is empty "+map.isEmpty());
		System.out.println("Value of entry one is "+map.get("one"));
		System.out.println("Value of entry two is "+map.get("two"));
	}
}