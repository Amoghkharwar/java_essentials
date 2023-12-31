package ArrayE;

public class mostrecuringEle {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,3,4,5,6,7,8,9};
		
		int mxcount=0;
		int feq=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>mxcount) {
				feq=arr[i];
			}
		}
		System.out.println(feq);

	}

}
