package Topic_2;

import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i<n; i++) a[i] = sc.nextInt();
		System.out.print("Nhập giá trị cần tìm kiếm: ");
		int x = sc.nextInt();
		int check = timKiemTuyenTinh(a,x);
		if(check == 1) System.out.println("Tồn tại giá trị "+x+" trong mảng");
		else System.out.println("Không tồn tại giá trị "+x+" trong mảng");
	}
	
	public static int timKiemTuyenTinh(int[] a, int x) {
		int left = 0;
		int right = a.length-1;
		while(left <= right) {
			if(a[left] == x)  return 1;
			if(a[right] == x) return 1;
			left++;
			right--;
		}
		return -1;
	}
}
