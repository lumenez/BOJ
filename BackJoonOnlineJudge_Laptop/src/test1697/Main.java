package test1697;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int d[];
		Queue<Integer> q;
		boolean isFinished;

		n = sc.nextInt();
		k = sc.nextInt();
		d = new int[100001];
		q = new LinkedList<>();
		isFinished = false;
		
		for (int i = 0 ; i < d.length ; i ++) {
			d[i] = -1;
		}
		
		d[n] = 0;
		q.offer(n);
		while(!q.isEmpty()) {
			int nowPosition = q.poll();
			int[] nextPosition = new int[] {nowPosition-1, nowPosition+1, nowPosition*2};
			for (int i = 0 ; i < nextPosition.length ; i ++) {
				if (nextPosition[i] >= 0 && nextPosition[i] <= 100000 && d[nextPosition[i]] == -1) {
					d[nextPosition[i]] = d[nowPosition] + 1;
					q.offer(nextPosition[i]);
					if (nextPosition[i] == k) {
						isFinished = true;
						break;
					}
				}
			}
			if (isFinished) break;
		}
		
		System.out.println(d[k]);
		sc.close();
	}
}