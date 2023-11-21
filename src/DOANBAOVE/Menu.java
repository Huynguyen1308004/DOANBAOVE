 package DOANBAOVE;
 import java.util.Scanner;
 public class Menu {
 	QLSV svobj  =new QLSV();
 	QuanLiHocPhan hpobj=new QuanLiHocPhan();
 	QLGV gvobj=new QLGV();
 	Scanner           sc  =new Scanner(System.in);
 	public void menuSv()
 	{
 		int c1;
 		do {
 			System.out.println("******QUAN LY SINH VIEN******** ");
 			System.out.println("1. Nhập sinh  viên:");
 			System.out.println("2. Hiển thị sinh  viên:");
 			System.out.println("3. Thêm sinh  viên:");
 			System.out.println("4. Xoá sinh  viên theo mã sinh  viên:");
 			System.out.println("5. Hiển thị những sinh  viên có điểm thi lớn hơn 5:");
 			System.out.println("6. Sắp xếp điểm sinh  viên giảm dần : ");		
 			System.out.println("****************************** ");
 			System.out.println("Mời bạn chọn: ");
 			c1=sc.nextInt();
 			sc.nextLine();
 			switch(c1)
 			{
 			case 1: {svobj.Nhap();break;}
 			case 2: {svobj.hienthi();break;}
 			case 3: 
 			{
 				 System.out.print("Nhập mã sinh  viên:");
 				 String maSV= sc.nextLine();
 				 System.out.print("Nhập họ tên sinh  viên:");
 				 String HoVaTen=sc.nextLine();
 				 System.out.print("Nhập tuổi:");
 				 int tuoi=sc.nextInt();
 				 sc.nextLine();
 				 System.out.print("Nhập giới tính:");
 				 String gioitinh=sc.nextLine();
 				 System.out.print("Nhập địa chỉ:");
 				 String DiaChi= sc.nextLine();
 				 System.out.print("sinh  viên thuộc Khoa:");
 				 String Khoa=sc.nextLine();
 				 System.out.print("Nhập điểm quá trình:");
 				 float DiemQuaTrinh =sc.nextFloat();
 				 System.out.print("Nhập điểm thi:");
 				 float DiemThi=sc.nextFloat();
 				 SinhVien sv=new SinhVien(maSV,HoVaTen,tuoi,gioitinh,DiaChi,Khoa,DiemQuaTrinh,DiemThi);
 				 System.out.print("Nhập vị trí cần chèn:");
 				 int vt=sc.nextInt();
 				 svobj.chen(vt, sv);
 				 svobj.hienthi();
 				 break;
 			}
 			case 4: 
 			{
 				System.out.print("Nhập mã của sinh  viên cần xóa:");
 				String maSV=sc.nextLine();
 				svobj.xoa(maSV);
 				break;
 				}
 			case 5: {svobj.hienthi5();break;}
 			case 6: 
 			{
 				svobj.SapXepTheoDiem();
 				svobj.hienthi();
 				break;
 			}
 			
 			
 }
 		}while (c1<7);
 	}
 	public void menuHp()
 	{
 		int c2;
 		do {
 			System.out.println("******QUẢN LÝ HỌC PHẦN******** ");
 			System.out.println("1. Nhập học phần: ");
 			System.out.println("2. Hiển thị học phần: ");
 			System.out.println("3. Thêm học phần:");
 			System.out.println("4. Xóa học phần:");
 			System.out.println("5. Sắp xếp tên HP tăng dần: ");
 			System.out.println("****************************** ");
 			System.out.println("Mời bạn chọn: ");
 			c2=sc.nextInt();
 			sc.nextLine();
 			switch(c2)
 			{
 			case 1: {hpobj.NhapHocPhan();break;}
 			case 2: {hpobj.HienThi();break;}
 			case 3: 
 			{
 				System.out.print("Nhập mã học phần:");
 				String maHp=sc.nextLine();
 				System.out.print("Nhập tên học phần:");
 				String tenHp=sc.nextLine();
 				System.out.print("Nhập số tín chỉ:");
 				int soTc=sc.nextInt();
 				sc.nextLine();
 				System.out.print("Nhập học kỳ của học phần:");
 				String HocKy=sc.nextLine();
 				System.out.print("Học phần của khoa:");
 				String Khoa=sc.nextLine();
 				HocPhan hp=new HocPhan(soTc,maHp,tenHp,HocKy,Khoa);
 				System.out.print("Nhập vị trí cần chèn:");
 				int vt=sc.nextInt();
 				hpobj.chen(hp, vt);
 				hpobj.HienThi();
 			}
 			case 4: 
 			{
 				System.out.print("Nhập tên của học phần cần xóa:");
 				String tenHp=sc.nextLine();
 				hpobj.xoa(tenHp);
 				hpobj.HienThi();
 				
 				break;
 			}
 			case 5:
 			{
 				hpobj.SapXepTheoTenhocky();
 				hpobj.HienThi();
 				break;
 			}
 			
 			
 }
 		}while (c2<7);
 	}
	public void menuGv()
 	{
 		int c1;
 		do {
 			System.out.println("******QUAN LY GIANG VIEN******** ");
 			System.out.println("1. Nhập Giảng  viên:");
 			System.out.println("2. Hiển thị Giảng  viên:");
 			System.out.println("3. Thêm Giảng  viên:");
 			System.out.println("4. Xoá Giảng  viên theo mã Giảng  viên:");
 			System.out.println("5. Sắp xếp tên Giảng  viên Tăng dần : ");		
 			System.out.println("****************************** ");
 			System.out.println("Mời bạn chọn: ");
 			c1=sc.nextInt();
 			sc.nextLine();
 			switch(c1)
 			{
 			case 1: {gvobj.Nhap();break;}
 			case 2: {gvobj.hienthi();break;}
 			case 3: 
 			{
 				 System.out.print("Nhập mã Giảng  viên:");
 				 String magv= sc.nextLine();
 				 System.out.print("Nhập họ tên Giảng  viên:");
 				 String HoVaTen=sc.nextLine();
 				 System.out.print("Nhập tuổi:");
 				 int tuoi=sc.nextInt();
 				 sc.nextLine();
 				 System.out.print("Nhập giới tính:");
 				 String gioitinh=sc.nextLine();
 				 System.out.print("Nhập địa chỉ:");
 				 String DiaChi= sc.nextLine();
 				 System.out.print("Giảng  viên thuộc Khoa:");
 				 String Khoa=sc.nextLine();
 				 Giangvien gv=new Giangvien(magv,tuoi,HoVaTen,gioitinh,DiaChi,Khoa);
 				 System.out.print("Nhập vị trí cần chèn:");
 				 int vt=sc.nextInt();
 				 gvobj.chen(vt, gv);
 				 gvobj.hienthi();
 				 break;
 			}
 			case 4: 
 			{
 				System.out.print("Nhập mã của Giảng  viên cần xóa:");
 				String magv=sc.nextLine();
 				gvobj.xoa(magv);
 				break;
 				}
 			case 5: 
 			{
 				gvobj.SapXepTheoTen();
 				gvobj.hienthi();
 				break;
 			}
 			
 			
 }
 		}while (c1<7);
 	}
 }