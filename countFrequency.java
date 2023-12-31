package ArrayE;

public class countFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 2,2, 3, 4, 5, 6, 4 };
		int freq[] = new int[arr.length];		
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=visited;
				}
				if(freq[i]!=visited) {
					freq[i]=count;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(freq[i]!=visited) {
				System.out.println("frequency "+" "+arr[i]+" "+freq[i]);
			}
		}


	}

}
