package ArrayE;

public class separateevenodd {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even"+arr[i]);
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2!=0) {
				System.out.println("odd"+arr[j]);
			}
		}
		
		
		

	}

}
