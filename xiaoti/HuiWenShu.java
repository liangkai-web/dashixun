package zuoye;

import java.util.Scanner;

public class HuiWenShu {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("������һ����λ������:\n");//����̨��������
        int n = scan.nextInt();
        String s=""+n;
        if(s.length()<5) {
        	System.out.println("�������������һ����λ����");	
        }
        int a=n/10000;//�õ���λ����
        int b=n/1000%10;
        int c=n/100%10;
        int d=n/10%10;
        int e=n%10;
        if(a==e&&b==d) {
        	System.out.println("�����ǻ�����");
        }else {
        	System.out.println("�������ǻ�����");
        }

        }
	}

