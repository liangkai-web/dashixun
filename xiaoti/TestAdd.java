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
