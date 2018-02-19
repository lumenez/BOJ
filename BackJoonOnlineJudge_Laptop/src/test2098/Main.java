package test2098;

import java.util.Scanner;

public class Main {
	static int T;
	static int cityCost[][];
	static int shortestPath[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		cityCost = new int[T+1][T+1];
		shortestPath = new int[T+1][(1 << T)+1];

		for (int i = 1 ; i <= T ; i ++) {
			for (int j = 1 ; j <= T ; j ++) {
				cityCost[i][j] = sc.nextInt();
			}
		}

		for (int i = 1 ; i <= T ; i ++) {
			for (int j = 1 ; j <= (1 << T) ; j ++) {
				shortestPath[i][j] = -1;
			}
		}
		
		System.out.println(tsp(1, 1));
		sc.close();
	}

	public static int tsp(int current, int visited) {
		// ��ü �湮�� ������ 1��°�� ���ư���
		if (visited == (1 << T) - 1) return cityCost[current][1];
		// �鸰 ��δ� ������� �ʰ� �� �ҷ�����
		if (shortestPath[current][visited] >= 0) return shortestPath[current][visited];

		int minimum = 999999999;
		
		for (int i = 1 ; i <= T ; i ++) {
			// �鸰 ��δ� ������� �ʱ�
			if ((visited & (1 << (i - 1))) != 0) continue;
			// �������� ������ ���� ��δ� ������� �ʱ�
			if (cityCost[current][i] == 0) continue;	
			
			minimum = Math.min(minimum, cityCost[current][i] + tsp(i, visited + (1 << (i - 1))));
		}
		shortestPath[current][visited] = minimum;
 		return minimum;
	}
}