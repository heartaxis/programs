package com.programs.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PrefixHierarchy {

	public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
		// Write your code here
		List<Integer> prefixList=new ArrayList<>();
		for(String search:query) {
			int cntr=0;
			for(String name:names) {
				if(name.startsWith(search) && name.length()>search.length()) {
					cntr++;
				}
			}
			prefixList.add(cntr);
		}
		return prefixList;

	}
	
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("steve");
		names.add("stevens");
		names.add("danny");
		names.add("steves");
		names.add("dan");
		names.add("steve");
		names.add("johnny");
		names.add("kaka");
		
		List<String> query=new ArrayList<>();
		query.add("steve");
		query.add("dan");
		query.add("john");
		query.add("kaka");
		List<Integer> list=findCompletePrefixes(names,query);
		System.out.println(list);
	}
}
