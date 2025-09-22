package com.tnsif.nonprimitive;
import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		ArrayList<String> languages= new ArrayList(); 
		languages.add("telugu");
		languages.add("english");
		languages.add("hindi");
		
		System.out.println("languages :"+languages);
		
		languages.add("tamil");
		languages.add("sanskrit");
		
		System.out.println("languages updated :"+languages);

	}

}
