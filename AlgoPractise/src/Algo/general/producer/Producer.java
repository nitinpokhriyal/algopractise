package Algo.general.producer;

import java.util.Vector;


public class Producer implements Runnable{

	private final Vector sharedQueue;
    private final int SIZE;

	
	public Producer(Vector vector,int size){
		this.sharedQueue=vector;
		SIZE=size;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 7; i++) {
            System.out.println("Produced: " + i);
            try {
                produce(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
		
	}
	
	private void produce(int i) throws InterruptedException{
		while(SIZE==sharedQueue.size()){
			synchronized (sharedQueue) {
					System.out.println("Queue is full " + Thread.currentThread().getName()
                            + " is waiting , size: " + sharedQueue.size());

					sharedQueue.wait();
				
			}
			
			
		}
		synchronized (sharedQueue) {
			sharedQueue.add(i);
			sharedQueue.notifyAll();
		}

	}
	

}
