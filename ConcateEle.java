package ArrayE;

public class ConcateEle {

	public static void main(String[] args) {
		int a[] = new int[] {1,2,3,4,5};
		int b[] = new int[] {6,7,8,9,0};
		int a_len=a.length;
		int b_len=b.length;
		int c_len=a_len+b_len;
		int c[] = new int[c_len];
		
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
			
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		
		

	}

}
