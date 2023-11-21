package Doan;
import java.io.Serializable;
public class Student implements Serializable {

	//private static final long serialVerSionUID = 1L;
	
		private String hoTen;
		public Student(String hoTen) {
		super();
		this.hoTen = hoTen;
	}

		private float  diemTrungBinh;
		private String kq,xl;
		
		public String getKq() {
			return kq;
		}

		public void setKq(String kq) {
			this.kq = kq;
		}

		public String getXl() {
			return xl;
		}

		public void setXl(String xl) {
			this.xl = xl;
		}

		public Student() {
		}
		 
		public Student(String hoTen, float diemTrungBinh) {
			this.hoTen = hoTen;
			this.diemTrungBinh = diemTrungBinh;
		}
		public String getHoTen() {
			return hoTen;
		}

		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}

		public float getDiemTrungBinh() {
			return diemTrungBinh;
		}

		public void setDiemTrungBinh(float diemTrungBinh) {
			this.diemTrungBinh = diemTrungBinh;
		}
}
