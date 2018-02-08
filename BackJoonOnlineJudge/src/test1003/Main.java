package test1003;
import java.util.Scanner;

public class Main {
	static int count0 = 0;
	static int count1 = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0 ; i < T ; i ++) {
			int n = sc.nextInt();
			fibonacci(n);
			System.out.println(count0 + " " + count1);
			count0 = count1 = 0;
		}
		sc.close();
	}
	
	public static int fibonacci(int n) {
		if (n==0) {
			count0++;
			return 0;
		}
		else if (n==1) {
			count1++;
			return 1;
		}
		else return fibonacci(n-1) + fibonacci(n-2);
	}
}

