809*??=800*??+9*??+1 
其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。

package zuoye;

public class Test4 {
	public static void main(String[] args) {
		int number = 0;
		boolean flag = false;
		for (int i=10; i<100; i++) {
			if(809*i == (800*i+9*i+1)) {
				if(((8*i) < 100)&&((9*i) > 99)) {
					flag = true;
					number = i;
				}
			}
			
		}
		if (flag) {
			System.out.println("809*"+number+"="+(809*number));
		}else {
			System.out.println("ÎÞ·ûºÏÒªÇóµÄÊý!");
		}
		
	}

}
