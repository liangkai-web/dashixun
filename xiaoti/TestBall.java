package zuoye;

public class TestBall {
	public static void main(String[] args) {
		double i=100;
		double s=100;
		for(int j=1;j<11;j++) {
			i=i/2;
			s=s+i;	
		}
		i=i/2;
		System.out.println("第十次落地时的高度是："+i+"\n小球共经过："+s+"米");
	}
}
