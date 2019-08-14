：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？ 
1.程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。请看具体分析：

package zuoye;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
        for(int i=1;i<100000;i++) {   //定义一个i范围为小于100000；
        	if(Math.sqrt(i+100)%1==0) {//i+100的开方
        		if(Math.sqrt(i+268)%1==0){//i+268的开方
        			System.out.println("结果为："+i);//输出结果
        		}
        	}
      
        	
        }
	}

}
