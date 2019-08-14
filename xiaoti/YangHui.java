package zuoye;

public class YangHui {
	public static void main(String[] args) {

		// 设置杨辉三角的行数
		int num = 10;

		// 申请二维数组存放杨辉三角数值
		int[][] yangHui = new int[num][];
		for (int i = 0; i < yangHui.length; i++)
			yangHui[i] = new int[i + 1];

		// 利用杨辉三角的计算公式，初始化数组
		for (int i = 0; i < yangHui.length; i++)
			for (int j = 0; j < yangHui[i].length; j++) {
				// 每一行第一个数和最后一个数都为1
				yangHui[i][0] = yangHui[i][i] = 1;

				if (i > 1 && j > 0 && j < i)
					// 杨辉三角的值等于其上一层两个值之和
					yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
			}

		// 遍历数组，以输出
		for (int i = 0; i < yangHui.length; i++) {
			for (int j = 0; j < (num - i - 1) / 2; j++)
				System.out.print("\t");
			for (int j = 0; j < yangHui[i].length; j++)
				System.out.print(yangHui[i][j] + "\t");

			System.out.println();
		}
	}

}
