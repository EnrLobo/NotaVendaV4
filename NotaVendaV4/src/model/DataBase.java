package model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

	private static Map<String, String[]> products = new HashMap<String, String[]>();
	
	private static Map<String, PaymentMethod> payments  = new HashMap<String, PaymentMethod>();
	
	static {
		products.put("ga", new String[]{"Guarana Antartica", "5"});
		products.put("mo", new String[]{"Mortadela", "0.01"});
		products.put("mu", new String[]{"Mussarela", "0.08"});
		products.put("pa", new String[] {"Pao", "0.75"});
		
		CreditCard creditCard = new CreditCard(5.0);
		DebitCard debitCard = new DebitCard(0.0);
		Cash cash = new Cash(5.0);
		
		payments.put("cc", creditCard);
		payments.put("dc", debitCard);
		payments.put("c", cash);
	}
	
	public static String[] selectProduct(String code) {
		return products.get(code);
	}
	
	public static PaymentMethod selectPayment(String payment){
		return payments.get(payment);
	}
}
