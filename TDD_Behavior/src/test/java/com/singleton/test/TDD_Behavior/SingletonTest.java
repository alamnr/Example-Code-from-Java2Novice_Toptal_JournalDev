package com.singleton.test.TDD_Behavior;

import org.junit.Test;

import com.singleton.TDD_Behavior.SingletonEnum;

import junit.framework.TestCase;

public class SingletonTest extends TestCase{
	
	@Test
	public void testSingletonInstanceShouldCreated(){
		
		//System.out.println(SingletonEnum.INSTANCE);
		
		SingletonEnum value = SingletonEnum.INSTANCE;
		
		//System.out.println(SingletonEnum.valueOf("INSTANCE"));
		
		assertEquals(value, SingletonEnum.INSTANCE);
		
		assertEquals(SingletonEnum.valueOf("INSTANCE"), SingletonEnum.INSTANCE);
		
	}

}
