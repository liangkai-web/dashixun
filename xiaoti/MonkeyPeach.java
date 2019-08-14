海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一 
个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中 
，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？

package zuoye;

public class MonkeyPeach {
	 public static void main(String[] args){
	        int n;
	        n = fun(0);
	        System.out.println("Ô­À´ÓÐ"+n+"¸öÌÒ×Ó");
	    }
	    private static int fun(int i){
	        if(i==5)
	          return 1;
	        else
	          return fun(i+1)*5+1;
	    }

}
