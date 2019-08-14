打印出如下图案（菱形） 
      * 
    *** 
  ***** 
******* 
  ***** 
    *** 
      * 
1.程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重 for循环，第一层控制行，第二层控制列。

package zuoye;

public class LingXing {
	public static void main(String[] args) {
		int i,j;
		//打印上四层等腰三角形
		for(i=0;i<=3;i++)
		{
		for(j=0;j<=2-i;j++)
			System.out.print(" ");
				for(j=0;j<=2*i;j++)
					System.out.print("*");
				System.out.print("\n");
				}
				//打印下三层等腰三角形
				for(i=0;i<=2;i++)
				{
				for(j=0;j<=i;j++)
					System.out.print(" ");
				for(j=0;j<=4-2*i;j++)
					System.out.print("*");
				System.out.print("\n");
				}
			}
		}

			
		
		


