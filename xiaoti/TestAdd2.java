有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 
1.程序分析：请抓住分子与分母的变化规律。

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
