package weekOneSept2015;

public class Problem5 {
	public static void main(String[] args) {
		int[] list = new int[20];
		int product =1;
		
		for (int i = 1; i < list.length; i++) {
			list[i] = i;
			System.out.println(list[i]);
		}
		
		for (int i = 1; i < list.length; i++) {
			for (int j = 1; j < list.length; j++) {
			if(list[i]%j==0){
				list[i]=list[i]/j;
				product *= i;
				}
			}
		}
		
		for (int i = 1; i < list.length; i++) {
			list[i] = i+1;
			System.out.println(list[i]);
		}
		
		for (int i = 1; i < list.length; i++) {
			product *= list[i];
		}
		
		System.out.println(product);
	}
}
