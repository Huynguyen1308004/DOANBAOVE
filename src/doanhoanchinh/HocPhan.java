package doanhoanchinh;
import java.io.Serializable;
public class HocPhan implements Serializable {
	private String MaHp;
	public String getMaHp() {
		return MaHp;
	}
	public void setMaHp(String maHp) {
		MaHp = maHp;
	}
	public String getTenHp() {
		return TenHp;
	}
	public void setTenHp(String tenHp) {
		TenHp = tenHp;
	}
	public int getSoTc() {
		return SoTc;
	}
	public void setSoTc(int soTc) {
		SoTc = soTc;
	}
	public int getHk() {
		return hk;
	}
	public void setHk(int hk) {
		this.hk = hk;
	}
	private String TenHp;
	private int SoTc;
	private int hk;
	public HocPhan(String maHp, String tenHp, int soTc, int hk) {
		super();
		MaHp = maHp;
		TenHp = tenHp;
		SoTc = soTc;
		this.hk = hk;
	}
	public HocPhan() {
		super();
	}
}
	