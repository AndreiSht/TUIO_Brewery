package brewery;

import java.util.ArrayList;

public class StateManager {

	private int state;
	private int capacity;
	private ArrayList<Item> items;
	
	public StateManager() {
		super();
	}
	
	public StateManager(int state, int capacity, ArrayList<Item> items) {
		super();
		this.state = state;
		this.capacity = capacity;
		this.items = Brewery.createItems();
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
}
