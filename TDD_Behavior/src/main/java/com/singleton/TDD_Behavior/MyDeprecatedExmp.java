package com.singleton.TDD_Behavior;

public class MyDeprecatedExmp {
	 @Deprecated
	    public void showDeprecatedMessage(){
	        System.out.println("This method is marked as deprecated");
	    }
	     
	    @SuppressWarnings("deprecation")
	    public static void main(String a[]){
	         
	        MyDeprecatedExmp mde = new MyDeprecatedExmp();
	        mde.showDeprecatedMessage();
	    }
}
