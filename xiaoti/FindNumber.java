package zuoye;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
        for(int i=1;i<100000;i++) {   //����һ��i��ΧΪС��100000��
        	if(Math.sqrt(i+100)%1==0) {//i+100�Ŀ���
        		if(Math.sqrt(i+268)%1==0){//i+268�Ŀ���
        			System.out.println("���Ϊ��"+i);//������
        		}
        	}
      
        	
        }
	}

}
