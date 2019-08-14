package zuoye;

public class FindPrimeNumber {
	public static void main(String[] args) {
		
	   for(int i=101;i<201;i++) {
		   for(int m =2;m<i;m++) {
		if(i%m==0) { 
			break;
		}else if(m==i-1)
			System.out.println(i);			
		}
	}
	
	}

	}
	

