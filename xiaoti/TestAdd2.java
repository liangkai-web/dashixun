package zuoye;

public class TestAdd2 {
	public static void main(String[] args) {
		int x=2;
		int y=1;
		double sum=0;
		for(int i=0;i<20;i++) {
			sum+=(double)x/y;
			int  t;
			t=y;
			y=x;
			x=t+y;
			System.out.println(sum);
			
		}
		
	}

}
