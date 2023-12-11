package com.Basic;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set_Pgm {
	public static void main(String[] args) {
LinkedHashSet<Object> abc=new LinkedHashSet<Object>();
abc.add("Dell");
abc.add("Apple");
abc.add("Asus");
abc.add(1000);
abc.add('Z');
System.out.println(abc);
Object size=abc.size();
System.out.println(size);
boolean remove=abc.remove('Z');
System.out.println(remove);
System.out.println(abc);
boolean contains=abc.contains("Asus");
System.out.println(contains);
HashSet<String>xyz=new HashSet<String>();
xyz.add("Lenovo");
xyz.add("Apple");
xyz.add("Dell");
System.out.println(xyz);
boolean addAll=abc.addAll(xyz);
System.out.println(addAll);
System.out.println(abc);
boolean retainAll=abc.retainAll(xyz);
System.out.println(retainAll);
System.out.println(abc);
boolean removeAll=abc.removeAll(xyz);
System.out.println(removeAll);
System.out.println(abc);
	}
	
}
