package weekOneSept2015;

public class Problem6 {
	public static void main(String[] args) {
		System.out.println( squareOfSums(100)-sumOfSquares(100) );
	}

	private static long squareOfSums(int n) {
		long sum =0;
		for(int i=0;i<=n;i++){
			sum +=i;
		}
		System.out.println(sum*sum);
		return sum*sum;
	}

	private static long sumOfSquares(int n) {
		long sum =0;
		for (int i = 0; i <=n; i++) {
			sum += i*i;
		}
		System.out.println(sum);
		return sum;
	}
}
