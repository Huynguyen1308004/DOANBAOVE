package main;
import java.util.*;
import lop.ArrayListStudent;
public class mainArrayListStudent {

	public int n;
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayListStudent.nhap();
		ArrayListStudent.kq();
		ArrayListStudent.hienthi();
		System.out.println("diem trung binh lon nhat la :" +ArrayListStudent.ln());
		ArrayListStudent.chen();
		System.out.println("ket qua sau khi chen la :");
		ArrayListStudent.hienthi();
		System.out.println("nhap ho ten can xoa");
		String ht=sc.nextLine();
		ArrayListStudent.xoa(ht);
		System.out.println("ket qua sau khi xoa la:");
		ArrayListStudent.hienthi();
		ArrayListStudent.sort();
		System.out.println("sau khi sx la");
		ArrayListStudent.hienthi();
		System.out.println("nhap thong tin can sua doi:");
		int id=sc.nextInt();
		sc.nextInt();
		String name=sc.nextLine();
		float gpa=sc.nextFloat();
		ArrayListStudent.sua(id, name, gpa);
		System.out.print("sau khi sua la:");
		ArrayListStudent.hienthi();
	}

}
