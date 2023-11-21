package Doan;
import java.util.*;
import doanhoanchinh.QuanLyHocPhan;
import doanhoanchinh.HocPhan;
public class cacMenu {
	
	QuanLyHocPhan   obj  =new QuanLyHocPhan();
	quanlisinhvien svobj  =new quanlisinhvien();
	Scanner           sc  =new Scanner(System.in);
	public void menuSv()
	{
		int c1;
		do {
			System.out.println("1. Nhập sinh viên: ");
			System.out.println("2. Hiển thị sinh viên: ");
			System.out.println("3. Hiển thị sv có điểm trung bình >=5");
			System.out.println("4. Điền dữ liệu kq sinh viên ");
			System.out.println("5. Điền dữ liệu xl sinh viên ");
			System.out.println("6. Chèn Sinh Viên");
			System.out.println("7. Xoa SV theo Ma Sv");
			System.out.println("Mời bạn chọn: ");
			c1=sc.nextInt();
			switch(c1)
			{
			case 1: {svobj.nhap();break;}
			case 2: {svobj.hienthi();break;}
			case 3: {svobj.hienthiDk();break;}
			case 4: {svobj.kq(); svobj.hienthi();break;}
			case 5: {svobj.xl(); svobj.hienthi();break;}
			case 6:{
				System.out.print("nhap ma SV:");
				String maSV=sc.nextLine();
				sc.nextLine();
				System.out.print("nhap ho ten:");
				String Hoten= sc.nextLine();
				System.out.print("Nhap tuoi:");
				int tuoi=sc.nextInt();
				System.out.print("Nhap diem trung binh");
				float dtb=sc.nextFloat();
				Sinhvien sv=new Sinhvien(Hoten,tuoi,maSV,dtb);
				System.out.println("nhap vi trí cần chèn:");
				int vt =sc.nextInt();
				svobj.chen(vt, sv);
				break;
			}
			case 7:{System.out.println("nhap ma sv can xoa");
					String maSV=sc.nextLine();
					svobj.xoa(maSV);
					break;
					}
			case 8:{System.out.println(" cac sinh vien co diem tb lon nhat");
			svobj.hienthilonnhat();
			break;}

			default: break;
			}
		}while(c1<8);
}
	public void menuHp()
	{ int c2;
	do {
		System.out.println("1. Đọc File: ");
		System.out.println("2. Hiển thị: ");
		System.out.println("3. Hiển thị học phần cần liệt kê");
		System.out.println("4. Chèn hoc phần");
		System.out.println("5. Xoá hoc phần: ");
		System.out.println("Mời bạn chọn");
		c2=sc.nextInt();
		switch(c2)
		{
		case 1: obj.KhoiTao(); obj.docFile(); break;
		case 2: obj.KhoiTao(); obj.docFile(); obj.hienthi(); break;
		case 3: System.out.println("nhap hoc ky can hien thi:");
				int hk1=sc.nextInt(); obj.hienthihk(hk1);break;
		case 4: System.out.println("nhap ma hp:");
				String maHp=sc.nextLine();
				//sc.nextLine();
				System.out.print("Nhap ten hoc phan");
				String tenHp=sc.nextLine();
				System.out.print("nhap so tin chi");
				int soTc =sc.nextInt();
				System.out.print("Nhap hoc ky:");
				int hk =sc.nextInt();
				sc.nextLine();
				HocPhan hp=new HocPhan(maHp,tenHp,soTc,hk);
				System.out.println("nhap vi tri can chen");
				int vt=sc.nextInt();
				obj.chen(hp,vt);break;
		case 5: System.out.println("nhap vi tri can xoa:");
				String tenHpXoa=sc.nextLine();
				obj.xoa(tenHpXoa); obj.hienthi();break;
				default:break;
		}
	}while(c2<6);
	}
}