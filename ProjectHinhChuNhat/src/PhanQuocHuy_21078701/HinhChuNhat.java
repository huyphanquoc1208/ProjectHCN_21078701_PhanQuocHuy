package PhanQuocHuy_21078701;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if(d>0) {
			this.chieuDai = d;
		}else {
			System.out.println("Loi d");
		}
	}
	
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if(r<=0) {
			System.out.println("Loi r");
		}else {
			this.chieuRong = r;
		}
	}
	
	//constructor
	public HinhChuNhat() {}
	public HinhChuNhat(double d, double r) {
		if(d>0) {
			this.chieuDai = d;
		}else {
			System.out.println("Loi d");
		}
		if(r<=0) {
			System.out.println("Loi r");
		}else {
			this.chieuRong = r;
		}
	}
	//phuong thuc
	public double getCV() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getdientich() {
		return getChieuDai()*getChieuRong();
	}
	//tao mau in tostring
	@Override
	public String toString() {
		String s="";
		s=s+s.format("|%10s | %10s | %10s | %10s|", getChieuDai(),getChieuRong(),getCV(),getdientich());
		return s;
	}
	
	
	
}
