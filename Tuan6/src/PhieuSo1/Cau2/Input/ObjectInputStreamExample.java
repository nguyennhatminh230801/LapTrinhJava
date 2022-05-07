package PhieuSo1.Cau2.Input;

import PhieuSo1.Cau2.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null; //Tạo đối tượng Luồng nhập đối tượng
        try {
            //Tạo luồng nhập đối tượng từ file D:\Data.txt
            ois = new ObjectInputStream(new FileInputStream("D:\\Data.txt"));
            // đọc đối tượng từ File
            Student student = (Student) ois.readObject();
            // in đối tượng
            System.out.println(student.toString());
        } catch (ClassNotFoundException | IOException ex) {
            //Khi lỗi xảy ra sẽ hiện thông báo lỗi tại đây
            ex.printStackTrace();
        } finally {
            //Kiểm tra đối tượng đã cấp phát hay chưa
            assert ois != null;
            //Thực hiện phương thức close()
            ois.close();
        }
    }
}
