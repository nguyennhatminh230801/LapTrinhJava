import java.util.Comparator;

public class SortPhongHocDecreaseByDienTich implements Comparator<PhongHoc> {
    @Override
    public int compare(PhongHoc o1, PhongHoc o2) {
        if(o1.getDienTich() > o2.getDienTich()){
            return 1;
        }

        return -1;
    }
}
