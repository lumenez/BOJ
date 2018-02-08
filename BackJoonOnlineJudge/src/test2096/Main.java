package test2096;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int T;
		int max, min;
		int d1[][];
		int d2[][];
		int a[][];
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		d1 = new int[T+1][4];
		d2 = new int[T+1][4];
		a = new int[T+1][4];
		
		for (int i = 1 ; i <= T ; i ++) {
			for (int j = 1 ; j <= 3 ; j ++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		d1[1][1] = d2[1][1] = a[1][1];
		d1[1][2] = d2[1][2] = a[1][2];
		d1[1][3] = d2[1][3] = a[1][3];
		
		for (int i = 2 ; i <= T ; i ++) {
			d1[i][1] = Math.max(d1[i-1][1], d1[i-1][2]) + a[i][1];
			d1[i][2] = Math.max(d1[i-1][1], d1[i-1][2]);
			d1[i][2] = Math.max(d1[i][2], d1[i-1][3]) + a[i][2];
			d1[i][3] = Math.max(d1[i-1][2], d1[i-1][3]) + a[i][3];
			
			d2[i][1] = Math.min(d2[i-1][1], d2[i-1][2]) + a[i][1];
			d2[i][2] = Math.min(d2[i-1][1], d2[i-1][2]);
			d2[i][2] = Math.min(d2[i][2], d2[i-1][3]) + a[i][2];
			d2[i][3] = Math.min(d2[i-1][2], d2[i-1][3]) + a[i][3];
		}
		
		max = Math.max(d1[T][1], Math.max(d1[T][2], d1[T][3]));
		min = Math.min(d2[T][1], Math.min(d2[T][2], d2[T][3]));
		System.out.println(max + " " + min);
		sc.close();
	}
}