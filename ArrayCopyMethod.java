package ArrayE;

public class ArrayCopyMethod {
	public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length) {
		
	}

	public static void main(String[] args) {
		String[] copyFrom= {
				"Affogato","Americano","cappuccino","corretor","Cortado",
				"Doppio","espresso","Frappucino","Freddo","Lungo","Macchiato",
				"marocchino","Ristretto" };
		String[] copyTo=new String[7];
		System.arraycopy(copyFrom,2,copyTo,0,7);
		for(String coffee:copyTo) {
			System.out.println(coffee+" ");
		}

	}

}
