import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map {
	public static void main(String[] args) {
		TestArrays t=new TestArrays(1,"3sdf");
		TestArrays t2=new TestArrays(1,"3sdf");
		
		
		TreeMap<Integer,TestArrays> m=new TreeMap<>();
		// here we cant use Map<Interger,TestArrays> like with List and Sets
		
		m.put(2, new TestArrays(1,"Anuj"));
		m.put(3, new TestArrays(1,"Anuj"));
		m.put(5, new TestArrays(1,"Anuj"));
		
		Iterator<Integer> i=m.keySet().iterator();
		
		while(i.hasNext()) {
			System.out.println(m.get(i.next()));
		}
		System.out.println(m.size());
		if(m.containsKey(1)) {
			
		}
		
		m.containsValue("Anuj");
//		m.remove(key);
		
//		entrySet(): returns a Set view of the mappings contained in this map. Therefore we can iterate over mappings in the map like this:
		
		Set<Entry<Integer,TestArrays>> entries=m.entrySet();
		
		for(Entry<Integer,TestArrays> entry:entries) {
			entry.getValue();
			entry.getKey();
		}
	}
}
