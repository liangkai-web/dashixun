package zuoye;

import java.util.Scanner;

public class TestRabbit {
	public static void main(String[] args) {
		
		   long s1,s2;// ��������º��¸������ӵ�����  
	        s1 = 1;  //��һ����Ϊ1��  
	        s2 = 1;  //�ڶ�����Ϊ1��  
	        int i=1;  //����һ�����Ʊ���  
	        int m;  // �·���  
	        Scanner in = new Scanner(System.in); //�ӿ���̨������Ҫ�鿴���·�  
	        System.out.println("����������Ҫ�鿴������:");//������ʾ  
	        m = in.nextInt();//����������·ݸ�ֵ��m  
	        //whileѭ��  
	        while(true){  
	            //��һ���º͵ڶ��������ӵ�������Ϊ1��  
	            if(i==1||i==2){  
	                System.out.println(i+" month: "+s1);  
	                i++; // ���Ʊ��� i ��1  
	            }    
	            // i ����3����С��������Ҫ�鿴���·�  
	            else if(i<m){  
	                s1 = s1+s2;   
	                s2 = s1+s2;    
	                System.out.println(i+" month: "+s1);  
	                    i++;//�·ݼ�1  
	                System.out.println(i+ " month: "+s2);  
	                    i++; //�·ݼ�1  
	            }else{  
	                break;//�������������˳�  
	            }  
	                  
	        }  
	    }  
	} 