package com.tnsif.nonprimitive;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] busStudents= new int[3][];
		
		busStudents[0] =new int[3];
		busStudents[1] =new int[5];
		busStudents[2] =new int[2];
		
		int roll=0;
		for(int i=0;i<busStudents.length;i++) {
			for(int j=0;j<busStudents[i].length;j++) {
				busStudents[i][j] = roll++;
				
			}
		}
		
		for(int i=0;i<busStudents.length;i++) {
			System.out.print("Bus"+(i+1)+ " :");
			for(int j=0;j<busStudents[i].length;j++) {
				System.out.print(busStudents[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
