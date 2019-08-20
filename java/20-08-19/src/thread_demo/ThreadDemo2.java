package thread_demo;

public class ThreadDemo2 extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			for(int i = 0; i<40 ; i++) {
				System.out.println("==> "+ i);
				if(i==10) {
					Thread.sleep(2000);//blocked state for 2 sec
				}
				if(i==30) {
					Thread.sleep(3000);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String args[]) {
		ThreadDemo2 myThread = new ThreadDemo2();
		myThread.start();
	}

}
