package ZooKeeper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import Zoo.Animala;

public class Keeper {
	
	public static void main(String args[]) {
		
		checkCollection();
		
//		Integer[] num1=new Integer[11];
//		for(int i = 0;i<num1.length;i++) {
//			num1[i]=i;
//		}
//		System.out.println(num1[2]);
//		
//		
//		String[] abc= {"this", "us","hell","adsf"};
//		Arrays.sort(abc);
//		int a=2;
	}
	
	public static void checkCollection() {
		
		Collection<Animala> ani = new ArrayList<>();
		
		Animala baby1=new Animala(1,"Baby");
		Animala baby2=new Animala(2,"halwa");
		
		ani.add(baby1);
		ani.add(baby2);
		
		for(Animala a:ani) {
			a.toString();
//			ani.remove(a);   //this will throw error as modifying collection while iteration gives concurrentModificationError. However Iterators can be used in case we want to modify the collection at the same time we are looping over it
		}
		
		// now loop with iterator
		
		Iterator<Animala> it=ani.iterator();
		
		while(it.hasNext()) {
			System.out.println("\n Inside iterator");
			System.out.println(it.next());
			
//			it.remove(); // this can be used to remove element while looping over it
			
		}
	}

	
	
}

