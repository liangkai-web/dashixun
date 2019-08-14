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
