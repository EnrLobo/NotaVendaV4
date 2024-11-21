package model;

public class SaleManager {

	private Sale sale = new Sale();
	private Stock stock;
	
	public SaleManager(Stock stock) {
		this.stock = stock;
	}
	
	public Sale getSale() {
		return sale;
	}
	
	public Stock getStock() {
		return stock;
	}
	
	public boolean createSaleItem(Product p, int quantity) {
		if(stock.verifySaleItem(p, quantity)) {
			sale.addSaleItem(new SaleItem(p, quantity));
			stock.decreaseItem(quantity, p);
			return true;
		}else {
			return false;
		}
	}
	
}
