package doanhoanchinh;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocPhan {
	public ArrayList<HocPhan> dshp=new ArrayList<HocPhan>();
	HocPhanDown obj=new HocPhanDown();
	public void KhoiTao()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println("nhap ma hp:");
			String maHp=sc.nextLine();
			sc.nextLine();
			System.out.print("Nhap ten hp");
			String tenHp=sc.nextLine();
			System.out.print("nhap so tin chi");
			int soTc =sc.nextInt();
			System.out.print("nhap hoc ky:");
			int hk =sc.nextInt();
			sc.nextLine();
			HocPhan hp=new HocPhan(maHp,tenHp,soTc,hk);
			dshp.add(hp);
		}
		obj.ghiFile(dshp);
	}
	public void docFile()
	{
		dshp=obj.docFile("d:\\dshp1.bin");
	}
	public void hienthi()
	{
		for(HocPhan hp:dshp)
		{
			System.out.println("Ma hp la: " +hp.getMaHp()+"ten hp la : "+hp.getTenHp()+"so Tc: "+hp.getSoTc()+"hoc ky:"+hp.getHk());
		}
	}
	public void hienthihk(int hk)
	{
		for(HocPhan hp:dshp)
		{
			if(hp.getHk()==4)
			System.out.println("Ma hp la: " +hp.getMaHp()+"ten hp la : "+hp.getTenHp()+"so Tc: "+hp.getSoTc()+"hoc ky:"+hp.getHk());
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
	
}
