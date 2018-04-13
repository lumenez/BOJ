package test2178;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int a[][], nextX[], nextY[];
		boolean isVisited[][];
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();

		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[101][101];
		nextX = new int[]{0, 0, -1, 1};
		nextY = new int[]{-1, 1, 0, 0};
		isVisited = new boolean[101][101];
		
		for (int i = 1 ; i <= n ; i ++) {
			BigInteger input = sc.nextBigInteger();
			BigInteger temp;
			for (int j = m ; j > 0 ; j --) {
				temp = input.subtract((input.divide(BigInteger.TEN)).multiply(BigInteger.TEN));
				a[i][j] = temp.intValue();
				input = input.divide(BigInteger.TEN);
				isVisited[i][j] = false;
			}
		}
		qx.add(1);
		qy.add(1);
		isVisited[1][1] = true;
		
		while (!qx.isEmpty() && !qy.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			
			for (int i = 0 ; i < 4 ; i ++) {
				int nx = x + nextX[i];
				int ny = y + nextY[i];
				if (nx <= n && ny <= m && nx > 0 && ny > 0) {
					if (!isVisited[nx][ny] && a[nx][ny] == 1) {
						qx.offer(nx);
						qy.offer(ny);
						isVisited[nx][ny] = true;
						a[nx][ny] = a[x][y] + 1;
					}
				}
			}
		}
		
		System.out.println(a[n][m]);
		sc.close();
	}
}