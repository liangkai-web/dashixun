package zuoye;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		 int N =5;
		   int[] a = new int[N];
		   Scanner s = new Scanner(System.in);
		   System.out.println("������5��������");
		   for(int i=0; i<N; i++) {
		    a[i] = s.nextInt();
		   }
		   System.out.print("�����������Ϊ��");
		   for(int i=0; i<N; i++) {
		     System.out.print(a[i] + " ");
		   }
		   System.out.print("\n����������ƶ���λ����");
		   int m = s.nextInt();
		   int[] b = new int[m];
		   for(int i=0; i<m; i++) {
		    b[i] = a[N-m+i];
		   }
		   for(int i=N-1; i>=m; i--) {
		   a[i] = a[i-m];
		   }
		   for(int i=0; i<m; i++) {
		    a[i] = b[i];
		   }
		System.out.print("λ�ƺ�������ǣ�");
		   for(int i=0; i<N; i++) {
		    System.out.print(a[i] + " ");
		   }
		
	}

}
