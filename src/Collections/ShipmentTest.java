package Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import org.junit.Test;

import static Collections.ProductFixtures.*;

public class ShipmentTest {

	private Shipment ship=new Shipment();
	
	@Test
	public void ShipmentAddTest(){
		ship.add(wood);
		ship.add(cotton);
		assertThat(ship, contains(wood,cotton));
	}
	
	@Test
	public void shouldRemoveProduct() {
		ship.add(wood);
		ship.add(cotton);
		ship.replace(wood, glass);
		assertThat(ship, contains(glass,cotton));
	}
}
