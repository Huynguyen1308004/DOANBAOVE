package DOANBAOVE;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class HocPhan {
	private int soTc;
	private String maHp;
	private String tenHp;
	private String hocky;
	private String Khoa;
	public int getSoTc() {
		return soTc;
	}
	public void setSoTc(int soTc) {
		this.soTc = soTc;
	}
	public String getMaHp() {
		return maHp;
	}
	public void setMaHp(String maHp) {
		this.maHp = maHp;
	}
	public String getTenHp() {
		return tenHp;
	}
	public void setTenHp(String tenHp) {
		this.tenHp = tenHp;
	}
	public String gethocky() {
		return hocky;
	}
	public void sethocky(String hocky) {
		hocky = hocky;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public HocPhan(int soTc, String maHp, String tenHp, String hocky, String khoa) {
		super();
		this.soTc = soTc;
		this.maHp = maHp;
		this.tenHp = tenHp;
		hocky = hocky;
		Khoa = khoa;
	}
	public HocPhan() {
		super();
	}
	public void ghiFile(ArrayList<HocPhan> HocPhanList) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream("d:\\hocphan.bin");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(HocPhanList);
            System.out.println("Làm xong rồi!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}