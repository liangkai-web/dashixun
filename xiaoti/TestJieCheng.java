求1+2!+3!+...+20!的和 
1.程序分析：此程序只是把累加变成了累乘。

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
