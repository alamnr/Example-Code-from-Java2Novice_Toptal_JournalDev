package toptal_21_interviewQuestion;

public class ThreadWaitNotify {

	public static void main(String[] args) {
		Calculator thread = new Calculator();
		Thread calc = new Thread(thread);
		calc.start();
		/*try {
			calc.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		synchronized (calc) {
			try {
				calc.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(thread.sum);

	}

}
