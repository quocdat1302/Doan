package BanHang;
import java.util.*;
public class KhachHang {
	public String maKhachHang;
	public String tenKhachHang;
	public String diaChi;
	public int sdt;
	public String email ;
	public String maSanPhamDaMua;
	
	public String getMaSanPhamDaMua() {
		return maSanPhamDaMua;
	}
	public void setMaSanPhamDaMua(String maSanPhamDaMua) {
		this.maSanPhamDaMua = maSanPhamDaMua;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public KhachHang(String maKhachHang, String tenKhachHang, String diaChi, int sdt, String email) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.email = email;
	}
	public KhachHang() {
		super();
	}
	
	
	

}
