package weekOneSept2015;

public class Problem10Two {
	public static void main(String[] args) {
		int N =2000000;
		long sum=0;
		boolean[] isPrime= new boolean[N];
		isPrime[0] = false;
		for (int i = 1; i <N; i++) {
			isPrime[i] = true;
		}
		
		for (int i = 2 ; i <N;i++) {
			if(isPrime[i-1]){
				 sum += i;
				 for (int j = 2*i; j < isPrime.length; j+= i) {
					isPrime[j-1] = false;
				}
			}
		}
		System.out.println(sum);
	}
	
}
