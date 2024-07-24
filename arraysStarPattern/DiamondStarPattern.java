package arraysStarPattern;

public class DiamondStarPattern {

	public static void diamondStarPattern(int n) {
		int sp=n;
		int st=1;
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<sp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++) {
				System.out.print("*"+" ");
			}
			if(i<n) {
				sp--;
				st=st+1;
			}
			else {
				sp++;
				st=st-1;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		diamondStarPattern(5);
	}

}
