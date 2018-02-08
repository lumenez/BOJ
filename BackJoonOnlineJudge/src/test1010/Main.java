package test1010;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int T;
		int n, m;
		int d[][];
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		d = new int[31][31];

		for (int i = 1 ; i <= 30 ; i ++)
			d[1][i] = i;
		
		for (int i = 2 ; i <= 30 ; i ++) {
			for (int j = i ; j <= 30 ; j ++) {
				for(int k = j-1 ; k >= i-1 ; k --) {
					d[i][j] += d[i-1][k];
				}
			}
		}
		
		for (int t = 0 ; t < T ; t ++) {
			n = sc.nextInt();
			m = sc.nextInt();
			System.out.println(d[n][m]);
		}
		sc.close();
	}
}