package zuoye;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// ����һ��������������
        //int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };// ����һ��������������
        System.out.print("���������Ϊ��");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("������һ������");
        int addNumber = sc.nextInt();
        array = Arrays.copyOf(array, array.length + 1);// ��������
        array[array.length - 1] = addNumber; // ��ʱ����������һ������ֵΪ�������
        //�ж������ǽ��������򣬶�Ӧ����ɽ������
        int i = 0;
        //�����������Ϊ�����ʱ��
        if (array[i] <= array[array.length - 2]) {
            Arrays.sort(array);// �ٴ�����
            System.out.print("����һ�����������Ϊ��");
            for (i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {//�����������Ϊ�����ʱ��������е������
            Arrays.sort(array);// �ٴ�����
            System.out.print("����һ�����������Ϊ��");
            for (i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }
	}

