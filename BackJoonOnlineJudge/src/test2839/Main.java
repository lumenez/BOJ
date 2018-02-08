package test2839;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sugarGram;
		int vinyl;
		
		Scanner sc = new Scanner(System.in);
		sugarGram = sc.nextInt();		
		vinyl = 0;
		
		while(sugarGram % 5 != 0 && sugarGram >= 0) {
			sugarGram = sugarGram - 3;
			vinyl++;
		}

		if (sugarGram < 0)
			vinyl = -1;
		else
			vinyl = vinyl + (sugarGram / 5);
					
		System.out.println(vinyl);
		sc.close();
	}
}