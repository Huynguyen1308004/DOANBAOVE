package main;
import lop.ArrayListInt;
public class mainArrayListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListInt.input();
		ArrayListInt.display();
		System.out.println("Gia tri lon nhat cua day so la:"+ArrayListInt.ln());
		System.out.println("danh cac so lon hon bang 5 la:");
		ArrayListInt.displayIf();
		ArrayListInt.delete(5);
		System.out.println("danh sach sau khi xóa là :");
		ArrayListInt.display();
		ArrayListInt.sort();
		System.out.println("danh sach sau khi sắp xếp là :");
		ArrayListInt.display();
		}

}
