package ArrayE;

public class DuplicacyInarray {

	public static void main(String[] args) {
//		int a[]= new int[] {1,2,2,3,4,5,6};
//		int temp[]= new int[a.length];
//		int j=0;
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]!=a[i+1]) {
//				temp[j]=a[i];
//				j++;
//			}
//		
//		}
//		temp[j]=a[a.length-1];
//		
//		for(j=0;j<temp.length;j++) {
//			System.out.println(temp[j]);
//		}
//		
		
		
		
		int arr[]= new int[] {1,2,2,3,4,5,6};
		int temp[]= new int[arr.length-1];
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		for( j=0;j<temp.length;j++) {
			System.out.println(temp[j]);
		}
	}
		

}
