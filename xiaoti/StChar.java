package zuoye;

import java.util.Scanner;

public class StChar {
	public static void main(String[] args) {
        int b,c,d,e;
        b=0; c=0;d=0;e=0;
		 Scanner s = new Scanner(System.in);
	        System.out.print("������:\n");
	        String a = s.nextLine(); 
	        for(int i=0;i<a.length();i++) {
	        	char m=a.charAt(i);
	        	//��ȡ�ַ����е�i���ַ��ķ���
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
	            System.out.println("���ֵĸ�����"+b);
	            System.out.println("Ӣ����ĸ�ĸ�����"+c);
	            System.out.println("�ո�ĸ�����"+d);
	            System.out.println("�����ַ��ĸ�����"+e);       
	}

}
