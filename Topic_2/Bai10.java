package Topic_2;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int a[] = new int[n];
		int b[] = new int[100000001] ;
		int d = 0;
		for(int i = 0; i< n; i++)  {
			a[i] = sc.nextInt();
			b[a[i]]++;
			max = (a[i] > max )? a[i] : max;	
			min = (a[i] < min)? a[i] : min;
		}
		for(int i = min ; i< max;i++) {
			if(b[i] == 0) {
				d++;
				System.out.println(i);
				break;
			}
		}
		if(d==0) System.out.println(0);
		
	}
}
