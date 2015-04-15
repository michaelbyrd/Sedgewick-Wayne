/**
 * This program takes an integer N as the argument and uses 
 * nested for loops to print an N-by-N table with an asterisk
 * in row i and column j if either i divides j or j divides i.
 */
package Chapter1;

/**
 * @author Michael Byrd
 *
 */
public class DivisorPattern {
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		for (int i = 1; i <= N; i++){
			for (int j = 1; j <= N; j++ ){
				if ((i % j == 0) || (j % i == 0 ))
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println(i);
		}
				
	}
}
