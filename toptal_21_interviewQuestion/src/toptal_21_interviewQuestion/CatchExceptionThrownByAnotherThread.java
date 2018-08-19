package toptal_21_interviewQuestion;

public class CatchExceptionThrownByAnotherThread {

	public static void main(String[] args) {
		// create our uncaught exception handler
		
		Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Uncaught Exception-"+e);
				
			}
		};
		
		// create another thread
		Thread otherThread = new Thread(){
			public void run(){
				System.out.println("Sleeping...");
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					System.out.println("Interrupted");
				}
				
				System.out.println("Throwing Exception....");
				throw new RuntimeException();
			}
		};
		
		// set our uncaught exception handler as nthe one to be used when the new 
		// thread throws an uncaught exception
		otherThread.setUncaughtExceptionHandler(handler);
		
		// start the other thread - our uncaught exception handler will be invoked when
		// the other thread throws an uncaught exception
		otherThread.start();

	}

}
