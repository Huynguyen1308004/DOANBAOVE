package DOANBAOVE;
import java.util.*;
public class QuanLiHocPhan {
	public ArrayList<HocPhan> dshp=new ArrayList<HocPhan>();
	FileHP obj=new FileHP();
	Scanner sc=new Scanner(System.in);
	public void NhapHocPhan()
	{
		 try {
	            System.out.println("Nhập số lượng HP: ");
	            int slhp = sc.nextInt();
	            sc.nextLine();
	            for (int i = 0; i < slhp; i++) {
	                System.out.println("Nhập mã HP: ");
	                String maHp = sc.nextLine();
	                System.out.println("Nhập tên HP: ");
	                String tenHp = sc.nextLine();
	                System.out.println("Nhập STC: ");
	                int soTc = sc.nextInt();
	                sc.nextLine();
	                System.out.println("Nhập học kỳ của HP: ");
	                String hocky = sc.nextLine();
	                System.out.println("HP cuar Khoa: ");
	                String khoa = sc.nextLine();
	                HocPhan hp = new HocPhan(soTc, maHp, tenHp, hocky, khoa);
	                dshp.add(hp);
	            }
	            obj.ghiFile(dshp);
	            System.out.println("Đã hoàn thành phần nhập File");
	        } catch (Exception e) {
	            System.out.println("HP của bạn bị lỗi! ");
	        }
	    }
	public void docFile() 
	{
		dshp= obj.docFile(":\\hocphan.bin");
	}
	public void HienThi()
	{
		for(HocPhan hp:dshp)
		{
			System.out.println("Mã HP:"+hp.getMaHp());
			System.out.println("Tên HP:"+hp.getTenHp());
			System.out.println("STC:"+hp.getSoTc());
			System.out.println("Học kỳ của HP"+hp.gethocky());
			System.out.println("Khoa:"+hp.getKhoa());
			
		}
	}
	public void chen(HocPhan obj, int vt) {
		dshp.add(vt, obj);
		
	}

	public void xoa(String tenHp) {
		for (int i = 0; i < dshp.size(); i++) {
			if (dshp.get(i).getTenHp().equals(tenHp) == true)
				dshp.remove(i);
		}
	}
	public void SapXepTheoTenhocky() {
	    Collections.sort(dshp, new Comparator<HocPhan>() {
	        @Override
	        public int compare(HocPhan hp1, HocPhan hp2) {
	            return hp1.gethocky().compareToIgnoreCase(hp2.gethocky());
	        }
	    });
	}
}

