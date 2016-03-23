package com.arun.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		/*
		 * Navigable map may be used where you have data cached in memory and you want to do range
		 * based queries. Ex. In a map of Employees with Key=EmployeeID and Value=EmployeeInfo
		 * you want info of employees with in range of employee IDs.
		 */
		
		NavigableMap<String,String> nvm = new TreeMap<>();
		nvm.put("A", "W");
		nvm.put("B", "X");
		nvm.put("C", "Y");
		nvm.put("D", "Z");
		
		System.out.println(nvm.descendingMap());
		System.out.println(nvm);
		System.out.println(nvm.higherKey("B"));
		System.out.println(nvm.lowerKey("B"));
		System.out.println(nvm.floorEntry("B"));
		System.out.println(nvm.ceilingKey("B"));
		System.out.println(nvm.floorKey("B"));
		System.out.println(nvm.tailMap("B")); //Inclusive by default
		System.out.println(nvm.subMap("B", "D")); //First key included and last excluded by default
	}

}

