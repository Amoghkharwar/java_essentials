package ArrayE;

public class InsertEleArray {

	public static void main(String[] args) {
		int arr[]= new int[] {10,20,30,40,50};
		int pos=3;
		int ele=100;
		for(int j=arr.length-1;j>pos-1;j--) {
			arr[j]=arr[j-1];
		}
		arr[pos-1]=ele;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("Deleted!!!!!..............");
		int key=100;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}

}
