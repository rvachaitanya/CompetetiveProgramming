package weekOneSept2015;

public class FibbanochiEven {
	 public static void main(String[] args) {
		 int a =1,b=2,next =0,sum=0;
		 for (int i = 0; i < 4000001; i++) {
		if(next<=4000000){	 
			next = a+b;
			//System.out.println("next "+ next);
			a= b;
			//System.out.println("a "+ a);
			b = next;
			//System.out.println("b "+b);
			if(next%2==0)
				sum += next;
		}
	}
		 System.out.println(sum);
	}
}
