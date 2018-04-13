package test7576;

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
		int M, N, count, countZero;
		int d[][];
		Point nextPoint[] = new Point[4];
		boolean isVisited[][];
		Queue<Point> curQueue = new LinkedList<Point>();
		Queue<Point> nextQueue = new LinkedList<Point>();

		N = sc.nextInt();
		M = sc.nextInt();
		count = 0;
		countZero = 0;
		d = new int[1001][1001];
		isVisited = new boolean[1001][1001];
		nextPoint[0] = new Point(-1, 0);
		nextPoint[1] = new Point(1, 0);
		nextPoint[2] = new Point(0, -1);
		nextPoint[3] = new Point(0, 1);

		for (int i = 1 ; i <= M ; i ++) {
			for (int j = 1 ; j <= N ; j ++) {
				d[i][j] = sc.nextInt();
				if (d[i][j] == 1) {
					curQueue.offer(new Point(i,j));
					isVisited[i][j] = true;
				}
				else 
					isVisited[i][j] = false;
			}
		}
		do {
			while(!curQueue.isEmpty()) {
				Point tempPoint = curQueue.poll();
				for (int i = 0 ; i < 4 ; i ++) {
					int nx = tempPoint.getX() + nextPoint[i].getX();
					int ny = tempPoint.getY() + nextPoint[i].getY();
					if (nx <= M && ny <= N && nx > 0 && ny > 0) {
						if (!isVisited[nx][ny] && d[nx][ny] == 0) {
							nextQueue.offer(new Point(nx, ny));
							isVisited[nx][ny] = true;
							d[nx][ny] = 1;
						}
					}
				}
			}
			
			count++;
			while (!nextQueue.isEmpty()) {
				curQueue.offer(nextQueue.poll());
			}
		} while (!curQueue.isEmpty());
		

		for (int i = 1 ; i <= M ; i ++) {
			for (int j = 1 ; j <= N ; j ++) {
				if (d[i][j] == 0) countZero++;
			}
		}
		
		if (countZero > 0) count = 0;
		System.out.println(count-1);
		sc.close();
	}
}