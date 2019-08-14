package zuoye;

public class Test3Quit {
	public static void main(String[] args) {
		int  n = 10;//n的取值
		int num = n;//记录剩余数个数
		int arr[] = new int[n];//标记剩余数的位置 0 代表存活,初始全部存活   1 代表删除
		int flag = 0; //标记报名，到三降0
		int del = 3;//扩展字段，将报三的删除，可以任意定义
		while(num != 1){//当剩余数量为1时，停止循环
		    for(int i = 0;i<n ; i++){//
		        if(arr[i] == 0){ //判断当前元素是否存活
		            flag ++; //元素存活，报名数加一;每次for循环后，报名数会接着下次循环继续增长，约瑟夫环循环
		        }
		        if(flag == del){//当报名数为三时
		            arr[i] = 1;//将当前元素标记为1，删除操作
		            flag = 0;//报名数降为0
		            num --;//总人数减去1
		        }
		    }
		}
		for(int i = 0;i<arr.length ; i++) {
		    if(arr[i] == 0) {
		        System.out.println(i+1);//数组下标从0开始
		    }

	}

	}
}
