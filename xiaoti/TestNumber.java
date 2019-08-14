给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。

package zuoye;

import java.util.Scanner;

public class TestNumber {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个不多于五位的数字:\n");//控制台输入数字
        int a=scan.nextInt();
        String s=""+a;
        System.out.println("位数为："+s.length());  
        for (int x = s.length()-1;x>=0;x--)
        {
        	int m;
        	m=x;
         System.out.print(s.toCharArray()[m]);
        }
	}

}
