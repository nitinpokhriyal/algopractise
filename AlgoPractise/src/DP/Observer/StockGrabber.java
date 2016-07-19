package DP.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject{

	List<Observer> observers=null;
	
	private double ibm;
	private double apple;
	private double google;
	
	public StockGrabber(){
		observers=new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void unRegister(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer:observers){
			observer.updatePrice(this.apple, this.ibm, this.google);
		}
	}

	public void setApple(double price){
		this.apple=price;
		notifyObservers();
	}
	
	public void setGoogle(double price){
			this.google=price;
			notifyObservers();
	}

	public void setIbm(double price){
		this.ibm=price;
		notifyObservers();
	}
	
}
