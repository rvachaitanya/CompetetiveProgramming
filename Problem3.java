package weekOneSept2015;

public class Problem3 {
	public static void main(String[] args) {
		long number = 600851475143L;
		int largestPrime = 0;
		for (int i = 1; i < number; i++) {
			if(number%i==0)
				{System.out.println("number "+number);
			number = number/i;
				}
			largestPrime = i;
		}
		System.out.println(largestPrime+1);
	}
}
