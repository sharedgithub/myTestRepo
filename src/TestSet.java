import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	
	public static void main(String[] args) {
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
		Set<String> s2=new TreeSet<>();
		s2.add("His");
		s2.add("Tis");
		s2.add("Lis");
		s2.add("Ais");
		
		Iterator<String> i2 =s2.iterator();
		
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		

		
		Set<TestArrays> t=new TreeSet<>();
		TestArrays a1=new TestArrays(1,"this");
		TestArrays a2=new TestArrays(1,"Phis");
		TestArrays a3=new TestArrays(3,"this");
		t.add(a1);
		t.add(a2);
		t.add(a3);
		
		Iterator<TestArrays> i3=t.iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
	}



}
