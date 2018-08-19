package com.journaldev.classloader;

public class ClassLoaderTest {

	public static void main(String args[]){
		System.out.println("Class loader for hashmap: "+ java.util.HashMap.class.getClassLoader());
		//System.out.println("Class Loader for DNS Name Service: "+ sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
		System.out.println("class loader for this class : " + ClassLoaderTest.class.getClassLoader());
		//System.out.println(com.mysql.jdbc.Blob.class.getClassLoader());
	}
}
