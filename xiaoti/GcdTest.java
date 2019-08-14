输入两个正整数m和n，求其最大公约数和最小公倍数。 
package zuoye;

import java.util.Scanner;

public class GcdTest {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个整数:\n");//控制台输入数字
        int a = scan.nextInt();
        System.out.print("请输入第二个整数:\n");//控制台输入数字
        int b = scan.nextInt(); 
        int m = a*b;
        int c ;
        if(a>=b) {
        	do {
        	c=a%b;
        	a=b;
        	b=c;   	//碾除法
        }while(c!=0);
        	System.out.println("最大公约数为："+a);
            int t =m/a;
            System.out.println("最小公倍数为："+t); 
        }  else {                     //当a<b时的情况
        	int n;
        	n=a;
        	a=b;
        	b=n;
        	do {
        	c=a%b;
        	b=a;
        	a=c; 	
        	}while(c!=0);
        	System.out.println("最大公约数为："+b);
        	int t = m/b;
        	System.out.println("最小公倍数为："+t);	
        }
        }
	}

