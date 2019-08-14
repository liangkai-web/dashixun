将一个数组逆序输出。 
1.程序分析：用第一个与最后一个交换。

package zuoye;

import java.util.Scanner;

public class ArrayConverse {
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
					while(a[i]<a[m]) {
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


