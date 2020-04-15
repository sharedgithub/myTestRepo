package CollectionsThis;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import lombok.Data;

/*
 * List
 * Set
 * Map
 * Arrays
 * Collections
 * 
 * 
 * 
 */

public class Practice_Collection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List abc=new LinkedList();
		abc.addAll(Arrays.asList(Integer.valueOf(34),
			"234",
			Integer.valueOf(35)
		));
	
		abc.clear();
		
		
		abc.forEach(System.out::println);
	}
	
	
	
}


