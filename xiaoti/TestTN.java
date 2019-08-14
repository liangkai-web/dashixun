有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 
1.程序分析：可填在百位、十位、个位的数字都是1、2、3、

package zuoye;

public class TestTN {
	public static void main(String[] args) {
		int i,j,k;//定义三位数的百十个位数
		int m=0;//定义得到的个数
		for( i=1;i<5;i++) {     //百位数的范围
			for(j= 1;j<5;j++) {  //十位数的范围
				for(k=1;k<5;k++) {	//个位数的范围
					if(i!=j&&j!=k&&k!=i) {
						m++;  //输出的个数
						int n=0;
						n=i*100+j*10+k;  //得到符合要求的的三位数
						System.out.println("三位数为："+n);
					}
					
					}
				}
			}
		System.out.println("总个数为："+m);
		}
	}
