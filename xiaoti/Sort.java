package zuoye;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		int x,y,z;
		Scanner in = new Scanner(System.in); //�ӿ���̨������Ҫ�鿴�ɼ�
		System.out.println("�����һ����:");
		x= in.nextInt();
		Scanner in1 = new Scanner(System.in); //�ӿ���̨������Ҫ�鿴�ɼ�
		System.out.println("����ڶ�����:");
		y = in1.nextInt();
		Scanner in11 = new Scanner(System.in); //�ӿ���̨������Ҫ�鿴�ɼ�
		System.out.println("�����������:");
		z = in11.nextInt();
		if(x>y) {
			int m ;
			m=x;
			x=y;
			y=m;
		}if(y>z) {
			int n;
			n=y;
			y=z;
			z=n;
		}if(x>y) {
			int k;
			k=x;
			x=y;
			y=k;
		}
		System.out.println("�����" + x +"," + y+","+z);
	}

}
