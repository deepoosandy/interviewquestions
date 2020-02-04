package com.test.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr={20,-1,1,5,3,7,19,10,18};
		arr=bubbleSort(arr);
		for(int i=0;i<arr.length;i++)System.out.print(arr[i]+" ");
		int[] arr1={20,-1,1,5,3,7,19,10,18};
		arr1=insertionSort(arr1);
		System.out.println();
		for(int i=0;i<arr1.length;i++)System.out.print(arr1[i]+" ");
	}
	
	private static int[] bubbleSort(int [] arr){
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] insertionSort(int [] arr){
		
		for(int i=1;i<arr.length;i++){
			int key=arr[i];
			int j=i-1;
			while((j>-1)&& (key < arr[j])){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		return arr;
	}
}
