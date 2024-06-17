package BanHang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayListKhachHang khachHangList = new ArrayListKhachHang();
        int chon;
        do {
            System.out.println("<===============================>");
            System.out.println("/========QUẢN LÝ QUẦN ÁO========\\");
            System.out.println("*=================================*");
            System.out.println("||    1. Quản lý sản phẩm      ||");
            System.out.println("||    2. Quản lý khách hàng    ||");
            System.out.println("||    3. Thoát chương trình    ||");
            System.out.println("*=================================*");
            System.out.print("Mời bạn chọn: ");

            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    new Menu().main(args);;
                    break;  
                case 2:
                    new MenuKhachHang().main(args);
                    break;
               
                case 3:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

    
            
            
            
            System.out.println("Bạn có muốn tiếp tục sử dụng chương trình? (y/n)");
            String tieptuc = sc.next();
            if (!tieptuc.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);
    }
}
