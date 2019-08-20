package producerConsumer;

public class Consumer implements Runnable {

	private MyStack myStack;

	public Consumer(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 26; i++) {
			try {
				System.out.println(myStack.pop());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
