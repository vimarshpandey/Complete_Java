package com.revision.java;

import javax.sql.rowset.JoinRowSet;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[5];
		arr[2] = new int[2];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 100);
			}
		}
		
		for(int a[] : arr) {
			for(int num : a) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
