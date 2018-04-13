package test11403;

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
		int N;
		int d[][], a[][];
		boolean isVisited[][];
		Queue<Point> queue = new LinkedList<Point>();

		N = sc.nextInt();
		d = new int[101][101];
		a = new int[101][101];
		isVisited = new boolean[101][101];

		for (int i = 1 ; i <= N ; i ++) {
			for (int j = 1 ; j <= N ; j ++) {
				a[i][j] = sc.nextInt();
			}
		}
			

		for (int i = 1 ; i <= N ; i ++) {
			for (int j = 1 ; j <= N ; j ++) {
				if (a[i][j] == 1) {
					queue.offer(new Point(i,j));
					d[i][j] = 1;
					isVisited[i][j] = true;
					while(!queue.isEmpty()) {
						Point tempPoint = queue.poll();
						for (int k = 1 ; k <= N ; k ++) {
							int nx = tempPoint.getY();
							int ny = k;
							if (a[nx][ny] == 1 && !isVisited[nx][ny]) {
								queue.offer(new Point(nx,ny));
								d[i][ny] = 1;
								isVisited[nx][ny] = true;
							}
						}
					}
				}
			}
			for (int j = 1 ; j <= N ; j ++) {
				for (int k = 1 ; k <= N ; k ++) {
					isVisited[j][k] = false;
				}
			}
		}

		for (int i = 1 ; i <= N ; i ++) {
			for (int j = 1 ; j <= N ; j ++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}