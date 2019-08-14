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
	

