package BanHang;
import java.util.Scanner;

public class MenuKhachHang {

    public static void main(String[] args) {
        ArrayListKhachHang khachHangList = new ArrayListKhachHang();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("*=================MENU=====================*");
            System.out.println("*/===== QUẢN LÝ BÁN HÀNG KHÁCH HÀNG ======\\*");
            System.out.println("*===========================================*");
            System.out.println("||1. Nhập thông tin khách hàng            ||");
            System.out.println("||2. Hiển thị danh sách khách hàng        ||");
            System.out.println("||3. Chèn khách hàng vào vị trí bất kỳ    ||");
            System.out.println("||4. Xóa khách hàng theo mã               ||");
            System.out.println("||5. Tìm kiếm khách hàng theo mã          ||");
            System.out.println("||6. Sửa thông tin khách hàng theo mã     ||");
            System.out.println("||7. Quay lại menu chính                  ||");
            System.out.println("||8. Thoát chương trình                   ||");
            System.out.println("*=========================================*");
            System.out.println("Lựa chọn của bạn (1-8): ");
   
            chon = sc.nextInt();
           

            switch (chon) {
                case 1:
                    khachHangList.nhap();
                    break;
                case 2:
                    khachHangList.hThi();
                    break;
                case 3:
                    System.out.print("Nhập vị trí muốn chèn:");
                    int vt = sc.nextInt();
                    khachHangList.chenKhachHang(vt);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Nhập mã khách hàng muốn xóa: ");
                    String maKhachHang = sc.nextLine();
                    khachHangList.xoaTheoMaKhachHang(maKhachHang);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Nhập mã khách hàng muốn tìm kiếm: ");
                    maKhachHang = sc.nextLine();
                    KhachHang khachHang = khachHangList.timKiemTheoMaKhachHang(maKhachHang);
                    if (khachHang != null) {
                        System.out.println("Thông tin khách hàng:");
                        System.out.println("-------------------------");
                        System.out.println("Mã khách hàng: " + khachHang.getMaKhachHang());
                        System.out.println("Tên khách hàng: " + khachHang.getTenKhachHang());
                        System.out.println("Địa chỉ: " + khachHang.getDiaChi());
                        System.out.println("Số điện thoại: " + khachHang.getSdt());
                        System.out.println("Email: " + khachHang.getEmail());
                    } else {
                        System.out.println("Không tìm thấy khách hàng nào có mã " + maKhachHang);
                    }
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Nhập mã khách hàng muốn sửa: ");
                    maKhachHang = sc.nextLine();
                    khachHangList.suaThongTin(maKhachHang);
                    break;
                case 7:
                    System.out.println("Quay lại menu chính!");
                    break;
                case 8:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (chon != 7);
    }

}