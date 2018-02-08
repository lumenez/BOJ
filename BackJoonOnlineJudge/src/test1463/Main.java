package test1463;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		int array[];
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		array = new int[input+1];
		
		array[1] = 0;
		
		for (int i = 2 ; i <= input ; i ++) {
			array[i] = array[i-1] + 1;
			if (i % 2 == 0)
				array[i] = Math.min(array[i], array[i/2] + 1);
			if (i % 3 == 0)
				array[i] = Math.min(array[i], array[i/3] + 1);
		}
		
		System.out.println(array[input]);
		sc.close();
	}
}