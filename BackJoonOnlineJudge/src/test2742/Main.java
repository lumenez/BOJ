package test2742;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int input;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		for (int i = input ; i > 0 ; i -- )
			System.out.println(i);
		
		sc.close();
	}
}