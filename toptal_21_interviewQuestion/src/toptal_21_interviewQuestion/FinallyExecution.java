package toptal_21_interviewQuestion;

public class FinallyExecution {
	
	public static void main(String[] args){
		try{
			 FinallyExecution.divide(100, 0);
		}
		finally{
			System.out.println("Finally in main");
		}
	}
	
	public static void divide(int n, int div){
		try{
			int ans = n/div;
		}
		finally{
			System.out.println("Finally of divide");
		}
	}

}
