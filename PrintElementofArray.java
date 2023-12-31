package ArrayE;

public class PrintElementofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
System.out.println("-------------------------------------------------------");		
		
		
		//print negative
		int num[]= {1,-2,-4,6,-3};
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<0) {
				System.out.println(num[i]);
			}
			
		}
		System.out.println("-------------------------------------------------");
		
		// sum of array
		int sum=0;
		int num1[]= {10,20,40,60,80};
		for(int i=0;i<num1.length;i++) {
			sum=sum+num1[i];
			
		}
		System.out.println(sum);
		
	System.out.println("--------------------------------------");	
		
		int num2[]= {10,20,50};
		int max=num2[0];
		for(int i=0;i<num2.length;i++) {
			if(num2[i]>max) {
				
			}
			
		}
		System.out.println("Max no: "+max);
		
		int a[]= {2,9,7,9,56};
		int mini=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<mini) {
				mini=a[i];
			}
			
		}
		System.out.println("Mini number :"+mini);
		

	}

}
