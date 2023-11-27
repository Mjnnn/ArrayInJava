package Topic_2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i< n; i++)  a[i] = sc.nextInt();
		System.out.print("Nhập giá trị cần tìm: ");
		int x = sc.nextInt();
		int d = 0;
		for(int i = 0; i< n; i++) {
			if(a[i] == x) {
				System.out.print(i+", ");
				d++;
			}
		}
		
		if(d==0) System.out.println("-1");
	}
}
