package ArrayE;

public class CopyArrayelementInArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int [] b= new int[a.length];
		
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			
		}
		//System.out.println(b[0]);
		System.out.println("Copied Array");
		for(int ele:b) {
			System.out.println(ele);
		}
	}

}
