求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。 
1.程序分析：关键是计算出每一项的值。
package zuoye;

import java.util.Scanner;

public class TestAdd {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入基数:\n");//控制台输入数字
        int a = scan.nextInt();
        System.out.print("请输入项数:\n");//控制台输入数字
        int b = scan.nextInt(); 
        int sum=0;  
        for(int i=0;i<b;i++) {
        	sum+=a;
        	a=a*10;
        	a+=b;
        }
	        System.out.println("sum="+sum);
	}

}
