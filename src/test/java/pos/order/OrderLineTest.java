package pos.order;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OrderLineTest {
	private Product productPrice1;
	private Product productPrice0p5;
	
	@Before public void beforeEach() {
		productPrice1 = new Product("Mirror", Double.valueOf(1));
		productPrice0p5 = new Product("fork", Double.valueOf(0.5));
	}

	@Test public void Should_SubTotalIs1_When_Adding1ProductWithPrice1() {		
		OrderLine orderLine = new OrderLine(productPrice1, 1);
		Double total = orderLine.getSubTotal();
		
		assertEquals(Double.valueOf(1), total);
	}
	@Test public void Should_SubTotalIs2_When_Adding2ProductsWithPrice1() {		
		OrderLine orderLine = new OrderLine(productPrice1, 2);
		Double total = orderLine.getSubTotal();
		
		assertEquals(Double.valueOf(2), total);
	}
	
	@Test public void Should_SubTotalIs3p5_When_Adding7ProductWithPrice0p5() {		
		OrderLine orderLine = new OrderLine(productPrice0p5, 7);
		Double total = orderLine.getSubTotal();
		
		assertEquals(Double.valueOf(3.5), total);
	}
}
