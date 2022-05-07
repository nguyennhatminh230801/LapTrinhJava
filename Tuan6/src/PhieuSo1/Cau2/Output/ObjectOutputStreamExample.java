package PhieuSo1.Cau2.Output;

import PhieuSo1.Cau2.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null; //Tạo đối tượng Luồng xuất đối tượng
        try {
            //Tạo luồng xuất đối tượng ra file D:\Data.txt
            oos = new ObjectOutputStream(new FileOutputStream("D:\\Data.txt"));
            // tạo 1 đối tượng Student
            Student student = new Student(1, "Tran Hao Phong", "Ha Noi", 17);
            // xuất đối tượng ra file
            oos.writeObject(student);
            //Thông báo thành công
            System.out.println("Success...");
        } catch (IOException ex) {
            //Khi lỗi nhập xuất xảy ra sẽ hiện thông báo lỗi tại đây
            ex.printStackTrace();
        } finally {
            //Kiểm tra đối tượng đã cấp phát hay chưa
            assert oos != null;
            //Thực hiện phương thức close()
            oos.close();
        }
    }
}
