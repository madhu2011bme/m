package com.Basic;

public class Str_Meth {

	public static void main(String[] args) {
		String s= "ALL IS Well";
		String t= "ALL is Fine";
				int length=s.length();
				System.out.println(length);
				Boolean equals=s.equals(t);
				System.out.println(equals);
				Boolean equalsIgnoreCase=s.equalsIgnoreCase(t);
				System.out.println(equals);
				String toUpperCase=s.toUpperCase();
				System.out.println(toUpperCase);
				String toLowerCase=t.toLowerCase();
				System.out.println(toLowerCase);
			    boolean startsWith=t.startsWith("A");
				System.out.println(startsWith);
				boolean endsWith=s.endsWith("t");
				System.out.println(endsWith);
				boolean contains=s.contains("ALL");
				System.out.println(contains);
				int indexOf=t.indexOf("i");
				System.out.println(indexOf);
				int lastIndexOf=s.lastIndexOf("L");
				System.out.println(lastIndexOf);
				String replaceFirst=t.replaceFirst("L", "l");
				System.out.println(replaceFirst);
				String [] split=s.split(" ");
				for(String x:split) {
					System.out.println(x);
				}
				String concat= s.concat(t);
				System.out.println(concat);
				
				
				
				
				
				
				
				

	}

}
