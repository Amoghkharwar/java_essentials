package ArrayE;

public class Recuringarray {

	public static void main(String[] args) {
		int arr[]= new int[] {2,4,4,5,6,2,1,2};
		int maxcount=0;
		int count =0;
		int mfeq=0;
		for(int i=0;i<arr.length;i++) {	
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				//count=maxcount;
				mfeq=arr[i];
			}
			
			
		}
		System.out.println(mfeq);
		
		
	}

}
