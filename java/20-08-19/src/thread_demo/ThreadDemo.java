package thread_demo;



public class ThreadDemo implements Runnable{


	public static void main(String[] args) {
		ThreadDemo myThread = new ThreadDemo();
		Thread t1 = new Thread(myThread);//thread creation
		Thread t2 = new Thread(myThread);
		t1.start();
		t2.start();//thread start
	}

	@Override 
	public void run() {
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

}
