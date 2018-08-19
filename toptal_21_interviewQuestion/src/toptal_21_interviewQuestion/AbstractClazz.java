package toptal_21_interviewQuestion;

import java.net.InetAddress;
import java.net.UnknownHostException;

public abstract class AbstractClazz {
	
	public AbstractClazz() {
		System.out.println("Abstract clazz cons");
	}
	abstract void run();
	
	public static class HostFinder implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			try {
				System.out.println(InetAddress.getByName("185.199.109.153").getHostName());
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	public static void main(String[] args){
		
		// blocking operation runs on separate Thread , in case of single thread (current thread) execution wait untill I/O complete
		// which blocks remaining operation
		Thread t = new Thread(new AbstractClazz.HostFinder() );
		t.start();
		
	/*	try {
			//  The join() method waits for a thread to die.
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		// remaining operation runs in current thread
		System.out.println("main method");
		AbstractClazz a = new AbstractClazz() {

			@Override
			void run() {
				System.out.println("Run");
				
			}
			
		};
		System.out.println(a.hashCode());
		a.run();
		
	}
	
	

}
