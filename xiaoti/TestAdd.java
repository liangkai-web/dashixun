package zuoye;

import java.util.Scanner;

public class TestAdd {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("���������:\n");//����̨��������
        int a = scan.nextInt();
        System.out.print("����������:\n");//����̨��������
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
