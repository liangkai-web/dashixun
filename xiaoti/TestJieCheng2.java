利用递归方法求5!。 
1.程序分析：递归公式：fn=fn_1*4!

package zuoye;

public class TestJieCheng2 {
	public static void main(String[] args) {
		int i;
		int sum=1;
		for(i=1;i<=5;i++) {
			int m=1;
			m=m*i;
			sum=m*sum;
			System.out.println(sum);
		}
	}

}
