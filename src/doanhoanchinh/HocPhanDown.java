package doanhoanchinh;
import java.io.*;
import java.util.*;
public class HocPhanDown {
	public void ghiFile(ArrayList<HocPhan> studentList) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {

 

            fout = new FileOutputStream("d:\\thi1.bin");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(studentList);

 

            System.out.println("Xong rồi!");
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
	public ArrayList<HocPhan> docFile(String filename) {

		 

        ArrayList<HocPhan> HocPhanList = new ArrayList<>();

 

        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try {
            fin = new FileInputStream(filename);
            ois = new ObjectInputStream(fin);
            HocPhanList = (ArrayList<HocPhan>) ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

 

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

 

        }
        return HocPhanList;
    }
}