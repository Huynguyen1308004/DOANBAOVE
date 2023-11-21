package Doan;
import java.util.*;
import doanhoanchinh.HocPhanDown;
import doanhoanchinh.HocPhan;
import lop.student;
public class quanlisinhvien {
	Scanner sc=new Scanner(System.in);
	public  ArrayList<Sinhvien> dssv=new ArrayList<Sinhvien>();
	public ArrayList<HocPhan> dshp=new ArrayList<HocPhan>();
	HocPhanDown obj=new HocPhanDown();
		public void nhap()
		{
			Scanner sc=new Scanner(System.in);
			for(int i=0; i<2; i++) 
			{
				System.out.print("nhap ma SV:");
				String maSV=sc.nextLine();
				System.out.print("nhap ho ten:");
				String Hoten= sc.nextLine();
				System.out.print("Nhap tuoi:");
				int tuoi=sc.nextInt();
				System.out.print("Nhap diem trung binh");
				float dtb=sc.nextFloat();
				Sinhvien sv=new Sinhvien(Hoten,tuoi,maSV,dtb);
				dssv.add(sv);
			}
		}
		public void hienthi()
		{
			for(Sinhvien sv:dssv)
			{
				System.out.println("Ma sv la:"+sv.getMaSV()+"Ho ten la:"+sv.getHoten()+sv.getDtb()+sv.getKq()+sv.getXl());
			}
		}
		public void hienthiDk()
		{
			for(Sinhvien sv:dssv)
			{	
				if(sv.getDtb()>=5)
				System.out.println("Ma sv la:"+sv.getMaSV()+"Ho ten la:"+sv.getHoten()+sv.getDtb());
			}
		}
		public void kq() {
				for(Sinhvien sv:dssv)
				{
					if(sv.getDtb()>=5) sv.setKq("dau");
					else sv.setKq("rot");
				} 
		}
		public  void xl() {
			for(Sinhvien sv:dssv)
			{
				
				if (sv.getDtb()<5) sv.setXl("yeu");
				else if(sv.getDtb()<7) sv.setXl("Tb");
				else if (sv.getDtb()<8) sv.setXl("Kha");
				else sv.setXl("Gioi");
			}
		}
		public void chen(int vt, Sinhvien obj)
		{
			dssv.add(vt, obj);
		}
		public void xoa(String maSV)
		{
			for (int i = 0; i < dshp.size(); i++) {
				if (dssv.get(i).getMaSV().equals(maSV)==true)
					dshp.remove(i);
			}
		}
		public void hienthilonnhat()
		{
			float max=0;
			for(Sinhvien sv: dssv)
			{
				if(max<sv.getDtb())max=sv.getDtb();
			}
			for(Sinhvien sv:dssv)
			{
				if(sv.getDtb()==max)
				{
					System.out.println("Ma sv la:"+sv.getMaSV()+"Ho ten la:"+sv.getHoten()+sv.getDtb());
				}
			}
		}
		public String check(String maSV)
		{
			while (true)
			{
				try {
					if(maSV.length()!=0) break;
					else {System.out.println("khong duoc null");
					System.out.print("nhap lai:");
					maSV= sc.nextLine();
					}
				}catch(Exception e) {System.out.println("ban da nhap sai(ho ten bang null");}
			}
			return(maSV);
		}
		public int check(int tuoi)
		{
			while (true)
			{
				try {
					if((tuoi>=0)&&(tuoi<150)) break;
					else {System.out.println("tuoi ko hop le");
					System.out.print("nhap lai:");
					tuoi= sc.nextInt();
					}
				}catch(Exception e) {System.err.println("ban nhap so tuoi:tuoi ko co gia tri <0");}
			}
			return(tuoi);
		}
		public String ktra(String tam)
		{
			String ktra="";
			dshp=obj.docFile("d:\\dshp1.bin");  
				for(HocPhan hp: dshp)
				{
					if(hp.getMaHp().equals(tam)==true) ktra=hp.getTenHp();
				}
				return ktra;
		}
}