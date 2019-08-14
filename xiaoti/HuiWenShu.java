一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。

package zuoye;

import java.util.Scanner;

public class HuiWenShu {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个五位的数字:\n");//控制台输入数字
        int n = scan.nextInt();
        String s=""+n;
        if(s.length()<5) {
        	System.out.println("输入错误，请输入一个五位数字");	
        }
        int a=n/10000;//得到万位数字
        int b=n/1000%10;
        int c=n/100%10;
        int d=n/10%10;
        int e=n%10;
        if(a==e&&b==d) {
        	System.out.println("该数是回文数");
        }else {
        	System.out.println("该数不是回文数");
        }

        }
	}

