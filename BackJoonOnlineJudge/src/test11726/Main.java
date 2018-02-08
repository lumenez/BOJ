package test11726;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input;
		int d[];
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		d = new int[input+1];
		
		d[1] = 1;
		d[2] = 2;
		
		for (int i = 3 ; i <= input ; i ++)
			d[i] = (d[i-1] + d[i-2]) % 10007;
		
		System.out.println(d[input] % 10007);
		
		sc.close();
	}
}