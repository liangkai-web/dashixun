package zuoye;

import java.util.Scanner;

public class ConditionOperator {
	public static void main(String[] args) {
		int a;//��������ɼ�
		Scanner in = new Scanner(System.in); //�ӿ���̨������Ҫ�鿴�ɼ�
		System.out.println("����ɼ�:");
		a = in.nextInt();
		if(a>=90) {
			System.out.println("����");
		}else if(a>=80) {
			System.out.println("����");
		}else if(a>=70) {
			System.out.println("�е�");
		}else if(a>=60) {
			System.out.println("����");
		}else  {
			System.out.println("������");
		}
	}

}
