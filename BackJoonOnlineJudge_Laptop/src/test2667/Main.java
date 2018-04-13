package test2667;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
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
		int n, count, countMembers;
		int a[][];
		boolean isVisited[][];
		ArrayList<Integer> countList = new ArrayList<Integer>();
		Point nextPoint[] = new Point[4];
		Queue<Point> queue = new LinkedList<Point>();

		n = sc.nextInt();
		count = 0;
		countMembers = 0;
		a = new int[26][26];
		isVisited = new boolean[26][26];
		nextPoint[0] = new Point(-1, 0);
		nextPoint[1] = new Point(1, 0);
		nextPoint[2] = new Point(0, -1);
		nextPoint[3] = new Point(0, 1);
		
		for (int i = 1 ; i <= n ; i ++) {
			BigInteger input = sc.nextBigInteger();
			BigInteger temp;
			for (int j = n ; j > 0 ; j --) {
				temp = input.subtract((input.divide(BigInteger.TEN)).multiply(BigInteger.TEN));
				a[i][j] = temp.intValue();
				input = input.divide(BigInteger.TEN);
				isVisited[i][j] = false;
			}
		}

		for (int x = 1 ; x <= n ; x ++) {
			for (int y = 1 ; y <= n ; y ++) {
				if (a[x][y] == 1 && !isVisited[x][y]) {
					queue.offer(new Point(x,y));
					isVisited[x][y] = true;
					while (!queue.isEmpty()) {
						Point tempPoint = queue.poll();
						for (int i = 0 ; i < 4 ; i ++) {
							int nx = tempPoint.getX() + nextPoint[i].getX();
							int ny = tempPoint.getY() + nextPoint[i].getY();
							if (nx <= n && ny <= n && nx > 0 && ny > 0) {
								if (!isVisited[nx][ny] && a[nx][ny] == 1) {
									queue.offer(new Point(nx,ny));
									isVisited[nx][ny] = true;
								}
							}
						}
						countMembers++;
					}
					countList.add(countMembers);
					count++;
				}
				countMembers = 0;
			}
		}
		
		Collections.sort(countList);
		System.out.println(count);
		for (int i = 0 ; i < count ; i ++) {
			System.out.println(countList.get(i));
		}
		sc.close();
	}
}