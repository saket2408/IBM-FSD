package producerConsumer;

public class Tester {
	private final static MyStack mystack = new MyStack();
	public static void main(String[] args) {
		Producer producer = new Producer(mystack);
		Consumer consumer = new Consumer(mystack);
		
		Thread p = new Thread(producer);
		Thread c = new Thread(consumer);
		p.start();
		c.start();
	}

}
