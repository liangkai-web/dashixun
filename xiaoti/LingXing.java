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

			
		
		


