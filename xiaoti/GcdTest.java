package zuoye;

import java.util.Scanner;

public class GcdTest {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("�������һ������:\n");//����̨��������
        int a = scan.nextInt();
        System.out.print("������ڶ�������:\n");//����̨��������
        int b = scan.nextInt(); 
        int m = a*b;
        int c ;
        if(a>=b) {
        	do {
        	c=a%b;
        	a=b;
        	b=c;   	//�����
        }while(c!=0);
        	System.out.println("���Լ��Ϊ��"+a);
            int t =m/a;
            System.out.println("��С������Ϊ��"+t); 
        }  else {                     //��a<bʱ�����
        	int n;
        	n=a;
        	a=b;
        	b=n;
        	do {
        	c=a%b;
        	b=a;
        	a=c; 	
        	}while(c!=0);
        	System.out.println("���Լ��Ϊ��"+b);
        	int t = m/b;
        	System.out.println("��С������Ϊ��"+t);	
        }
        }
	}

