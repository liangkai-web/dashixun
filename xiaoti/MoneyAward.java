package zuoye;

import java.util.Scanner;

public class MoneyAward {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("����������:\n");//����̨��������
        long a = scan.nextLong();
        if(a<=10) {
        	System.out.println("����Ϊ��"+a*0.1);//С��10��ʱ�Ľ���
        }else if(a<=20&&a>10) {
        	System.out.println("����Ϊ��"+1+((a-10)*0.075));//a<=20&&a>10��ʱ�Ľ���
        }else if(a<=40&&a>20) {
        	System.out.println("����Ϊ��"+1+(a-10)*0.075+(a-20)*0.05);//a<=40&&a>20ʱ�Ľ���
        }else if(a<=60&&a>40) {
        	System.out.println("����Ϊ��"+1+(a-10)*0.075+(a-20)*0.05+(a-40)*0.03);//a<=60&&a>40ʱ�Ľ���
        }else if(a<=100&&a>60) {
        	System.out.println("����Ϊ��"+1+(a-10)*0.075+(a-20)*0.05+(a-40)*0.03+(a-60)*0.015);//a<=100&&a>60ʱ�Ľ���
        }else if(a>100) {
        	System.out.println("����Ϊ��"+1+(a-10)*0.075+(a-20)*0.05+(a-40)*0.03+(a-60)*0.015+(a-100)*0.01);//a>100ʱ�Ľ���
        }
	}

}
