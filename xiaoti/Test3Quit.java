package zuoye;

public class Test3Quit {
	public static void main(String[] args) {
		int  n = 10;//n��ȡֵ
		int num = n;//��¼ʣ��������
		int arr[] = new int[n];//���ʣ������λ�� 0 ������,��ʼȫ�����   1 ����ɾ��
		int flag = 0; //��Ǳ�����������0
		int del = 3;//��չ�ֶΣ���������ɾ�����������ⶨ��
		while(num != 1){//��ʣ������Ϊ1ʱ��ֹͣѭ��
		    for(int i = 0;i<n ; i++){//
		        if(arr[i] == 0){ //�жϵ�ǰԪ���Ƿ���
		            flag ++; //Ԫ�ش���������һ;ÿ��forѭ���󣬱�����������´�ѭ������������Լɪ��ѭ��
		        }
		        if(flag == del){//��������Ϊ��ʱ
		            arr[i] = 1;//����ǰԪ�ر��Ϊ1��ɾ������
		            flag = 0;//��������Ϊ0
		            num --;//��������ȥ1
		        }
		    }
		}
		for(int i = 0;i<arr.length ; i++) {
		    if(arr[i] == 0) {
		        System.out.println(i+1);//�����±��0��ʼ
		    }

	}

	}
}
