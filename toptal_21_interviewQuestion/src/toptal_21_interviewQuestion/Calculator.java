package toptal_21_interviewQuestion;

public class Calculator implements Runnable {
	long sum;

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<=1000000;i++){
				sum+=i;
			}
			notify();
			
		}
		
		
	}
	
	

}
