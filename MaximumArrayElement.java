package ArrayE;

public class MaximumArrayElement {

	public static void main(String[] args) {
		int a[]= {2,9,7,9,56};
		int mini=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>mini) {
				mini=a[i];
			}
			
		}
		System.out.println("Mini number"+mini);

	}

}


