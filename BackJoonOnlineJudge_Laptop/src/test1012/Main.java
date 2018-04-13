package test1012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int m, n, k;
		int count[];
		int a[][][];
		boolean isVisited[][][];
		Point nextPoint[] = new Point[4];
		Queue<Point> queue = new LinkedList<Point>();
		
		T = sc.nextInt();
		a = new int[T+1][51][51];
		count = new int[51];
		isVisited = new boolean[T+1][51][51];
		nextPoint[0] = new Point(-1, 0);
		nextPoint[1] = new Point(1, 0);
		nextPoint[2] = new Point(0, -1);
		nextPoint[3] = new Point(0, 1);
		
		for (int i = 1 ; i <= T ; i ++) {
			m = sc.nextInt();
			n = sc.nextInt();
			k = sc.nextInt();
			count[i] = 0;
			
			for (int j = 1 ; j <= k ; j ++) {
				int p, q;
				p = sc.nextInt();
				q = sc.nextInt();
				a[i][p][q] = 1;
			}
			
			for (int x = 0 ; x < m ; x ++) {
				for (int y = 0 ; y < n ; y ++) {
					if (a[i][x][y] == 1 && !isVisited[i][x][y]) {
						queue.offer(new Point(x,y));
						while (!queue.isEmpty()) {
							Point tempPoint = queue.poll();
							for (int z = 0 ; z < 4 ; z ++) {
								int nx = tempPoint.getX() + nextPoint[z].getX();
								int ny = tempPoint.getY() + nextPoint[z].getY();
								if (nx < m && ny < n && nx >= 0 && ny >= 0) {
									if (!isVisited[i][nx][ny] && a[i][nx][ny] == 1) {
										queue.offer(new Point(nx,ny));
										isVisited[i][nx][ny] = true;
									}
								}
							}
						}
						count[i]++;
					}
				}
			}
		}
		
		for (int i = 1 ; i <= T ; i ++) {
			System.out.println(count[i]);
		}
		sc.close();
	}
}