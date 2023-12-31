package ArrayE;

public class countDuplicateEle {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,2,1,3,4,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.println(arr[j]);
				}
			}
			
		}
		


	}

}
