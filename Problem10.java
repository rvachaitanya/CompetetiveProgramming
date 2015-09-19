package weekOneSept2015;

public class Problem10 {
	public static void main(String[] args) {
		int sum =0;
		for (int i = 0; i < 1000000; i++) {
			if(prime(i)>0)
				sum+=prime(i);
		}
		System.out.println(sum);
	}
	
	public static int prime(int n){
		int local =0;
		for (int i = 2; i < n; i++) {
			if(n%i!=0) local++;
		}
		if(local==n-2)return n;
		else return 0;
	}
}
