package weekOneSept2015;

public class Problem5Two {
	public static void main(String[] args) {
		
		System.out.println(lcm(1,lcm(2,lcm(3,lcm(4,lcm(5,lcm(6,lcm(7,lcm(8,lcm(9,lcm(10,lcm(11,lcm(12,lcm(13,
				lcm(14,lcm(15,lcm(16,lcm(17,lcm(18,lcm(19,20))))))))))))))))))));
	}

	private static long gcd(long i, long j) {
		if(j==0) return i;
		else return gcd(j,i%j);
	}
	
	private static long lcm(long i,long j){
		return i*j/gcd(i,j);
	}
	
}
