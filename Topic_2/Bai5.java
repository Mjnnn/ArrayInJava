package Topic_2;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int a[] = new int[n];
		int b[] = new int[10000001];
		int d = 0;
		for(int i = 0; i< n; i++)  {
			a[i] = sc.nextInt();
			b[a[i]]++;
			max = (a[i] > max )? a[i] : max;	
		}
		for(int i = 0 ; i< max;i++) {
			if(b[i] > 1) {
				d++;
				System.out.print(i+" ");
			}
		}
		if(d==0) System.out.println(0);
		
	}
}
