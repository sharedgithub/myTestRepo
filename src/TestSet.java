import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// sets are used when uniqueness and fast lookup matters
// 
public class TestSet {
	
	public static void main(String[] args) {
		// use hash set when insertion order is not important
		Set<String> s=new HashSet<>();
		s.add("His");
		s.add("Tis");
		s.add("Lis");
		s.add("Ais");
		Iterator<String> i =s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//check tree set for order
		// tree sets are red black tree based implementation of navigableset interface
		
		// for hash implementation we need to override equals and hasCode method
		// for Tree implementation we need to implement ordering
		//		1) Natural order java.lang.comparable
		//		2) java.util.comparator
		
		Set<String> s2=new TreeSet<>();
		s2.add("His");
		s2.add("Tis");
		s2.add("Lis");
		s2.add("Ais");
		
		Iterator<String> i2 =s2.iterator();
		
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		

		//for tree set you can use either of these two declaration
		Set<TestArrays> t=new TreeSet<>(new TestArraysComparator());
		Set<TestArrays> t2=new TreeSet<>(); ///this will throw exception if the class does not implements comparable
											// as it is a tree implementation the class must either implement comparable or 
											// use comparator as shown above
		TestArrays a1=new TestArrays(1,"this");
		TestArrays a2=new TestArrays(1,"Phis");
		TestArrays a3=new TestArrays(3,"this");
		t.add(a1);
		t.add(a2);
		t.add(a3);
		System.out.println("---tree set");
		
		
		Iterator<TestArrays> i3=t.iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		
		
		
		/* linkedhasset is linked list and hash table implementation of set
		 	hashset is hash table implementation of set
			hash table is key value implementation of arrarys  also called as associative array
			for the key it uses hash code and in value it stores actual values(key value which user provides)
			
			for hastable we have arrays of linked list
			each element of that array is called a bucket
			each bucket then stores the key value pair
			now access the bucket is done with the help of hashcode which helps to quickly locate the bucket
		
		
			so all the collections having Linked keyword is better for bulk removeAll and retainAll
			as they are linked so removal of element does not require existing eleemnt to shift
			
			
		*/
		
		// LinkedHasSet also preserve the order
		// linked hash set is faster than hashset when it comes to iteration of element
		// as linked hash set are linked elements and hash set is based on hashtable where bucket is searched first for hashcode
		
		Set<String> abc = new LinkedHashSet<>();
		abc.add("abc");
		
		Iterator<String> b= abc.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
		
	}// End of main

	
	


}
