package structs;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Item {

	public SimpleStringProperty name = new SimpleStringProperty("");
	public SimpleFloatProperty price = new SimpleFloatProperty(0.0f);
	public SimpleIntegerProperty amount = new SimpleIntegerProperty(0);
	public SimpleFloatProperty sum = new SimpleFloatProperty(0.0f);
	
	public Item() {
		this("", 0.0f, 0, 0.0f);
	}
	
	public Item(String _name, float _price, int _amount, float _sum) {
		setName(_name);
		setPrice(_price);
		setAmount(_amount);
		setSum(_sum);
	}
	
	 public String getName() {
	        return name.get();
	    }
	 
	    public void setName(String _name) {
	        name.set(_name);
	    }
	        
	    public float getPrice() {
	        return price.get();
	    }
	    
	    public void setPrice(float _price) {
	        price.set(_price);
	    }
	    
	    public int getAmount() {
	    	return amount.get();
	    }
	    
	    public void setAmount(int _amount) {
	    	amount.set(_amount);
	    }
	    
	    public float getSum() {
	    	return sum.get();
	    }
	    
	    public void setSum(float _sum) {
	    	sum.set(_sum);
	    }
	
}
