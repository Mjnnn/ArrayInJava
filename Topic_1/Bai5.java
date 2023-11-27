package Topic_1;

import java.util.Random;
import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int index = 0;
		for(int i = 0; i< n; i++) {
			a[i] = rand.nextInt(10000);
			if(a[i] % 2 != 0) {
				b[index] = a[i];
				index++;
			}
		}
		for(int i = 0; i< index; i++) System.out.println("Phần tử lẻ = "+b[i]);
	
	}
}
