package ArrayE;

public class RotatetheElement {


	public static void main(String[] args) {
		
		int arr[] = new int[] {1,3,2,7,4,6};
		int n=3;
		for(int i=0;i<arr.length;i++) {
			System.out.println("\t"+arr[i]);
		}
		int j,last;
		for(int i=0;i<n;i++) {
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;			
		}
		System.out.println("Rotate array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("\t"+arr[i]);
		}

	}
	
	
	
	

}
