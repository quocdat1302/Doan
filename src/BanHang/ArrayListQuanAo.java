	package BanHang;
	
	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.Scanner;
	
	public class ArrayListQuanAo {
	    public ArrayList<QuanAo> QuanAoList = new ArrayList<QuanAo>();
	
	    public void nhap() {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.print("Nhập số lượng sản phẩm: ");
	        n = sc.nextInt();
	        sc.nextLine();
	        for (int i = 0; i < n; i++) {
	            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1));
	            System.out.println("Nhập Mã Sản Phẩm:");
	            String maSanPham = sc.nextLine();
	            System.out.println("Nhập Tên Sản Phẩm:");
	            String tenSanPham = sc.nextLine();
	            System.out.println("Nhập Kích Cỡ :");
	            String size = sc.nextLine();
	            System.out.println("Giá Bán :");
	            double giaBan = sc.nextDouble();
	            System.out.println("Số lượng quần áo:");
	            int soLuong = sc.nextInt();
	            sc.nextLine();
	
	            QuanAo quanAo = new QuanAo(maSanPham, tenSanPham, size, giaBan, soLuong );
	            QuanAoList.add(quanAo);
	        }
	    }
	
	    public void hThi() {
	    	 if (QuanAoList.size() > 0) { 
	    	        System.out.println("Danh sách sản phẩm:");
	    	        System.out.println("-----------------------------------------------------------------------------------------");
	    	        System.out.format("|%-15s | %-20s | %-10s | %-10s | %-10s\n", "Mã SP", "Tên SP", "Kích cỡ", "Giá bán", "Số lượng");
	    	        System.out.println("-----------------------------------------------------------------------------------------");
	    	        for (QuanAo sp : QuanAoList) {
	    	            System.out.format("%-15s | %-20s | %-10s | %-10s | %-10s\n", sp.getMaSanPham(), sp.getTenSanPham(), sp.getSize(), sp.getGiaBan(), sp.getSoLuong());
	    	        }
	    	        System.out.println("-----------------------------------------------------------------------------------------");
	    	    } else {
	    	        System.out.println("Danh sách sản phẩm trống!");
	    	    }
	    }
	
	    public void chenSanPham(int vt) {
	        Scanner sc = new Scanner(System.in);
	
	        if (vt < 0 || vt > QuanAoList.size()) {
	            System.out.println("Vị trí chèn không hợp lệ!");
	            return;
	        }
	
	        System.out.println("Nhập thông tin sản phẩm:");
	        System.out.println("Nhập mã Sản Phẩm:");
	        String maSanPham = sc.nextLine();
	        System.out.println("Nhập Tên Sản Phẩm:");
	        String tenSanPham = sc.nextLine();
	        System.out.println("Nhập Kích cỡ quần áo :");
	        String size = sc.nextLine();
	        System.out.println("Giá Bán :");
	        double giaBan = sc.nextDouble();
	        System.out.println("Số lượng quần áo:");
	        int soLuong = sc.nextInt();
	
	        QuanAo quanAo = new QuanAo(maSanPham, tenSanPham, size, giaBan, soLuong);
	        QuanAoList.add(vt, quanAo);
	
	        System.out.println("Chèn sản phẩm thành công!");
	        hThi();
	    }
	    private boolean tontai(String maSanPham) {
	        for (QuanAo sp : QuanAoList) {
	            if (sp.getMaSanPham().equals(maSanPham)) {
	                return true;
	            }
	        }
	        return false;
	    }
	
	    public void xoa(String maSanPham) {
	  
	        if (!tontai(maSanPham)) {
	            System.out.println("Mã sản phẩm " + maSanPham + " không tồn tại!");
	            return;
	        }
	
	        for (int i = 0; i < QuanAoList.size(); i++) {
	            if (QuanAoList.get(i).getMaSanPham().equals(maSanPham)) { // So sánh bằng phương thức equals
	                QuanAoList.remove(i);
	                System.out.println("Mã sản phẩm " + maSanPham + " đã được xóa khỏi danh sách.");
	                break;
	            }
	        }
	    }
	
	   
	
	
	    public QuanAo timKiemTheoMa(String maSanPham) {
	        for (QuanAo sp : QuanAoList) {
	            if (sp.getMaSanPham().equals(maSanPham)) { 
	                return sp;
	            }
	        }
	        return null;
	    }
		 public void suaThongTin(String maSanPham) {
			 Scanner sc = new Scanner (System.in);
			 QuanAo sp = timKiemTheoMa(maSanPham);
			 
			 
		 }
		 public void suaThongTinSanPham(String maSanPham) {
			    Scanner sc = new Scanner(System.in);
	
		
			    QuanAo sp = timKiemTheoMa(maSanPham);
			    if (sp != null) {
			       
			        System.out.println("Nhập tên sản phẩm mới:");
			        String tenSanPham = sc.nextLine();
			        System.out.println("Nhập kích cỡ quần áo mới:");
			        String size = sc.nextLine();
			        System.out.println("Nhập giá bán mới:");
			        double giaBan = sc.nextDouble();
	
			       
			        sp.setTenSanPham(tenSanPham);
			        sp.setSize(size);
			        sp.setGiaBan(giaBan);
	
			        System.out.println("Cập nhật thông tin sản phẩm thành công!");
			    } else {
			        System.out.println("Không tìm thấy sản phẩm nào có mã " + maSanPham);
			    }
			}

		  
			
				 public ArrayList<QuanAo> locTheoGiaBan(double giaBanMin, double giaBanMax) {
					    ArrayList<QuanAo> sanPhamLoc = new ArrayList<>();

					    for (QuanAo sp : QuanAoList) {
					        if (sp.getGiaBan() >= giaBanMin && sp.getGiaBan() <= giaBanMax) {
					            sanPhamLoc.add(sp);
					        }
					    }
					    

					    return sanPhamLoc;
					}

					public ArrayList<QuanAo> locTheoKichCo(String[] sizeList) {
					    ArrayList<QuanAo> sanPhamLoc = new ArrayList<>();


					    Scanner scanner = new Scanner(System.in);
				        System.out.print("Nhập kích thước sản phẩm bạn muốn lọc (Small/Medium/Large): ");
				        String sizeFilter = scanner.nextLine();

				        System.out.println("Các sản phẩm có kích thước " + sizeFilter + ":");
				        for (QuanAo sp : QuanAoList) {
				            if (sp.getSize().equalsIgnoreCase(sizeFilter)) {
				                System.out.println(sp.tenSanPham + " | " + sp.getSize());
				            }
				        }
					    return sanPhamLoc;
					}
				


			    public void hienThiKetQuaLoc(ArrayList<QuanAo> sanPhamLoc) {
			        if (sanPhamLoc.size() > 0) {
			            System.out.println("Kết quả lọc:");
			            
			            System.out.println("-----------------------------------------------------------------------------------------");
		    	        System.out.format("|%-15s | %-20s | %-10s | %-10s | %-10s\n", "Mã SP", "Tên SP", "Kích cỡ", "Giá bán", "Số lượng");
		    	        System.out.println("-----------------------------------------------------------------------------------------");
		    	        for (QuanAo sp : QuanAoList) {
		    	            System.out.format("%-15s | %-20s | %-10s | %-10s | %-10s\n", sp.getMaSanPham(), sp.getTenSanPham(), sp.getSize(), sp.getGiaBan(), sp.getSoLuong());
		    	        }
		    	        System.out.println("-----------------------------------------------------------------------------------------");		
		    	        } else {
			            System.out.println("Không tìm thấy sản phẩm nào phù hợp với điều kiện lọc!");
			        }
			    }
		    }

	
	
		
