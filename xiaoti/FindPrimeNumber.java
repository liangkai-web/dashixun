题目：判断101-200之间有多少个素数，并输出所有素数。 
1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 
则表明此数不是素数，反之是素数。
package zuoye;

public class FindPrimeNumber {
	public static void main(String[] args) {
		
	   for(int i=101;i<201;i++) {
		   for(int m =2;m<i;m++) {
		if(i%m==0) { 
			break;
		}else if(m==i-1)
			System.out.println(i);			
		}
	}
	
	}

	}
	

