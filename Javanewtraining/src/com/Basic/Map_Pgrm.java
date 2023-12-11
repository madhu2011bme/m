package com.Basic;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Map_Pgrm {

	public static void main(String[] args) {
		Map<Integer,String> a=new Hashtable<>();
		a.put(13,"G");
		a.put(11,"L");
		a.put(10,"Z");
		a.put(16,"O");
		a.put(15,"K");
		System.out.println(a);
		
		int size=a.size();
		System.out.println(size);
		Object get=a.get(4);
		System.out.println(get);
		Set<Integer> keySet=a.keySet();
		System.out.println(keySet);
		Collection<String> values=a.values();
		System.out.println(values);
		boolean containsKey=a.containsKey(11);
		System.out.println(containsKey);
		boolean containsValue=a.containsValue("A");
		System.out.println(containsValue);
		
		System.out.println(a);
		Set<Entry<Integer,String>> entrySet=a.entrySet();
		System.out.println(entrySet);
	}

}
