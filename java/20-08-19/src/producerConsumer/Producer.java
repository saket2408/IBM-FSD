package producerConsumer;

public class Producer implements Runnable {

	private MyStack myStack;

	public Producer(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 26; i++) {
			try {
				myStack.push((char) ((char) i + 65));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
