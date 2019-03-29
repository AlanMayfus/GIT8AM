package com.test.git;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Baseclass {

		public static void main(String[] args) {
			Map <Integer,String>li=new LinkedHashMap<>();
			li.put(10, "sql");
			li.put(20, "java");
			li.put(30, "csharp");
			li.put(40, "spring");
			li.put(20,  "c++");
	System.out.println(li);
	//iteration
	Set<Entry<Integer,String>> a=li.entrySet();
	for(Entry<Integer,String> b:a)
	{
		System.out.println(b);
		System.out.println();
		System.out.println(b.getKey());
		System.out.println(b.getValue());
	}
	

	}
}
