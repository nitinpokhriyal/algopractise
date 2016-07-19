package DP.Observer;

public class ObserverTest {

	public static void main(String[] args){
		StockGrabber subject=new StockGrabber();
		StockObserver observer=new StockObserver(subject);
		subject.setApple(900.00);
		subject.setIbm(800.00);
		subject.setGoogle(850.00);
		
	}
	
}
