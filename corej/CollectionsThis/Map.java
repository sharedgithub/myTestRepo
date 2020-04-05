package CollectionsThis;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map {
	public static void main(String[] args) {
		TestArrays t=new TestArrays(1,"3sdf");
		TestArrays t2=new TestArrays(1,"3sdf");
		
		
		TreeMap<TestArrays,Integer> m=new TreeMap<TestArrays,Integer>((new TestArraysComparator()) );
	
		
		m.put( new TestArrays(2,"Anuj"),2);
		m.put(new TestArrays(8,"Anuj"),8);
		m.put(new TestArrays(5,"Anuj"),5);
		
		Iterator<TestArrays> i=m.keySet().iterator(); //key iterator
		Iterator<Integer> b=m.values().iterator(); // value iterator
		
		while(i.hasNext()) {
			System.out.println(m.get(i.next()));
		}
//		System.out.println(m.size());
//		if(m.containsKey(1)) {
//			
//		}
//		
//		m.containsValue("Anuj");
////		m.remove(key);
//		
////		entrySet(): returns a Set view of the mappings contained in this map. Therefore we can iterate over mappings in the map like this:
//		//entry is an interface to provide methods to acccess key values of a map
//		Set<Entry<Integer,TestArrays>> entries=m.entrySet();
//		
//		for(Entry<Integer,TestArrays> entry:entries) {
//			entry.getValue();
//			entry.getKey();
//		}
	}
}




/** some new things

.getOrDefault(Key,value)
.putIfAbsent(key,value)
.replace(key,existingValue,newValue)
.remove(key,value)...remove if key & value exist
.removeIf
