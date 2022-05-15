package Bai1;

import java.io.*;
import java.util.ArrayList;

public class SinhVienDAO {
    public static final String DATA_SAVE_PATH = "D:\\data.dat";

    public void writeData(ArrayList<SinhVien> sinhViens) throws IOException {
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(DATA_SAVE_PATH));
            objectOutputStream.writeObject(sinhViens);
            System.out.println("Lưu dữ liệu thành công");
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            assert objectOutputStream != null;
            objectOutputStream.close();
        }
    }

    public ArrayList<SinhVien> readData() throws IOException {
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(DATA_SAVE_PATH));
            return (ArrayList<SinhVien>) objectInputStream.readObject();

        }catch (Exception exception){
            exception.printStackTrace();
            return null;
        }
        finally {
            assert objectInputStream != null;
            objectInputStream.close();
        }
    }
}
