package arraysStarPattern;

public class ButterflyPattern {
	
	public static void butterflyPattern(int n){
		int end=n*2-1;
		int start=1;
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n*2;j++) {
				if(j<=start||j>end)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			if(n>i) {
				start++;
				end--;
			}
			else {
				start--;
				end++;
			}
		}
	}
	
	public static void main(String[] args) {
		butterflyPattern(5);
	}
	

}
