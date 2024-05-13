/*
 * AssociationTable represents an association table with generic keys and values so we can create any table we wish.
 */
import java.util.Iterator;
import java.util.TreeMap;

public class AssociationTable <T extends Comparable<T>, E> {
	
	//We will use a TreeMap to represent the associationTable since it's always getting automatically sorted by it's key values
	private TreeMap<T, E> map;
	public AssociationTable(){
		map = new TreeMap<>();
	}
	public AssociationTable(T[] keys, E[] values) throws IllegalArgumentException{
		if(keys.length != values.length) {
			throw new IllegalArgumentException();
		}
		
		map = new TreeMap<>();
		for(int i = 0; i < keys.length; i++) {
			if(map.containsKey(keys[i])) {
				map.remove(keys[i]);
			}
			map.put(keys[i], values[i]);
		}
	}
	public void add(T key, E value) {
		if(this.map.containsKey(key)) {
			this.map.remove(key);
		}
		this.map.put(key, value);
	}
	public E get(T key) {
		if(!map.containsKey(key)) {
			return null;
		}
		return this.map.get(key);
	}
	public boolean contains(T key) {
		return this.map.containsKey(key);
	}
	public boolean remove(T key) {
		if(!this.map.containsKey(key)) {
			return false;
		}
		
		this.map.remove(key, this.map.get(key));
		return true;
	}
	public int size() {
		return this.map.size();
	}
	public Iterator<T> keyIterator() {
		
		return map.keySet().iterator();
	}
	public String toString() {
		
		return map.toString();
	}
}

