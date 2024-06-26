package com.collection.sagility;

import java.util.Comparator;

public class CityComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getCityName().compareTo(o2.getCityName());
	}
	

}
