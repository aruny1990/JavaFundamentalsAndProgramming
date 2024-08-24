package Practice;

import java.util.ArrayList;

class HashMap<K,V>{
	int capacity = 16;
	int size =0;
	ArrayList<Entry<K,V>> bucketMap;
	private class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		public Entry(K key, V value) {
			this.key=key;
			this.value=value;
			this.next=null;
		}
	}
	public HashMap() {
		bucketMap = new ArrayList<>();
		
		for(int i=0;i<capacity;i++) {
			bucketMap.add(null);
		}
	}
	
	public int getBucketId(K key) {
		return key.hashCode() % capacity;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public void put(K key, V value) {
		int bucketId = getBucketId(key);
		Entry<K,V> head = bucketMap.get(bucketId);
		
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head = head.next;
		}
		
		//Add the value
		size++;
		head = bucketMap.get(bucketId);
		Entry<K,V> newHead = new Entry<K,V>(key,value);
		newHead.next = head;
		bucketMap.set(bucketId, newHead);
	}
	
	public V get(K key) {
		int bucketId = getBucketId(key);
		Entry<K,V> head = bucketMap.get(bucketId);
		
		while(head!=null) {
			if(head.key.equals(key)) {
				System.out.println("head value is "+head.value);
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
}

public class HashMapImplementationTest
{

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("one", 1);
		
		System.out.println("size is "+map.size());
		System.out.println("check if hashmap is empty "+map.isEmpty());
		
		System.out.println("value for one is "+map.get("one"));
	}

}