package PhanQuocHuy_21078701;

import java.util.Scanner;

public class testHCN {
	public static  void inTD() {
		for(int i = 0; i <45; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%10s | %10s | %10s | %10s|","Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
		System.out.println();
		for(int i=0; i<45; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	
	public static HinhChuNhat nhapMem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		double d= sc.nextDouble();
		System.out.println("Nhap chieu rong: ");
		double r= sc.nextDouble();
		HinhChuNhat h1= new HinhChuNhat();
		h1.setChieuDai(d);
		h1.setChieuRong(r);
		return h1;
	}
	
	public static void main(String[] args) {
		HinhChuNhat h1= new HinhChuNhat();
		h1.setChieuDai(10);
		h1.setChieuRong(5);
		inTD();
		System.out.println(h1.toString());
		for(int i = 0; i<45; i++) {
			System.out.printf("-");
		}
		
		System.out.println();
		
		HinhChuNhat h2= new HinhChuNhat(70, 50);
		inTD();
		System.out.println(h1.toString());
		for(int i = 0; i<45;i++) {
			System.out.printf("-");
		}
		System.out.println();
		nhapMem();
		inTD();
	}
}
