package zuoye;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean is = true;
		System.out.print("������һ��7λ���ϵ���������");
		long a = s.nextLong();
		String ss = Long.toString(a);
		char[] ch = ss.toCharArray();
		int j = ch.length;
		if (j < 7) {
			System.out.println("�������");
		} else {
			System.out.println("��ȡ���Ҷ˿�ʼ��4��7λ�ǣ�" + ch[j - 7] + ch[j - 6] + ch[j - 5] + ch[j - 4]);
		}
	}
}
