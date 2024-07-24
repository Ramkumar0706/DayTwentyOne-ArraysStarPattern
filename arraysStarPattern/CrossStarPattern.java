package arraysStarPattern;

public class CrossStarPattern {
	
	public static void crossStarPattern(int n) {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=n;j++) {
			if(j==n/2+1||i==n/2+1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	}
	
	public static void main(String[] args) {
		crossStarPattern(7);
	}
}
