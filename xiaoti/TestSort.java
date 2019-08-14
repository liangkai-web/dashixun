对10个数进行排序 
1.程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换， 下次类推，即用第 
二个元素与后8个进行比较，并进行交换。

package zuoye;

import java.util.Scanner;

public class TestSort {
	public static void main(String[] args) {
		int[] a=new int [10];
		int k;
		  System.out.println("ÇëÊäÈëÊý¾Ý£º");

		  Scanner s = new Scanner(System.in);

		  for(int i = 0;i<10;i++) {
		   a[i] = s.nextInt();
		  }
		for(int i=0;i<=8;i++) {
			for(int m=i+1;m<=9;m++) {
				while(a[i]>a[m]) {
					int n=a[i];
					a[i]=a[m];
					a[m]=n;
					
				}
			}
		}
		for(int i=0;i<=9;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
