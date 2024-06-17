package BanHang;
import java.util.Scanner;
public class Menu {
	public 	static void main(String [] args) {
		ArrayListQuanAo quanAoList = new ArrayListQuanAo();
		menuLocSanPham locSanPham = new menuLocSanPham();
		Scanner sc=new Scanner (System.in);
		int chon;
		do {
			  System.out.println("<===================MENU===================>");
	            System.out.println("/========= QUẢN LÝ BÁN HÀNG QUẦN ÁO========\\");
	            System.out.println("*===========================================*");
	            System.out.println("||    1. Nhập thông tin sản phẩm         ||");
	            System.out.println("||    2. Hiển thị danh sách sản phẩm     ||");
	            System.out.println("||    3. Chèn sản phẩm vào vị trí bất kỳ ||");
	            System.out.println("||    4. Xóa sản phẩm theo mã            ||");
	            System.out.println("||    5. Tìm kiếm sản phẩm theo mã       ||");
	            System.out.println("||    6. Sửa thông tin sản phẩm theo mã  ||");
	            System.out.println("||    7. Lọc sản phẩm                    ||");
	            System.out.println("||    8. Quay lại menu chính             ||");
	            System.out.println("||    9. Thoát chương trình              ||");
	            System.out.println("*===========================================*");
	            System.out.println("Lựa chọn của bạn (1-9): ");
	            chon = sc.nextInt();

	            switch (chon) {
	                case 1:
	                    quanAoList.nhap();
	                    break;
	                case 2:
	                    quanAoList.hThi();
	                    break;
	                case 3:
	                    System.out.print("Nhập vị trí muốn chèn:");
	                    int vt = sc.nextInt();
	                    quanAoList.chenSanPham(vt);
	                    break;
	                case 4:
	                	sc.nextLine();
	                    System.out.println("Nhập mã sản phẩm muốn xóa: ");
	                    
	                    String maSanPham = sc.nextLine();
	                    quanAoList.xoa(maSanPham);
	                    break;
	                case 5:
	                	sc.nextLine();
	                    System.out.println("Nhập mã sản phẩm muốn tìm kiếm: ");
	                    
	                    maSanPham = sc.nextLine();
	                    QuanAo sp = quanAoList.timKiemTheoMa(maSanPham);
	                    if (sp != null) {
	                        System.out.println("Thông tin sản phẩm:");
	                        System.out.println("-------------------------");
	                        System.out.println("Mã sản phẩm: " + sp.getMaSanPham());
	                        System.out.println("Tên sản phẩm: " + sp.getTenSanPham());
	                        System.out.println("Kích cỡ: " + sp.getSize());
	                        System.out.println("Giá bán: " + sp.getGiaBan());
	                        System.out.println("Số lượng: " + sp.getSoLuong());
	                    } else {
	                        System.out.println("Không tìm thấy sản phẩm nào có mã " + maSanPham);
	                    }
	                    break;
	                case 6:
	                	sc.nextLine();
	                    System.out.println("Nhập mã sản phẩm muốn sửa: ");
	                    maSanPham = sc.nextLine();
	                    quanAoList.suaThongTinSanPham(maSanPham);
	                    break;
	                    
	              
	                case 7:
	                    // Menu lọc sản phẩm
	                	locSanPham.menuLocSanPham(sc, quanAoList);
	                    break;
	                case 8:
	                    System.out.println("Quay lại menu chính!");
	                    break;
	                case 9:
	                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
	                    break;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ!");
	                    break;
	            }
		
		}while (chon != 8); 
	}
}

