package Topic_1;

import java.util.Random;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i< n; i++) a[i] = rand.nextInt(10000);
		for(int i = 0; i< n; i++) System.out.println("Phần tử thứ "+i+":= "+a[i]);
	}
}
