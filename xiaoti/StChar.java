package zuoye;

import java.util.Scanner;

public class StChar {
	public static void main(String[] args) {
        int b,c,d,e;
        b=0; c=0;d=0;e=0;
		 Scanner s = new Scanner(System.in);
	        System.out.print("请输入:\n");
	        String a = s.nextLine(); 
	        for(int i=0;i<a.length();i++) {
	        	char m=a.charAt(i);
	        	//获取字符串中第i个字符的方法
			if(Character.isDigit(m)) {
	        	b++;
			}
	        	else if(Character.isLetter(m)) {
	        		c++;
	        	}else if(Character.isSpace(m)) {
	        		d++;
	        	}else {
	        		e++;
	        	}
			}
	            System.out.println("数字的个数是"+b);
	            System.out.println("英文字母的个数是"+c);
	            System.out.println("空格的个数是"+d);
	            System.out.println("其他字符的个数是"+e);       
	}

}
