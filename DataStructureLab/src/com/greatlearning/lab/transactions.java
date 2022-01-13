package com.greatlearning.lab;
import java.util.*;
public class transactions {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int size_of_array; 
		//get the size of array
		System.out.println("Enter the size of the transactions");
		size_of_array = sc.nextInt();
		//get values of the array
		int arr[]=new int [size_of_array];
		System.out.println("Enter the value of the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		//get target value
		int n;
		System.out.println("Enter the total no of targets that needs to be acheiver");
		n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			
			System.out.println("Enter the value of the target");
			int target= sc.nextInt();
			//finding if the target has acheive or not
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum = sum + arr[j];
			if(sum>=target) {
				System.out.println("The target has been acheive after "+(j+1)+" transaction");
				break;
			}if(j == arr.length-1 && sum< target) {
				System.out.println("The target is not acheive");
				break;
			}
			}
		}
		
	}

}
