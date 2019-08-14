求一个3*3矩阵对角线元素之和 
1.程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。

package zuoye;

public class TestAdd3 {
	public static void main(String[] args) {
		  int[][]arr={{1,4,6},{2,5,3},{9,7,8}};
	        int sum=0;
	        for(int i=0;i<arr.length;i+=2) {
	            for(int j=0;j<arr.length;j+=2) {
	                sum+=arr[i][j];
	            }
	        }
	        System.out.println("¾ØÕó¶Ô½ÇÏßÔªËØÖ®ºÍÎª:"+sum);
	    }

	}


