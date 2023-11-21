package DOANBAOVE;
import java.util.*;
public class QLSV {
	public ArrayList<SinhVien> DSSV = new ArrayList<SinhVien>();
	Scanner sc=new Scanner(System.in);
	
	 public void Nhap() {
	  try {
          System.out.print("Nhập số lượng SV:");
          int slsv =sc.nextInt();
          sc.nextLine();
          for (int i=0;i<slsv;i++) {
              System.out.print("Nhập mã SV:");
              String maSV= sc.nextLine();
              System.out.print("Nhập họ tên SV:");
              String HoVaTen=sc.nextLine();
              System.out.print("Nhập tuổi:");
              int tuoi=sc.nextInt();
              sc.nextLine();
              System.out.print("Nhập giới tính:");
              String gioitinh=sc.nextLine();
              System.out.print("Nhập địa chỉ:");
              String DiaChi= sc.nextLine();
              System.out.print("SV thuộc Khoa:");
              String Khoa=sc.nextLine();
              System.out.print("Nhập điểm quá trình:");
              float DiemQuaTrinh =sc.nextFloat();
              System.out.print("Nhập điểm thi:");
              float DiemThi=sc.nextFloat();
              sc.nextLine();
              SinhVien sv=new SinhVien(maSV,HoVaTen,tuoi,gioitinh,DiaChi,Khoa,DiemQuaTrinh,DiemThi);
              DSSV.add(sv);
          }
      } catch (InputMismatchException e) {
          System.out.println("Lỗi: Nhập sai định dạng của dữ liệu! Vui lòng nhập lại.");
      }
  }
	 public void hienthi()
	 {
		 for(SinhVien sv:DSSV)
		 {
			 System.out.println("****************************** ");
			 System.out.println("Ma Sinh Vien:"+ sv.getMaSV());
			 System.out.println("Ho va ten:"+ sv.getHoTen());
			 System.out.println("Tuoi:"+sv.getTuoi());
			 System.out.println("Gioi Tinh:"+sv.getGioitinh());
			 System.out.println("Dia Chi:"+sv.getDiaChi());
			 System.out.println("Thuoc Khoa:"+sv.getKhoa());
			 System.out.println("Diem Qua Trinh:"+sv.getDiemQuaTrinh());
			 System.out.println("Diem Thi:"+sv.getDiemThi());
			 System.out.println("****************************** ");
			 
			 
		 }
	 }
	 public void hienthi5()
	 {
		 for(SinhVien sv:DSSV)
		 {
			if(sv.getDiemThi()>5)
			{
				 System.out.println("****************************** ");
				 System.out.println("Ma Sinh Vien:"+ sv.getMaSV());
				 System.out.println("Ho va ten:"+ sv.getHoTen());
				 System.out.println("Tuoi:"+sv.getTuoi());
				 System.out.println("Gioi Tinh:"+sv.getGioitinh());
				 System.out.println("Dia Chi:"+sv.getDiaChi());
				 System.out.println("Thuoc Khoa:"+sv.getKhoa());
				 System.out.println("Diem Qua Trinh:"+sv.getDiemQuaTrinh());
				 System.out.println("Diem Thi:"+sv.getDiemThi());
				 System.out.println("****************************** ");
			}
		 }
	 }
		public void chen(int vt, SinhVien obj)
		{
			try {
            DSSV.add(vt, obj);
				} catch (IndexOutOfBoundsException e) {
						System.out.println("Lỗi: Vị trí chèn vượt quá giới hạn!");
				}
		}
		public void xoa(String maSV)
		{
			for (int i = 0; i < DSSV.size(); i++) {
				if (DSSV.get(i).getMaSV().equals(maSV)==true)
					DSSV.remove(i);
			}
		}
		public void SapXepTheoDiem() {
			 try {
		            Collections.sort(DSSV, new Comparator<SinhVien>() {
		                @Override
		                public int compare(SinhVien sv1, SinhVien sv2) {
		                    if (sv1.getDiemThi() > sv2.getDiemThi()) {
		                        return -1;
		                    } else if (sv1.getDiemThi() < sv2.getDiemThi()) {
		                        return 1;
		                    } else {
		                        return 0;
		                    }
		                }
		            });
		        } catch (UnsupportedOperationException e) {
		            System.out.println("Lỗi: Sắp xếp!");
		        }
		}
	}
		
