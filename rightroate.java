package ArrayE;

public class rightroate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,2,3,4,5};
		int n=1;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int last,j;
		for(int i=0;i<n;i++) {
			last =arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println("Totetate");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("\t"+arr[i]);
		}
	}

}
