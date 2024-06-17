package BanHang;
import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListKhachHang {
    public ArrayList<KhachHang> KhachHangList = new ArrayList<KhachHang>();
   

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng khách hàng: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin khách hàng thứ " + (i + 1));
            System.out.println("Nhập mã Khách Hàng:");
            String maKhachHang = sc.nextLine();
            System.out.println("Nhập Tên Khách Hàng:");
            String tenKhachHang = sc.nextLine();
            System.out.println("Địa Chỉ:");
            String diaChi = sc.nextLine();
            System.out.println("Số điện thoại :");
            int sdt = sc.nextInt();
            sc.nextLine();
            System.out.println("Email:");
            String email = sc.nextLine();

            KhachHang khachHang = new KhachHang(maKhachHang, tenKhachHang, diaChi, sdt, email);
            KhachHangList.add(khachHang);
        }
    }

    public void hThi() {
        if (KhachHangList.size() > 0) {
            System.out.println("Danh sách Khách Hàng:");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.format("|%-15s | %-20s | %-30s | %-15s | %-20s\n", "Mã KH", "Tên KH", "Địa chỉ", "Số ĐT", "Email");
            System.out.println("----------------------------------------------------------------------------------------------------------");
            for (KhachHang kh : KhachHangList) {
                System.out.format("|%-15s | %-20s | %-30s | %-15s | %-20s\n", kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getDiaChi(), kh.getSdt(), kh.getEmail());
            }
            System.out.println("----------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("Danh sách khách hàng trống!");
        }
    }


    public void chenKhachHang(int vt) {
        Scanner sc = new Scanner(System.in);

        if (vt < 0 || vt > KhachHangList.size()) {
            System.out.println("Vị trí chèn không hợp lệ!");
            return;
        }

        System.out.println("Nhập thông tin khách hàng:");
        System.out.println("Nhập mã Khách Hàng:");
        String maKhachHang = sc.nextLine();
        System.out.println("Nhập Tên Khách Hàng:");
        String tenKhachHang = sc.nextLine();
        System.out.println("Địa chỉ:");
        String diaChi = sc.nextLine();
        System.out.println("Số điện thoại:");
        int sdt = sc.nextInt();
        sc.nextLine();
        System.out.println("Email:");
        String email = sc.nextLine();

        KhachHang khachHang = new KhachHang(maKhachHang, tenKhachHang, diaChi, sdt, email);
        KhachHangList.add(vt, khachHang);

        System.out.println("Chèn khách hàng thành công!");
        hThi();
    }

    public KhachHang timKiemTheoMaKhachHang(String maKhachHang) {
        for (KhachHang kh : KhachHangList) {
            if (kh.getMaKhachHang().equals(maKhachHang)) {
                return kh;
            }
        }
        return null;
    }

    private boolean tontai(String maKhachHang) {
        for (KhachHang kh : KhachHangList) {
            if (kh.getMaKhachHang().equals(maKhachHang)) {
                return true;
            }
        }
        return false;
    }

    public void xoaTheoMaKhachHang(String maKhachHang) {
        if (!tontai(maKhachHang)) {
            System.out.println("Mã khách hàng " + maKhachHang + " không tồn tại!");
            return;
        }

        for (int i = 0; i < KhachHangList.size(); i++) {
            if (KhachHangList.get(i).getMaKhachHang().equals(maKhachHang)) {
                KhachHang kh = KhachHangList.remove(i);
                System.out.println("Khách hàng với mã " + maKhachHang + " (" + kh.getTenKhachHang() + ") đã được xóa khỏi danh sách.");
                break;
            }
        }
    }

    public void suaThongTinSanPham(String maKhachHang) {
        suaThongTin(maKhachHang);
    }

    public void suaThongTin(String maKhachHang) {
        Scanner sc = new Scanner(System.in);

     
        KhachHang kh = timKiemTheoMaKhachHang(maKhachHang);
        if (kh == null) {
            System.out.println("Khách hàng với mã " + maKhachHang + " không tồn tại!");
            return;
        }

        System.out.println("Nhập tên khách hàng mới:");
        String tenKhachHang = sc.nextLine();
        String diaChi = sc.nextLine();
        System.out.println("Nhập số điện thoại mới:");
        int sdt = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập email mới:");
        String email = sc.nextLine();

        
        kh.setTenKhachHang(tenKhachHang);
        kh.setDiaChi(diaChi);
        kh.setSdt(sdt);
        kh.setEmail(email);

        System.out.println("Cập nhật thông tin khách hàng thành công!");
    }

   
}
