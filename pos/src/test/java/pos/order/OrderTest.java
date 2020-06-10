package pos.order;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {
	private Order order;
	private Product productPrice1;
	private Product productPrice0p5;

	@BeforeEach public void beforeEach() {
		//Creates a clean order to use in each test
		order = new Order();
		productPrice1 = new Product("Mirror", Double.valueOf(1));
		productPrice0p5 = new Product("fork", Double.valueOf(0.5));
	}

	@Test public void Should_TotalIs1_When_Adding1ProductWithPrice1() {		
		order.addItem(productPrice1, 1);
		Double total = order.getTotal();
		
		assertEquals(Double.valueOf(1), total);
	}
	@Test public void Should_TotalIs2_When_Adding2ProductsWithPrice1() {
		
		order.addItem(productPrice1, 2);
		Double total = order.getTotal();
		
		assertEquals(Double.valueOf(2), total);
	}
	@Test public void Should_TotalIs3p5_When_Adding7ProductWithPrice0p5() {		
		order.addItem(productPrice0p5, 7);
		Double total = order.getTotal();
		
		assertEquals(Double.valueOf(3.5), total);
	}
}
