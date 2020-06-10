package pos.order;

public class OrderLine {

	private Product product;
	private Integer qty;
	
	public OrderLine(Product product, Integer qty) {
		this.product = product;
		this.qty = qty;
		
	}
	
	public Product getProduct() {
		return product;
	}
	private Integer getQty() {
		return qty;
	}

	public Double getSubTotal() {
		return product.getPrice() * getQty();
	}

	

}
