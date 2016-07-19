package Algo.general.consumer;

import java.util.Vector;


public class Consumer implements Runnable{
	private final Vector sharedQueue;
    private final int SIZE;

	
	public Consumer(Vector vector,int size){
		this.sharedQueue=vector;
		SIZE=size;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			
                System.out.println("Consumed: " + consume());
              //  Thread.sleep(50);
            

		}
	}
	
	private int consume(){
		while(sharedQueue.isEmpty()){
			synchronized (sharedQueue) {
				try {
					System.out.println("Queue is empty " + Thread.currentThread().getName()
                            + " is waiting , size: " + sharedQueue.size());


					sharedQueue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		synchronized (sharedQueue) {
			sharedQueue.notifyAll();
			return (Integer)sharedQueue.remove(0);
			
		}
	}

}
