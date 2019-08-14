package zuoye;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		int x,y,z;
		Scanner in = new Scanner(System.in); //从控制台输入想要查看成绩
		System.out.println("输入第一个数:");
		x= in.nextInt();
		Scanner in1 = new Scanner(System.in); //从控制台输入想要查看成绩
		System.out.println("输入第二个数:");
		y = in1.nextInt();
		Scanner in11 = new Scanner(System.in); //从控制台输入想要查看成绩
		System.out.println("输入第三个数:");
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
		System.out.println("输出：" + x +"," + y+","+z);
	}

}
