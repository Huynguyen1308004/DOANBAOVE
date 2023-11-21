package lop;

public class student {
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
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	private String name;
	private float gpa;
	//phuon thuc display
	public void display()
	{System.out.println(id+" "+name+" "+gpa);
	}
	//contructor
	public student(int id, String name, float gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	public student() {
		super();
	}
}