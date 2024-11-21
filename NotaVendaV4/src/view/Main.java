package view;

import model.Stock;
import model.Product;
import model.Sale;
import model.SaleManager;
import model.StockItem;

public class Main {

	public static void main(String[] args) {
		Product soda = new Product();
		soda.setDescription("Guaraná Antartica");
		soda.setPrice(10);
		
		Product cheese = new Product();
		cheese.setDescription("Mussarela");
		cheese.setPrice(0.04);
		
		Product ham = new Product();
		ham.setDescription("Mortadela");
		ham.setPrice(0.02);
		
		StockItem stockSoda= new StockItem(soda,20);
		StockItem stockCheese = new StockItem(cheese,2000);
		StockItem stockHam = new StockItem(ham,2000);
		
		Stock stock1 = new Stock();
		
		stock1.addItemStock(stockSoda);
		stock1.addItemStock(stockCheese);
		stock1.addItemStock(stockHam);
		
		SaleManager saleManager = new SaleManager(stock1);
		
		if(saleManager.createSaleItem(soda, 5)) {
			System.out.println("Item adicionado à venda com sucesso!!!");
			System.out.println(saleManager.getSale().getItems());
			
			System.out.println("Dados do Estoque:");
			System.out.println(stock1.toString());
			
			}else {
			System.out.println("Quantidade insuficiente em estoque");
		}
	}
}
