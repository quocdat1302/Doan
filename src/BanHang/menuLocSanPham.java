	package BanHang;
	
	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.Scanner;
	public class menuLocSanPham {
		 public static void menuLocSanPham(Scanner sc, ArrayListQuanAo quanAoList) {
		        int luaChon;
		        do {
		            System.out.println("*===========MENU LỌC SẢN PHẨM============*");
		            System.out.println("*========================================*");
		            System.out.println("||  1. Lọc theo giá bán                ||");
		            System.out.println("||  2. Lọc theo kích cỡ                ||");
		            System.out.println("||  3. Quay lại menu chính             ||");
		            System.out.println("*========================================*");
		            System.out.println("Lựa chọn của bạn (1-3): ");
		            luaChon = sc.nextInt();
	
		            switch (luaChon) {
		                case 1:
		                    System.out.println("Nhập giá bán tối thiểu: ");
		                    double giaMin = sc.nextDouble();
		                    System.out.println("Nhập giá bán tối đa: ");
		                    double giaMax = sc.nextDouble();
		                    ArrayList<QuanAo> spLocGia = quanAoList.locTheoGiaBan(giaMin, giaMax);
		                    quanAoList.hienThiKetQuaLoc(spLocGia);
		                    break;
		                case 2:
		                    System.out.println("Danh sách sản phẩm:");
		                    for (int i = 0; i < quanAoList.QuanAoList.size(); i++) {
		                        QuanAo sp = quanAoList.QuanAoList.get(i);
		                        System.out.println((i + 1) + ". " + sp.getTenSanPham() + " - Kích cỡ: " + sp.getSize());
		                    }
		                    
		                    System.out.println("Chọn sản phẩm để lọc theo kích cỡ:");
		                    int luaChonSanPham = sc.nextInt();
		                    sc.nextLine(); 

		                    if (luaChonSanPham >= 1 && luaChonSanPham <= quanAoList.QuanAoList.size()) {
		                        QuanAo spChon = quanAoList.QuanAoList.get(luaChonSanPham - 1);
		                        String[] sizeList = { spChon.getSize() };
		                        ArrayList<QuanAo> spLocKichCo = quanAoList.locTheoKichCo(sizeList); 

		                        quanAoList.hienThiKetQuaLoc(spLocKichCo);
		                    } else {
		                        System.out.println("Lựa chọn không hợp lệ!");
		                    }
		                    break;

		              
		                case 3:
		                    System.out.println("Quay lại menu chính!");
		                    break;
		                default:
		                    System.out.println("Lựa chọn không hợp lệ!");
		            }
		        } while (luaChon != 3);
		    }
		}
	
