package com.tnsif.nonprimitive;

public class TwoDimenArray {

	public static void main(String[] args) {
		int[][] marks= {
				{20,19,17},
				{18,15,19},
				{18,19,16}
		};
		
		for(int i=0;i<marks.length;i++) {
			System.out.print("Student"+(i+1)+": ");
			for(int j=0;j<marks[i].length;j++) {
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
	}

}
