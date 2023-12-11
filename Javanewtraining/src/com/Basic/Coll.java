package com.Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class Coll {
	public static void main(String[] args) {
		List<Object>x=new Vector<Object>();
		x.add("Orange");
		x.add("Apple");
		x.add(1000);
		x.add('A');
		x.add("Banana");
		System.out.println(x);
		int size=x.size();
		System.out.println(size);
		Object get=x.get(4);
		System.out.println(get);
		Object set=x.set(3,"Kiwi");
		System.out.println(set);
		System.out.println(x);
		Object remove=x.remove(1);
		System.out.println(remove);
		System.out.println(x);
		int indexOf=x.indexOf("Banana");
		System.out.println(indexOf);
		Boolean contains=x.contains("Apple");
		System.out.println(contains);
		List<Object>y=new LinkedList<Object>();
		y.add("Pear");
y.add("Apple");
System.out.println(y);
Object addAll=x.addAll(y);
System.out.println(addAll);
//Object removeAll=x.removeAll(y);
//System.out.println(x);
//Object retainAll=x.retainAll(y);
//System.out.println(x);
		
		
		
	}

}
