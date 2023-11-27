package Topic_1;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		// Mảng chứa tên sinh viên
		String[] nameSV = new String[n];
		// Mảng chứa điểm SQL Basic
		int[] scoreSQLBasic = new int[n];
		// Mảng chứa điểm JavaBasic
		int[] scoreJavaBasic = new int[n];
		// Mảng chứa điểm Java Advanced
		int[] scoreJavaAdvanced = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("====== Sinh Vien Thu "+(i+1)+"=====");
			System.out.print("Nhap ten sinh vien: ");
			sc.nextLine();
			nameSV[i] = sc.nextLine();
			System.out.print("Nhap diem SQL Basic: ");
			scoreSQLBasic[i] = sc.nextInt();
			System.out.print("Nhap diem Java Basic: ");
			scoreJavaBasic[i] = sc.nextInt();
			System.out.print("Nhap diem Java Advanced: ");
			scoreJavaAdvanced[i] = sc.nextInt();
		}
		System.out.println("   Họ Và Tên \t\t\t\t\t\t Điểm SQL Basic \t Điểm Java Basic \t Điểm Java Advanced");
		for(int i=0; i<n;i++) {
			System.out.println(i+". "+nameSV[i]+" \t\t\t\t\t\t\t "+scoreSQLBasic[i]+" \t\t\t "+scoreJavaBasic[i] +" \t\t\t "+scoreJavaAdvanced[i]);
		}
		
		// Tính điểm trung bình của các học viên
		for(int i=0; i<n; i++) {
			float sum = diemTrungBinh(scoreSQLBasic[i],scoreJavaBasic[i],scoreJavaAdvanced[i]);
			System.out.println("Điểm trung bình của "+nameSV[i]+" là: "+sum);
		}
		System.out.println("\n Các Sinh Viên Có Điểm Trung Bình >= 6.5: ");
		for(int i =0 ; i< n ; i++) {
			float sum = diemTrungBinh(scoreSQLBasic[i],scoreJavaBasic[i],scoreJavaAdvanced[i]);
			if(sum >= 6.5) {
				System.out.println("+ "+nameSV[i]);
			}
		}
	}
	
	public static float diemTrungBinh(int a, int b, int c ) {
		float sum = (float) 1.0f*(a+b+c)/3;
		return sum;
	}
	
	
}
