package main;
import lop.student;
public class mainstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student sd1 = new student(1, "Dung", 9);
		student sd2 = new student(2, "Nhi", 8);
		student sd3 = new student();
		student sd4 = new student();
		//sd1.input(1, "Tam", 9);
		//sd2.input(2, "Thu", 8);
		sd1.display();
		sd2.display();
		sd3.display();
		sd4.display();
	}

}