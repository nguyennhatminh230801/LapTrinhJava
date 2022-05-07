import java.util.Comparator;

public class SortPhongHocIncreaseBySoBongDen implements Comparator<PhongHoc> {
    @Override
    public int compare(PhongHoc o1, PhongHoc o2) {
        if(o1.getSoBongDen() < o2.getSoBongDen()){
            return 1;
        }
        return -1;
    }
}
