package com.tnsif.nonprimitive;

public class StrBuilder {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("hello");
		
			sb.append(" Students");
			System.out.println("Append : "+sb);
		
			sb.insert(6,"TKR ");
			System.out.println("Insert : "+sb);
		
			sb.replace(6, 10, "CSD ");
			System.out.println("Replace : "+sb);
		
			sb.delete(6,10);
			System.out.println("Delete : "+sb);
		
			sb.reverse();
			System.out.println("Reverse : "+sb);
		
			sb.reverse();
		
			System.out.println("Length : "+sb.length());
		
			System.out.println("Capacity : "+sb.capacity());
		
			sb.setCharAt(0,'b');
			System.out.println("Setting Character: "+sb);
		
			String sub =sb.substring(0,6);
			System.out.println("Substring: "+sub);

	

	}

}
