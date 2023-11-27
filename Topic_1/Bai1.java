package Topic_1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i< n; i++) a[i] = sc.nextInt();
		for(int i = 0; i< n; i++) System.out.println("Phần tử thứ "+i+":= "+a[i]);

	}

}
