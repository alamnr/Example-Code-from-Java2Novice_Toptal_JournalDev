package com.effective.java.Effective_Java;

public class SimpleQuestion {
	
	static boolean yesOrNo(String s){
		s = s.toLowerCase();
		if(s.equals("yes") || s.equals("y") || s.equals("t")){
			s = "true";
		}
		
		
		//return Boolean.getBoolean(s);
		return Boolean.parseBoolean(s);
	}
	
	public static void main(String[]  args){
		System.out.println(yesOrNo("true")+" "+yesOrNo("YeS"));
		//System.out.println(Boolean.getBoolean("yes"));
	}

}
