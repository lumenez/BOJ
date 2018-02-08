package test1152;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String charVar = sc.next();
		while(true) {
			count++;
			charVar = sc.next();
			if (charVar.length() == 0) break;
		}
		System.out.println(count);
		sc.close();
	}

}
