package model;

import java.util.ArrayList;
import java.util.List;

public class Stock {

	private List<StockItem> sItem = new ArrayList<>();
	
	public void addItemStock(StockItem sItem) {
		this.sItem.add(sItem); 
	}
	
	public void decreaseItem(int quantity, Product product){
		for(StockItem stock : sItem) {
			if(product.equals(stock.getProduct())) {
				stock.decrease(quantity);
			}
		}
	}
	
	public boolean verifySaleItem(Product product, int quantity) {
		for (StockItem stock : sItem) {
			if(product.equals(stock.getProduct())) {
				if(stock.getQuantity() >= quantity) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return sItem.toString();
	}
	
}
