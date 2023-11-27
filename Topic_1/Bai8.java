package Topic_1;

import java.util.Random;
import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i< n; i++) a[i] = rand.nextInt(10000);
	
		System.out.print("Nhập vị trí cần xóa: ");
		int c = sc.nextInt();
		c -= 1;
		for(int i = 0; i< n; i++) System.out.println("Phần tử thứ "+i+":= "+a[i]);
		
		int b[] = new int[n-1];
		for(int i = 0; i < n-1;i++ ) {
			if(i==c) {
				b[i] = a[i+1];
				continue;
			}
			if(i>c) {
				b[i] = a[i+1];
				continue;
			}
			b[i] = a[i];
		}
		
		System.out.println("Sau khi xoa");
		for(int i = 0; i< (n-1); i++) System.out.println("Phần tử thứ "+i+":= "+b[i]);
		
	}
}
