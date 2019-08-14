package zuoye;

public class Prog {
	public static void main(String[] args) {
		char[] m= {'a','b','c'};
		char[] n= {'x','y','z'};
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(m[i]=='a'&&n[j]=='x') continue;
				else if(m[i]=='c'&&n[j]=='x') continue;
				else if(m[i]=='c'&&n[j]=='z') continue;
				else
					System.out.println(m[i] + " vs " + n[j]);
			}
		}
	}

}
