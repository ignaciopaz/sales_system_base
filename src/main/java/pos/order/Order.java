package pos.order;

import java.util.ArrayList;
import java.util.Collection;

public class Order {

	private Collection<OrderLine> orderLines;
	
	public Order() {
		orderLines = new ArrayList<OrderLine>();
	}

	public void addItem(Product product, Integer quantity) {
		OrderLine orderLine = new OrderLine(product, quantity);
		orderLines.add(orderLine);
	}

	public Double getTotal() {
		double total=0;
		for (OrderLine orderLine : orderLines) {
			total += orderLine.getSubTotal();
		}
		return total;

	}

}
