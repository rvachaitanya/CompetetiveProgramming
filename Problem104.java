package weekOneSept2015;

public class Problem104 {
	 public static void main(String[] args) {
		 int next[] = new int[100];
		 //int individualDigit[] = new int[100];
		 int a[] =new int[100];
		 int b[] =new int[100];
		 a[0] =1;
		 b[0] =1;
		 next =calc(a,b);
		 System.out.println(next[0]);
		 a=b;
		 b=next;
		 next = calc(a,b);
		 System.out.println(next[0]);
		 
		 for (int i = 0; i < 6; i++) {
			 a=b;
			 b=next;
			 next = calc(a,b);
			 System.out.println(next[0]); 	
		}
		 
		 /*for (int i = 0; i < 10; i++) {	 
			next[i] = a+b;
			//System.out.println("next "+ next);
			a = b;
			//System.out.println("a "+ a);
			b  = next[i];
			System.out.println("next "+next[i]);	
	}
		
		 for (int i = 0; i < next.length; i++) {
			for (int j = 0; j < individualDigit.length; j++) {
                 individualDigit[j] =         				
			}
		}*/
	}
	 
	 public static int[] calc(int[] a,int[] b){
		 int[] c = new int[100];
		 c[0] = a[0]+b[0];
		 return c;
	 }
	 
	 
	 
	 
}
