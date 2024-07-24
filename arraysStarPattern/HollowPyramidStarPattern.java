package arraysStarPattern;

public class HollowPyramidStarPattern {

	public static void hollowPyramidStarPattern(int n)
	{
		int m=5;
		for (int i = 1; i <= m; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || j == (2 * i - 1)||i==m&&j%2==1) 
					System.out.print("*");
				else 
					System.out.print(" ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		hollowPyramidStarPattern(7);

	}

}


