利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 
1.程序分析：(a>b)?a:b这是条件运算符的基本例子。
package zuoye;

import java.util.Scanner;

public class ConditionOperator {
	public static void main(String[] args) {
		int a;//定义变量成绩
		Scanner in = new Scanner(System.in); //从控制台输入想要查看成绩
		System.out.println("输入成绩:");
		a = in.nextInt();
		if(a>=90) {
			System.out.println("优秀");
		}else if(a>=80) {
			System.out.println("良好");
		}else if(a>=70) {
			System.out.println("中等");
		}else if(a>=60) {
			System.out.println("及格");
		}else  {
			System.out.println("不及格");
		}
	}

}
