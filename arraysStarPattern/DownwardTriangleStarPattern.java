package arraysStarPattern;

import java.util.Iterator;

public class DownwardTriangleStarPattern {
	
	public static void downwardTriangleStarPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		downwardTriangleStarPattern(5);
	}

}
