/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nguoi implements Serializable{
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    
    //Alt + Ins
    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        //sout + Tab
       
        System.out.println("Nhap ho ten: ");
        hoTen = scanner.nextLine(); //nhap chuoi dung nextLine()
        
        System.out.println("Nhap tuoi: ");
        tuoi = scanner.nextInt(); //nhap so nguyen dung nextInt()
    
        scanner.nextLine(); //xuống dòng
        
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
    }
    
    public void xuat(){
        //printf() format: in theo 1 dòng
        System.out.printf("%20s %10d %20s", hoTen, tuoi, gioiTinh);    
    }
}
