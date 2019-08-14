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
	        System.out.println("矩阵对角线元素之和为:"+sum);
	    }

	}


