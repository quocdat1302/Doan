package BanHang;

public class QuanAo {
	public String maSanPham;
	public  String tenSanPham;
	public String size;
	public double giaBan;
	public  int soLuong ;
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public QuanAo(String maSanPham, String tenSanPham, String size, double giaBan, int soLuong) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.size = size;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
	}
	public QuanAo() {
		super();
	}
	
	
}