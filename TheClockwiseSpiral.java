
/**
 * Classic definition: A spiral is a curve which emanates from a central point,
 * getting progressively farther away as it revolves around the point.
 * 
 * Your objective is to complete a function createSpiral(N) that receives an
 * integer N and returns an NxN two-dimensional array with numbers 1 through NxN
 * represented as a clockwise spiral.
 * 
 * Return an empty array if N < 1 or N is not int / number
 * 
 * Examples:
 * 
 * N = 3 Output: [[1,2,3],[8,9,4],[7,6,5]]
 * 
 * 1 2 3 8 9 4 7 6 5
 * ---------------------------------------------------------------------------------------------
 * N = 4 Output: [[1,2,3,4],[12,13,14,5],[11,16,15,6],[10,9,8,7]]
 * 
 * 1 2 3 4 12 13 14 5 11 16 15 6 10 9 8 7
 * ---------------------------------------------------------------------------------------------
 * N = 5 Output:
 * [[1,2,3,4,5],[16,17,18,19,6],[15,24,25,20,7],[14,23,22,21,8],[13,12,11,10,9]]
 * 
 * 1 2 3 4 5 16 17 18 19 6 15 24 25 20 7 14 23 22 21 8 13 12 11 10 9
 **/
public class TheClockwiseSpiral {

	static int MAX = 100;

	static void createSpiral(int m, int n, int a[][]) {

		int val = 1, k = 0, l = 0;

		while (k < m && l < n) {
			
			for (int i = l; i < n; ++i) {
			    
				a[k][i] = val++;
				
			}

			k++;

			for (int i = k; i < m; ++i) {
			    
				a[i][n - 1] = val++;
			}
			
			n--;

			if (k < m) {
			    
				for (int i = n - 1; i >= l; --i) {
				    
					a[m - 1][i] = val++;
					
				}
				
				m--;
				
			}

			if (l < n) {
			    
				for (int i = m - 1; i >= k; --i) {
				    
					a[i][l] = val++;
					
				}
				
				l++;
				
			}
		}
	}

	public static void main(String[] args) {
	    
		int m = 4, n = 4;
		
		int a[][] = new int[MAX][MAX];
		
		createSpiral(m, n, a);
		
		for (int i = 0; i < m; i++) {
		    
			for (int j = 0; j < n; j++) {
			    
				System.out.print(a[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
