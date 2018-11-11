package CollectionsThis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
	
	public static final int LIGHT_VAN_MAX_HEIGHT=20;
	
	List<Product> sp=new ArrayList<>();

	public void add(Product p) {
		sp.add(p);
	}
	
	public void replace(Product oldProduct, Product newProduct) {
		int index=sp.indexOf(oldProduct);
		sp.set(index, newProduct);
	}
	
	public Iterator<Product> iterator(){
		return sp.iterator();
		
	}

}
