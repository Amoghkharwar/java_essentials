package ArrayE;

public class sortAscendinfDecending {

	public static void main(String[] args) {
		int arr[]= new int[] {2,7,6,9,5};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Ascending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
