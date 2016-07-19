package DP.Observer;

public class StockObserver implements Observer{

	private double apple;
	private double ibm;
	private double google;
	
	public StockObserver(Subject subject){
		subject.register(this);
	}
	
	@Override
	public void updatePrice(double apple, double ibm, double google) {
		// TODO Auto-generated method stub
		this.apple=apple;
		this.ibm=ibm;
		this.google=google;
		System.out.println("price of apple is " + apple +" and ibm is " + ibm +" and google " +google);
	}

	
}
