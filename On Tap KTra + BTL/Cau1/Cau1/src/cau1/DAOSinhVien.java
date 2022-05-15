/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;


import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DAOSinhVien {
    //psfs + ấn nút Tab
    private static final String DUONG_DAN_FILE = "D:\\data.dat";
    
    //Ghi ra file
    public void writeData(ArrayList<SinhVien> dsSinhVien) throws IOException{
        ObjectOutputStream oos = null;
        
        try {
            oos = new ObjectOutputStream(new FileOutputStream(DUONG_DAN_FILE)); //khởi tạo đối tượng file
            oos.writeObject(dsSinhVien);
            System.out.println("Xuất dữ liệu thành công");
        } catch (Exception e) {
            e.printStackTrace(); //In ra lỗi nếu có
        }finally{
            if(oos != null){ //nếu đối tượng ghi file tồn tại thì đóng nó lại
                oos.close();
            }
        }
    }
    
    //Đọc file
    public ArrayList<SinhVien> readData() throws IOException{
        ObjectInputStream ois = null;
        
        try {
            ois = new ObjectInputStream(new FileInputStream(DUONG_DAN_FILE));
            ArrayList<SinhVien> dsSinhVien = (ArrayList<SinhVien>) ois.readObject();
            return dsSinhVien;
        } catch (Exception e) {
            return null;
        } finally {
            if(ois != null){
                ois.close();
            }
        }
    }
}
