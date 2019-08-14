企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？ 
1.程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。

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
