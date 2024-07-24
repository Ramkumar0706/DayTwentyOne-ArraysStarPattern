package arraysStarPattern;

public class PyramidStarPattern {
	
	public static  void pyramidStartPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pyramidStartPattern(5);
	}

}
