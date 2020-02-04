package com.test.goldmansas;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, 6, 4, 6 };
		int min = 0;
		for (int i : arr) {
			if (min < i) {
				min = i;
			}
		}

		for (int i : arr) {
			if (min > i) {
				min = i;
				break;
			}
		}

		System.out.println("Second min no : " + min);
		int[] arrRo ={ 3,4,5,6,7,1,2 };
		//{4,5,6,1,2,3};
		//{ 3,4,5,6,7,1,2 };
		//{6,7,8,1,2,3,4,5};
		//{5,6,1,2,3,4};
		//{6, 7, 8, 9, 1, 2, 3, 4, 5} ;
		//{ 8, 1, 2, 3, 4, 5, 6, 7 };
		//{4,5,6,1,2,3}
		int arr1[]={'a','b'};
		for(int i: arr1){
			System.out.println(i);
		}
		
		
		System.out.println(secondSmallestElementInRotation(arrRo, 0, arrRo.length - 1));
	}

	static int secondSmallestElementInRotation(int arr[], int left, int right) {
			
			if((left==right)){
				return arr[left+1];
			}
			int mid = (left + right) / 2;
			if (arr[left] > arr[mid]) {
				return secondSmallestElementInRotation(arr, left, mid);

			} else if (arr[mid] > arr[right]) {
				
				return secondSmallestElementInRotation(arr, mid+1 , right);
			}else{
				return arr[1];
			}
	}

}
