package Topic_1;

import java.util.Random;
import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i< n; i++) a[i] = rand.nextInt(10000);
		
		// Gía trị cần thêm
		int b[] = new int[] {1,2,3};
		// ví trí cần chèn
		int k[] = new int[] {0,1,2};
		int c[] = new int[a.length+b.length];
		
		for(int i = 0; i < k.length; i++) {
			if(i == 0) c = addElement(a,k[i],b[i]);
			else c = addElement(c,k[i],b[i]);
		}
		
		for(int i = 0; i<c.length; i++) System.out.println("Phan tu thu "+i+": "+c[i]);	
	}
	
	public static int[] addElement (int[] a, int k, int b) {
		int[] arr = new int[a.length+1];
		for(int i=0; i<a.length+1;i++) {
			if(i==k) {
				arr[i]=b;
				continue;
			}
			if(i>k) {
				arr[i]=a[i-1];
				continue;
			}
			arr[i]=a[i];
		}
		return arr;
	}

}
