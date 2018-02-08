package test11719;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String T;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			T = sc.nextLine();
			if (!T.isEmpty() || T.length() < 100)
				System.out.println(T);
		}
		sc.close();
	}
}