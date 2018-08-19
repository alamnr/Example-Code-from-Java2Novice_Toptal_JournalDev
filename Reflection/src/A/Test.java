package A;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	static Boolean b11[] = new Boolean[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "XYZ";
		String y = "India";
		String z= x+y;
		String p = "XYZIndia";
		System.out.println(z==p);
		
		boolean b1= false;
		boolean b2 = false;
		
		if(b2 != b1 == !b2)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		List<Integer> list = new ArrayList<Integer>();
		Add(list);
		
		System.out.println(b11[0]);
		
		int i=2;
		int a[] = {10, 20, 50,45,95,14};
		a[i]=  a[i=i++];
		System.out.println(a[i]);
		
		 long acctNo = 100001234;
		 
		 System.out.println(acctNo);
		
	}
	public static void Add(List<? extends Number> abcd){
		
	}
}
