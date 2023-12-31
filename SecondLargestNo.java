package ArrayE;

public class SecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {10,70,80,30,20};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}
		System.out.println("second lrgest"+arr[1]);

	}

}
