题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如： 
153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
package zuoye;

public class FindDaffodilNumber {

	public static void main(String[] args) {
		for(int a=1;a<10;a++) {
			for(int b=0;b<10;b++) {
				for(int c=0;c<10;c++) {
					int m =a*a*a*a+b*b*b+c*c*c;//三位数三个数字的三次方和
					int n = a*100+b*10+c;//得到的三位数
					if(m==n) {//两个数字做比较
						System.out.println(m);
						break;
					}
				}
				
			}
		}
	}

	}
	

