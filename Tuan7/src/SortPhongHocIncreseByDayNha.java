import java.util.Comparator;

public class SortPhongHocIncreseByDayNha implements Comparator<PhongHoc> {
    @Override
    public int compare(PhongHoc o1, PhongHoc o2) {
        return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
    }
}
