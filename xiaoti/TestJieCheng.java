package zuoye;

public class TestJieCheng {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		int m=1;
		for(i=1;i<=20;i++) {
			m=m*i;
			sum+=m;
		}
		System.out.println(sum);
	}
}
