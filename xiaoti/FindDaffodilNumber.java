package zuoye;

public class FindDaffodilNumber {

	public static void main(String[] args) {
		for(int a=1;a<10;a++) {
			for(int b=0;b<10;b++) {
				for(int c=0;c<10;c++) {
					int m =a*a*a*a+b*b*b+c*c*c;//��λ���������ֵ����η���
					int n = a*100+b*10+c;//�õ�����λ��
					if(m==n) {//�����������Ƚ�
						System.out.println(m);
						break;
					}
				}
				
			}
		}
	}

	}
	

