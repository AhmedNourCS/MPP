package lab5.question4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	
	//use a factory method
	private Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
	}
	static Order newOrder(Customer cust, LocalDate date) {
		if(cust == null) throw new NullPointerException("Null customer");
		Order ord = new Order(date);
		cust.addOrder(ord);
		return ord;
	}
	void addItem(String name){
		items.add(new Item(name));
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}