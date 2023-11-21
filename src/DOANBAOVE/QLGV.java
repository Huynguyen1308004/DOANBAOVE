package DOANBAOVE;
import java.util.*;
public class QLGV {
	public ArrayList<Giangvien> DSGV = new ArrayList<Giangvien>();
	Scanner sc=new Scanner(System.in);
	
	 public void Nhap() {
	  try {
          System.out.print("Nhập số lượng gv:");
          int slgv =sc.nextInt();
          sc.nextLine();
          for (int i=0;i<slgv;i++) {
              System.out.print("Nhập mã gv:");
              String MaGV= sc.nextLine();
              System.out.print("Nhập họ tên gv:");
              String HoVaTen=sc.nextLine();
              System.out.print("Nhập tuổi:");
              int tuoi=sc.nextInt();
              sc.nextLine();
              System.out.print("Nhập giới tính:");
              String gioitinh=sc.nextLine();
              System.out.print("Nhập địa chỉ:");
              String DiaChi= sc.nextLine();
              System.out.print("gv thuộc Khoa:");
              String Khoa=sc.nextLine();
              Giangvien gv=new Giangvien(MaGV,tuoi,HoVaTen,gioitinh,DiaChi,Khoa);
              DSGV.add(gv);
          }
      } catch (InputMismatchException e) {
          System.out.println("Lỗi: Nhập sai định dạng của dữ liệu! Vui lòng nhập lại.");
      }
  }
	 public void hienthi()
	 {
		 for(Giangvien gv:DSGV)
		 {
			 System.out.println("****************************** ");
			 System.out.println("Ma Sinh Vien:"+ gv.getMaGV());
			 System.out.println("Ho va ten:"+ gv.getHoTen());
			 System.out.println("Tuoi:"+gv.getTuoi());
			 System.out.println("Gioi Tinh:"+gv.getGioitinh());
			 System.out.println("Dia Chi:"+gv.getDiaChi());
			 System.out.println("Thuoc Khoa:"+gv.getKhoa());
			 System.out.println("****************************** ");
			 
			 
		 }
	 }

		public void chen(int vt, Giangvien obj)
		{
			try {
            DSGV.add(vt, obj);
				} catch (IndexOutOfBoundsException e) {
						System.out.println("Lỗi: Vị trí chèn vượt quá giới hạn!");
				}
		}
		public void xoa(String MaGV)
		{
			for (int i = 0; i < DSGV.size(); i++) {
				if (DSGV.get(i).getMaGV().equals(MaGV)==true)
					DSGV.remove(i);
			}
		}
		public void SapXepTheoTen() {
		    Collections.sort(DSGV, new Comparator<Giangvien>() {
		        @Override
		        public int compare(Giangvien gv1, Giangvien gv2) {
		            return gv1.getHoTen().compareToIgnoreCase(gv2.getHoTen());
		        }
		    });
		}
}
		