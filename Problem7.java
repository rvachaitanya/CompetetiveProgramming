package weekOneSept2015;

public class Problem7 {
	public static void main(String[] args) {
		nextPrime(3);
	}

	private static void nextPrime(int q) {
		int counter =0;
		for(int i=2;i<10;i++){
			for (int j = 2; j < i; j++) {
				System.out.println(i+" i n j "+j);
				if(i!=j && i%j==0){
					System.out.println(counter);
					counter++;
				}
				if(counter==q) System.out.println(i+" break");
				//break;
			}
			
		}
		
	}
}
