package com.java2novice.nestedClass;

import com.java2novice.nestedClass.MyStaticMemberNestedInterface.MyStaticInterface;

public class MyStaticMemberInterfaceTest implements MyStaticMemberNestedInterface.MyStaticInterface{

	@Override
	public void implementMe() {
		System.out.println("Hey I have implemented successfully.");
		
	}
	
	public static void main(String[] args){
		MyStaticMemberInterfaceTest msi = new MyStaticMemberInterfaceTest();
		msi.implementMe();
	}

}

class MyStaticMemberNestedInterface{
	public static interface MyStaticInterface{
		public void implementMe();
	}
}
