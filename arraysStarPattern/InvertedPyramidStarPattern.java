package arraysStarPattern;

public class InvertedPyramidStarPattern {
	
	public static  void invertedPyramidStartPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		invertedPyramidStartPattern(5);
	}

}
