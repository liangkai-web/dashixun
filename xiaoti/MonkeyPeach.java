package zuoye;

public class MonkeyPeach {
	 public static void main(String[] args){
	        int n;
	        n = fun(0);
	        System.out.println("ԭ����"+n+"������");
	    }
	    private static int fun(int i){
	        if(i==5)
	          return 1;
	        else
	          return fun(i+1)*5+1;
	    }

}
