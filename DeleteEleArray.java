package ArrayE;

public class DeleteEleArray {

	public static void main(String[] args) {
		int arr[]= new int[] {1,2,3,4,5,6};
		int key=2;
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
