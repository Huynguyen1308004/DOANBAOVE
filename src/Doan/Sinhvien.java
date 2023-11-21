package Doan;

public class Sinhvien extends Nguoi {
	private String maSV;
	private float dtb;
	private String kq, xl;
	
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	public String getKq() {
		return kq;
	}
	public void setKq(String kq) {
		this.kq = kq;
	}
	public String getXl() {
		return xl;
	}
	public void setXl(String xl) {
		this.xl = xl;
	}
	public Sinhvien(String hoTen, int tuoi, String maSv2, float dtb) {
		super(hoTen,tuoi) ;
		this.maSV = maSv2;
		this.dtb = dtb;
	}
	
}