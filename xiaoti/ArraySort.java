package zuoye;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// 定义一个升序排序数组
        //int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };// 定义一个降序排序数组
        System.out.print("定义的数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int addNumber = sc.nextInt();
        array = Arrays.copyOf(array, array.length + 1);// 数组扩容
        array[array.length - 1] = addNumber; // 暂时将数组的最后一个数赋值为插入的数
        //判断数组是降序还是升序，对应其规律进行输出
        int i = 0;
        //当定义的数组为升序的时候
        if (array[i] <= array[array.length - 2]) {
            Arrays.sort(array);// 再次排序
            System.out.print("插入一个数后的数组为：");
            for (i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {//当定义的数组为降序的时候，数组进行倒序输出
            Arrays.sort(array);// 再次排序
            System.out.print("插入一个数后的数组为：");
            for (i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }
	}

