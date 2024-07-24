package arraysStarPattern;

public class HollowDiamondStarPattern {
	
	public static void hollowDiamondStarPattern(int n){
		int end=n;
		int start=n;
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n*2;j++) {
				if(j<=start||j>end)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			if(n>i) {
				start--;
				end++;
			}
			else {
				start++;
				end--;
			}
		}
	}
	
	public static void main(String[] args) {
		hollowDiamondStarPattern(5);
	}
}
