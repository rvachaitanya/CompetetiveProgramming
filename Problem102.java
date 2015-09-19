package weekOneSept2015;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Problem102 {
	public static void main(String[] args) {

		try {
			
			Reader file = new File(".Users/chaitanya/Desktop/coordinates.txt");
			//FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(file);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
// T = \frac{1}{2} | (x_A - x_c)(y_B-y_A) - (x_A - x_B)(y_C-y_A)|
		int x1 = -340,x2 = -153,x3 = 835;
		int y1 = 495,y2 = -910,y3 = -947;
		//int x1 = 1, x2 =2, x3 =3;
		//int y1= 1,y2 =2 , y3 =3;
		int x0 =0,y0=0;
		int count =0;
		
		if(area(x1,x2,x3,y1,y2,y3)==area(x0,x2,x3,y0,y2,y3)+area(x1,x0,x3,y1,y0,y3)+area(x1,x2,x0,y1,y2,y0))
		{
			count++;
		}
		
		
	}
	
	public static int area(int x1,int x2,int x3, int y1,int y2,int y3){
		return 1/2*Math.abs(x1*y2 - x1*y3 - x2*y1 +x3*y1 + x2*y3 -x3*y2);
	}
}
