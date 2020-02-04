
public class CLearWater {
public static void main(String[] args) {
	int []arr={4,1,2,3,3};
	
	for(int i=0;i< arr.length;i++){
		int count=i;
		
		for(int j=i+1;j<arr.length;j++){
			int leftSum=arr[0];
			int rightSum=arr[arr.length-1];
			if(count>=0){
				leftSum=leftSum+arr[count];
				count--;
				}
			rightSum=rightSum+arr[j];
			if(leftSum==rightSum){
				System.out.println(i);
			}
			
			
		}
	}
}
}
