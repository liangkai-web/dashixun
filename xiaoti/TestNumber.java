package zuoye;

import java.util.Scanner;

public class TestNumber {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("������һ����������λ������:\n");//����̨��������
        int a=scan.nextInt();
        String s=""+a;
        System.out.println("λ��Ϊ��"+s.length());  
        for (int x = s.length()-1;x>=0;x--)
        {
        	int m;
        	m=x;
         System.out.print(s.toCharArray()[m]);
        }
	}

}
