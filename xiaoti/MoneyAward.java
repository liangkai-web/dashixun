package zuoye;

import java.util.Scanner;

public class MoneyAward {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入利润:\n");//控制台输入数字
        long a = scan.nextLong();
        if(a<=10) {
        	System.out.println("奖金为："+a*0.1);//小于10万时的奖金
        }else if(a<=20&&a>10) {
        	System.out.println("奖金为："+1+((a-10)*0.075));//a<=20&&a>10万时的奖金
        }else if(a<=40&&a>20) {
        	System.out.println("奖金为："+1+(a-10)*0.075+(a-20)*0.05);//a<=40&&a>20时的奖金
        }else if(a<=60&&a>40) {
        	System.out.println("奖金为："+1+(a-10)*0.075+(a-20)*0.05+(a-40)*0.03);//a<=60&&a>40时的奖金
        }else if(a<=100&&a>60) {
        	System.out.println("奖金为："+1+(a-10)*0.075+(a-20)*0.05+(a-40)*0.03+(a-60)*0.015);//a<=100&&a>60时的奖金
        }else if(a>100) {
        	System.out.println("奖金为："+1+(a-10)*0.075+(a-20)*0.05+(a-40)*0.03+(a-60)*0.015+(a-100)*0.01);//a>100时的奖金
        }
	}

}
