package Doan;
import java.util.*;
public class MainDiemThi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student st=new Student("anh",9);
		studentList.add(st);
		Student std=new Student("be",4);
		studentList.add(std);
		StudentDown ob=new StudentDown();
		ob.ghiDiemThi(studentList);
		ManagerStudent obj = new ManagerStudent();
		obj.docfile();
		obj.hienthi();
		obj.hienthisvlonhon5();
		obj.ln();
		obj.dauvarot();
		obj.hienthi();
		System.out.println("Nhap ho ten can chen: ");
		String ht=sc. nextLine();
		System.out.println("Nhap diem can chen: ");
		float diem=sc.nextFloat();
		Student sd=new Student(ht,diem);
		System.out.println("Nhap vi tri can chen: ");
		int vt=sc.nextInt();
		obj.chen(sd,vt);
		obj.hienthi();
		ht=sc.nextLine();
		System.out.println("Nhap ho ten can xoa: ");
		String hten=sc.nextLine();
		obj.xoa(hten);
		obj.hienthi();	
	}

}