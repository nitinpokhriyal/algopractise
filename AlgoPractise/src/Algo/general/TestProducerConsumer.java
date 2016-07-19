package Algo.general;

import java.util.Vector;

import Algo.general.consumer.Consumer;
import Algo.general.producer.Producer;

public class TestProducerConsumer {

	public static void main(String[] args){
		
		Vector sharedQueue = new Vector();
        int size = 4;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue, size), "Consumer");

        prodThread.start();
        consThread.start();

        
        
	}
}
