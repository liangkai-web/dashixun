package zuoye;

public class TestTN {
	public static void main(String[] args) {
		int i,j,k;//������λ���İ�ʮ��λ��
		int m=0;//����õ��ĸ���
		for( i=1;i<5;i++) {     //��λ���ķ�Χ
			for(j= 1;j<5;j++) {  //ʮλ���ķ�Χ
				for(k=1;k<5;k++) {	//��λ���ķ�Χ
					if(i!=j&&j!=k&&k!=i) {
						m++;  //����ĸ���
						int n=0;
						n=i*100+j*10+k;  //�õ�����Ҫ��ĵ���λ��
						System.out.println("��λ��Ϊ��"+n);
					}
					
					}
				}
			}
		System.out.println("�ܸ���Ϊ��"+m);
		}
	}
