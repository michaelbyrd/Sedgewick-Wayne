/**
 * This program takes two arguments and produces a sample of
 * M of the integers from 0 to N-1.
 */
package chapter1;

/**
 * @author byrd
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int M = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		int[] perm = new int[N];
		for (int j = 0; j < N; j++)
			perm[j] = j;
		for (int i = 0; i < M; i++)
		{
			int r = i + (int) (Math.random() * (N-i));
			int t = perm[r];
			perm[r] = perm[i];
			perm[i] = t;
		}
		
		for (int i = 0; i < M; i++)
			System.out.print(perm[i] + " ");
		System.out.println();
	}

}