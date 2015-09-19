package weekOneSept2015;

public class Problem9 {
	public static void main(String[] args) {
		int a=0,b=0,c=0,n=0,m=0;
		for (int i = 1; i < 100; i++) {
			n=i;m=n+1;
			a = Math.abs(n*n-m*m);
			b=2*n*m;
			c= n*n+m*m;
			System.out.println("a "+ a+"b "+b+"c "+c);
			if(a+b+c==1000) {
				System.out.println(a*b*c);
				break;
			}
		}
	}
	
	public static void pythogen(){
		
	}
}
