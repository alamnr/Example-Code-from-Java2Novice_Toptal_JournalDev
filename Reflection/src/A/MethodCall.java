package A;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodCall {
	
	public static void main(String[] args)
	{
		Class c;
		try {
			//c = Class.forName("A.A");
			c = A.class;
			Object o = c.newInstance();
			Method m = c.getDeclaredMethod("message", null);
			m.setAccessible(true);  
			m.invoke(o, null);
			
			Method m1 = c.getDeclaredMethod("message", new Class[]{int.class});
			m1.setAccessible(true);  
			m1.invoke(o, 4);
			
			
		} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
