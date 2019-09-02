package com.hero;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public final class FinalClassExample {

	private final String name;

	public String getName() {
		return name;
	}

	/**
	 * Accessor function for mutable objects
	 */

	/**
	 * Constructor performing Deep Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */

	public FinalClassExample(String n) {
		System.out.println("Performing Deep Copy for Object initialization");

		this.name = n;

	}

	/**
	 * Constructor performing Shallow Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */
	/**
	 * public FinalClassExample(int i, String n, HashMap<String,String> hm){
	 * System.out.println("Performing Shallow Copy for Object initialization");
	 * this.id=i; this.name=n; this.testMap=hm; }
	 */

	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy
	 * for creating immutable classes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

//		String s = "original";
//
//		FinalClassExample ce = new FinalClassExample(s);
//
//		// Lets see whether its copy by field or reference
//		System.out.println(s == ce.getName());
//
//		System.out.println("ce name:" + ce.getName());
//
//		// change the local variable values
//
//		s = "modified";
//
//		System.out.println("ce name after local variable change:" + ce.getName());

		HashMap<Integer, String> hp = new HashMap();
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(new Integer(2), "practice");
		sm.put(new Integer(3), "quiz");
		sm.put(new Integer(5), "code");
		sm.put(new Integer(4), "contribute");
		sm.put(new Integer(1), "geeksforgeeks");
		System.out.println(sm);

	}

}