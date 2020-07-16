
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
import java.util.*;
public class TheClockwiseSpiral {

	static void createSpiral(int N, int a[][]) {
	        
	        if(N < 1) {
	        
	            return;
	            
	        }
	        
  		int val = 1, k = 0, l = 0;

		while (k < N && l < N) {
			
			for (int i = l; i < N; ++i) {
			    
				a[k][i] = val++;
				
			}

			k++;

			for (int i = k; i < N; ++i) {
			    
				a[i][N - 1] = val++;
				
			}
			
			N--;

			if (k < N) {
			    
				for (int i = N - 1; i >= l; --i) {
				    
					a[N - 1][i] = val++;
					
				}
				
				N--;
				
			}

			if (l < N) {
			    
				for (int i = N - 1; i >= k; --i) {
				    
					a[i][l] = val++;
					
				}
				
				l++;
				
			}
		}
	}

	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value of N");
		int N = scanner.nextInt();
		
		int matrix[][] = new int[N][N];
		
		createSpiral(N, matrix);
		
		for (int i = 0; i < N; i++) {
		    
			for (int j = 0; j < N; j++) {
			    
				System.out.print(matrix[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
