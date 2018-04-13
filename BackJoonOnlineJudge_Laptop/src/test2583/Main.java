package test2583;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x;
	int y;
	
	Point (int x, int y) {
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
		
		int M, N, K, count;
		M = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();
		count = 0;
		int d[][] = new int[M+1][N+1];
		int a[][] = new int[101][5];
		ArrayList<Integer> ansList = new ArrayList<Integer>();
		boolean isVisited[][] = new boolean[M+1][N+1];
		Queue<Point> queue = new LinkedList<Point>();
		Point nxPoint[] = new Point[4];
		nxPoint[0] = new Point(-1,0);
		nxPoint[1] = new Point(1,0);
		nxPoint[2] = new Point(0,-1);
		nxPoint[3] = new Point(0,1);
		
		
		for (int i = 1 ; i <= K ; i ++) {
			for (int j = 1 ; j <= 4 ; j ++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 1 ; i <= K ; i ++) {
			for (int j = a[i][2]+1 ; j <= a[i][4] ; j ++) {
				for (int k = a[i][1]+1 ; k <= a[i][3] ; k ++) {
					d[j][k] = 1;
				}
			}
		}

		for (int i = 1 ; i <= M ; i ++) {
			for (int j = 1 ; j <= N ; j ++) {
				if (d[i][j] == 0 && !isVisited[i][j]) {
					queue.offer(new Point(i,j));
					while(!queue.isEmpty()) {
						Point tempPoint = queue.poll();
						for (int k = 0 ; k < 4 ; k ++) {
							int nx = tempPoint.getX() + nxPoint[k].getX();
							int ny = tempPoint.getY() + nxPoint[k].getY();
							if (nx > 0 && ny > 0 && nx <= M && ny <= N && d[nx][ny] == 0 && !isVisited[nx][ny] ) {
								queue.offer(new Point(nx,ny));
								isVisited[nx][ny] = true;
								count++;
							}
						}
					}
					if (count == 0) count = 1;
					ansList.add(count);
					count = 0;
				}
			}
		}

		Collections.sort(ansList);
		System.out.println(ansList.size());
		for (int i = 0 ; i < ansList.size() ; i ++) {
			System.out.print(ansList.get(i) + " ");
		}
		sc.close();
	}
}