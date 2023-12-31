package ArrayE;

public class SortingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
		int sort=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>sort) {
				sort++;
				System.out.println(sort);
				
			}
			
			//System.out.println(arr[i]);
			
		}

	}

}
