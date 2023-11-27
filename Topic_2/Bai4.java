package Topic_2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i< n; i++)  a[i] = sc.nextInt();
		System.out.print("Nhập giá trị X: ");
		int x = sc.nextInt();
		System.out.print("Nhập giá trị Y: ");
		int y = sc.nextInt();
		int d = 0;
		Arrays.sort(a);
		for(int i =0; i<n; i++ ) {
			if(a[i] > x ) {
				if(a[i] < y) {
					d++;
				}else {
					break;
				}
			}
		}
		if(d!=0)System.out.println("Số phần tử xuất hiện trong khoảng ("+x+","+y+") là: "+d);
		else System.out.println("-1");
	}
}
