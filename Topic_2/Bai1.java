	package Topic_2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào tổng phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i< n; i++)  a[i] = sc.nextInt();
		System.out.println("Nhập giá trị cần tìm: ");
		int x = sc.nextInt();
		int d = 0;
		for(int i = 0; i< n; i++) if(a[i] == x) d++;
		
		if(d!=0) System.out.println("Giá trị "+x+" tồn tại trong mảng");
		else System.out.println("Giá trị "+x+" không tồn tại trong mảng");
	}

}
