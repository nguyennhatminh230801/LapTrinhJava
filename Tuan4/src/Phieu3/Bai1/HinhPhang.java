package Phieu3.Bai1;

public abstract class HinhPhang {
    public abstract float tinhCV();
    public abstract float tinhDT();

    @Override
    public String toString() {
        return String.format("Chu vi: %10.2f\nDien Tich: %10.2f", tinhCV(), tinhDT());
    }
}
