package CollectionsThis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductFixtures {

	public static Product wood=new Product("wood",80);
	public static Product glass=new Product("glass",90);
	public static Product cotton=new Product("cotton",54);
	
	static List<Product> c=new ArrayList<>();
	public static void main(String[] args) {
		c.add(wood);
		c.add(glass);
//		c.retai
//		System.out.println(c.toString());
	}
}
