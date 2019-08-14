package zuoye;

public class YangHui {
	public static void main(String[] args) {

		// ����������ǵ�����
		int num = 10;

		// �����ά���������������ֵ
		int[][] yangHui = new int[num][];
		for (int i = 0; i < yangHui.length; i++)
			yangHui[i] = new int[i + 1];

		// ����������ǵļ��㹫ʽ����ʼ������
		for (int i = 0; i < yangHui.length; i++)
			for (int j = 0; j < yangHui[i].length; j++) {
				// ÿһ�е�һ���������һ������Ϊ1
				yangHui[i][0] = yangHui[i][i] = 1;

				if (i > 1 && j > 0 && j < i)
					// ������ǵ�ֵ��������һ������ֵ֮��
					yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
			}

		// �������飬�����
		for (int i = 0; i < yangHui.length; i++) {
			for (int j = 0; j < (num - i - 1) / 2; j++)
				System.out.print("\t");
			for (int j = 0; j < yangHui[i].length; j++)
				System.out.print(yangHui[i][j] + "\t");

			System.out.println();
		}
	}

}
