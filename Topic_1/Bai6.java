package Topic_1;

import java.util.Random;
import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		// Mảng gốc
		int a[] = new int[n];
		// Mảng chẵn
		int b[] = new int[n];
		// Mảng lẽ 
		int c[] = new int[n];
		int indexC = 0;
		int indexL = 0;
		int sumC = 0;
		int sumL = 0;
		for(int i = 0; i< n; i++) {
			a[i] = rand.nextInt(10000);
			if(a[i] % 2 == 0) {
				b[indexC] = a[i];
				indexC++;
			}else {
				c[indexL] = a[i];
				indexL++;
			}
		}
		for(int i = 0 ; i< n; i++)System.out.println("Phân tử trong mảng: " + a[i]);
		for(int i = 0; i< indexC; i++) sumC += b[i];
		for(int i = 0; i < indexL; i++) sumL += c[i];
		
		System.out.println("Tổng các phần tử chẵn trong mảng: "+sumC);
		System.out.println("Tổng các phần tử lẻ trong mảng: "+sumL);
	}

}
