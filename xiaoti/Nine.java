：输出9*9口诀。 
1.程序分析：分行与列考虑，共9行9列，i控制行，j控制列。

package zuoye;

public class Nine {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ "*" + i + "=" + i*j + " ");
			}	
			System.out.print("\n");
		}

	}
}
