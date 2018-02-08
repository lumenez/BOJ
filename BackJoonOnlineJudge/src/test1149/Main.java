package test1149;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input;
		int d[][];
		int a[][];
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		d = new int[input+1][3];
		a = new int[input+1][3];
		
		d[0][0] = d[0][1] = d[0][2] = 0;
		a[0][0] = a[0][1] = a[0][2] = 0;
		
		for (int i = 1 ; i <= input ; i ++) {
			for (int j = 0 ; j < 3 ; j ++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 1 ; i <= input ; i ++) {
			d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + a[i][0];
			d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + a[i][1];
			d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + a[i][2];
		}
		
		System.out.println(Math.min(d[input][0], Math.min(d[input][1], d[input][2])));
		
		sc.close();
	}
}