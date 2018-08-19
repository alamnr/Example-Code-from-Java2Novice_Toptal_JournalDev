package com.redhat.developers.Item_1;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formattable;
import java.util.Formatter;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;

public class PhoneNumber implements Formattable, Comparable<PhoneNumber> {
	
/*	1. Use STATIC FACTORY METHODS instead of constructors

	ADVANTAGES

	    Unlike constructors, they have names
	    Unlike constructors, they are not requires to create a new object each time they're invoked
	    Unlike constructors, they can return an object of any subtype of their return type
	    They reduce verbosity of creating parameterized type instances
	    
	    DISADVANTAGES

    If providing only static factory methods, classes without public or protected constructors cannot be subclassed (encourage to use composition instead inheritance).
    They are not readily distinguishable from other static methods (Some common names (each with a different pourpose) are: valueOf, of, getInstance, newInstance, getType and newType)


*/
	private static final PhoneNumber COMMON = new PhoneNumber(123, 1234);
	
	private final int areaCode;
	private final int number;
	
	// Eager initialize
	//private final int hashCode;
	
	// lazy initialize
	private int hashCode;
	
	private PhoneNumber(int areaCode, int number) {
		this.areaCode = areaCode;
		this.number = number;
		// Eager initialize
		//this.hashCode = Objects.hashCode(this.areaCode,this.number);
	}
	
	public static PhoneNumber of(int areaCode, int number) {
		Preconditions.checkArgument(areaCode>100);
		Preconditions.checkArgument(number>1000);
		if(areaCode == 123 && number == 1234){
			return COMMON;
		}
		return new PhoneNumber(areaCode, number);
	}
	
	@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if(obj instanceof PhoneNumber){
				PhoneNumber other = (PhoneNumber)obj;
				return this.areaCode == other.areaCode && this.number == other.number;
				//return Objects.equal(this.areaCode, other.areaCode) && this.number == other.number;
			}
			return false;
		}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return Objects.hashCode(this.areaCode,this.number);
		// Lazy Load
		int result  = this.hashCode;
		if(result == 0)
		{
			result = Objects.hashCode(this.areaCode,this.number);
		}
		hashCode = result ;
		return result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return MoreObjects.toStringHelper(this)
				.add("areaCode", areaCode)
				.add("number", number)
				.toString();
	}
	
	public void formatTo(Formatter formatter, int flags, int width, int precision) {
		// TODO Auto-generated method stub
		formatter.format("%d-%d", areaCode,number);
		
	}
	
	private static final Comparator<PhoneNumber> COMPARATOR = Comparator.comparingInt((PhoneNumber p)-> p.areaCode).thenComparingInt(p->p.number);			
			
	public int compareTo(PhoneNumber o) {
		// TODO Auto-generated method stub
		/*return ComparisonChain.start()
				.compare(this.areaCode, o.areaCode)
				.compare(this.number, o.number)
				.result();*/
		return COMPARATOR.compare(this, o); 
		
	}
	
	public static void main(String[] args){
		System.out.println(PhoneNumber.of(123, 1234));
		System.out.println(String.format("%s", PhoneNumber.of(123, 1234)));
		PhoneNumber p1 = PhoneNumber.of(123, 1234);
		PhoneNumber p2 = PhoneNumber.of(124, 1235);
		PhoneNumber p3 = PhoneNumber.of(125, 1236);
		ArrayList<PhoneNumber> list = new ArrayList<>();
		list.add(p1);list.add(p2);list.add(p3);
		Collections.sort(list);
		list.sort(COMPARATOR);
		System.out.println(list);
		
		
	}
	
	
	

}
