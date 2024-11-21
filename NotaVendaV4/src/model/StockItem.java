package model;


public class StockItem {

	private int quantityStock;
	private Product product;
	
	public StockItem(Product product, int quantity) {
		this.product = product;
		this.quantityStock = quantity;
	}

	public void setQuantity(int quantity) {
		this.quantityStock = quantity;
	}
	
	public int getQuantity() {
		return quantityStock;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void decrease(int quantity){
		this.quantityStock -= quantity;
	}
	
	public void addStock(int quantity) {
		this.quantityStock += quantity;
	}
	
	@Override
	public String toString() {
		return "Produto: "+product.getDescription()+" Quantidade em estoque: "+this.quantityStock;
	}
}
