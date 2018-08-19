package com.effective.java.Effective_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strings = {"0","1","2","3","4"};
		
		// Translate string array into list of integers
		List<Integer> integers  = new ArrayList<Integer>();
		for(String s : strings){
			integers.add(Integer.valueOf(s));
		}
		
		Comparator<Integer> cmp = new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				//return o1<o2 ? -1 :(o1==o2?0:1);
				//return o1<o2 ? -1 :(o1>o2?1:0);
				//return o1<o2 ? -1 :(o1.equals(o2)?0:1);
				int i = o1;
				int j = o2; 
				return i<j ? -1 :(i==j?0:1);
			}
		};
		
		System.out.println(
				Collections.binarySearch(integers, 1, cmp)
				);
		
		arrayType(strings);
	}
	
	static void arrayType(Object[] objArray){
		objArray[0] = 2;
		
		for(Object o : objArray){
			System.out.println(o);
		}
	}

}
