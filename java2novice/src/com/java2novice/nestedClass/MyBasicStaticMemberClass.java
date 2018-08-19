package com.java2novice.nestedClass;

public class MyBasicStaticMemberClass {
	public static class MyStaticMemberClassExample{
		public void printStatus(){
			System.out.println("Hey I am inside Static member Class");
		}
	}
	
	public static void main(String[] args){
		StaticMemberTestClass smtc = new StaticMemberTestClass();
		smtc.testMemberClass();
	}
}


class StaticMemberTestClass{
	public void testMemberClass(){
		MyBasicStaticMemberClass.MyStaticMemberClassExample msme = new MyBasicStaticMemberClass.MyStaticMemberClassExample();
		msme.printStatus();
	}
}
