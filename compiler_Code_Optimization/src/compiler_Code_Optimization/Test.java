package compiler_Code_Optimization;

public class Test {
	
	public static String foo(){
		System.out.println("Test foo called");
		return "";
		
	}
	public static int sumFromOneToN(int n) { 
		  if (n < 1) { 
		    return 0; 
		  } 
		 
		  return n + sumFromOneToN(n - 1); 
		} 
	
	/*public static String toString(){
		System.out.println("Test toString called");
		return "";
	}*/
	
	public static final void main(String[] args){
		Test obj = null;
		System.out.println(obj.foo());
		//System.out.println(sumFromOneToN(1000000000));
		//System.out.println(sumFromOneToN(1000000000,0));
		System.out.println(sumFromOneToN_Iteration(1000000000));
	}
	
	public  static double sumFromOneToN_Iteration(double n) { 
		  double a = 0; 
		 
		  while(n > 0) { 
		    a += n--; 
		  } 
		   
		  return a; 
		} 
	
	public static int sumFromOneToN(int n, int a) { 
		  if (n < 1) { 
		    return a; 
		  } 
		 
		  return sumFromOneToN(n - 1, a + n); 
		}

}
