package ArrayE;

public class searchEleOfarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,2,3,4,2,5,6};
		int key=2;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				System.out.println("Inex no"+i+" "+arr[i]);
			}
		}

	}

}
