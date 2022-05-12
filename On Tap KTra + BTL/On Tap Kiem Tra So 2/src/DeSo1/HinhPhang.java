package DeSo1;

import java.util.ArrayList;

public abstract class HinhPhang {
    protected String maHinh;
    protected String tenHinh;
    protected ArrayList<Double> dsCanh = new ArrayList<>();

    public HinhPhang() {
    }

    public HinhPhang(String maHinh, String tenHinh, ArrayList<Double> dsCanh) {
        this.maHinh = maHinh;
        this.tenHinh = tenHinh;
        this.dsCanh = dsCanh;
    }

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public ArrayList<Double> getDsCanh() {
        return dsCanh;
    }

    public void setDsCanh(ArrayList<Double> dsCanh) {
        this.dsCanh = dsCanh;
    }

    public double tinhCV() {
        double answer = 0;
        for (var canh: dsCanh) {
            answer += canh;
        }
        return answer;
    }

    public abstract double tinhDT();

    public abstract void nhapDL();

    @Override
    public String toString() {
        return "Chu vi: " + tinhCV() + "\nDien Tich: " + tinhDT();
    }
}
