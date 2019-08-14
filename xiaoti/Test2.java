编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数 
1/1+1/3+...+1/n(利用指针函数)

package zuoye;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		   System.out.println("ÇëÊäÈën£º");
		   int a = s.nextInt();
		   int sum=0;
		   if(a%2==0) {
			   for(int i =2;i<=a;i=i+2) {
				   sum+=1/i;
				   System.out.println(sum); 
			   }
		   }else{
			   for(int n=1;n<=a;n=n+2) {
				   sum+=1/n;
				   System.out.println(sum); 
			   }

		   }
	}

}
