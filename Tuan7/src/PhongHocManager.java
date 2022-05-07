import java.util.ArrayList;
import java.util.Scanner;

public class PhongHocManager {
    private ArrayList<PhongHoc> phongHocList;

    public PhongHocManager() {
        phongHocList = new ArrayList<>();
        phongHocList.add(new PhongHocLyThuyet(1, "A1", 10.0, 10, false));
        phongHocList.add(new PhongHocThucNghiem(2, "A2", 20.0, 20, "Cơ khí", 1000, true));
        phongHocList.add(new PhongHocMayTinh(3, "A3", 20, 10, 10));
    }

    public PhongHocManager(ArrayList<PhongHoc> phongHocList) {
        this.phongHocList = phongHocList;
    }

    public void InsertPhongHoc(){
        int choose = 5;
        int id = phongHocList.size() > 0 ? phongHocList.size() + 1 : 1;
        while (choose != 4) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("-----------------------------------------------------");
                System.out.println("------------------QUẢN LÝ PHÒNG HỌC------------------");
                System.out.println("-----------------------------------------------------");
                System.out.println("-Chọn loại phòng học:                               -");
                System.out.println("-1. Phòng học Lý Thuyết                             -");
                System.out.println("-2. Phòng học Máy Tính                              -");
                System.out.println("-3. Phòng học Thực Nghiệm                           -");
                System.out.println("-4. Thoát                                           -");
                System.out.println("-----------------------------------------------------");
                System.out.println("-Nhập lựa chọn: ");
                choose = scanner.nextInt();

                switch (choose){
                    case 1:
                        PhongHocLyThuyet phongHocLyThuyet = new PhongHocLyThuyet();
                        phongHocLyThuyet.setMaPhong(id);
                        phongHocLyThuyet.Nhap();
                        phongHocList.add(phongHocLyThuyet);
                        break;

                    case 2:
                        PhongHocMayTinh phongHocMayTinh = new PhongHocMayTinh();
                        phongHocMayTinh.setMaPhong(id);
                        phongHocMayTinh.Nhap();
                        phongHocList.add(phongHocMayTinh);
                        break;

                    case 3:
                        PhongHocThucNghiem phongHocThucNghiem = new PhongHocThucNghiem();
                        phongHocThucNghiem.setMaPhong(id);
                        phongHocThucNghiem.Nhap();
                        phongHocList.add(phongHocThucNghiem);
                        break;

                    case 4:
                        System.out.println("Cảm ơn bạn đã sử dụng chương trình!!!!");
                        break;
                }
            } catch (Exception exception) {
                System.out.println("Yêu cầu nhập lại!!!!!!");
            }
        }
    }

    public void UpdatePhongHocByID(int ID){
        try{
            PhongHoc phongHoc = null;
            for (var itr: phongHocList) {
                if(itr.maPhong == ID){
                    phongHoc = itr;
                    break;
                }
            }

            if(phongHoc == null){
                throw new Exception(String.format("Không tồn tại phòng học có ID = %d\n", ID));
            }

            int choose2 = 10;
            System.out.println("---------------------------------------------------------");
            System.out.println("-Chọn thông tin cần sửa:                                -");
            System.out.println("-2. Dãy Nhà                                             -");
            System.out.println("-3. Diện tích                                           -");
            System.out.println("-4. Số bóng đèn                                         -");

            if(phongHoc instanceof PhongHocLyThuyet){
                System.out.println("-5. Thay đổi trạng thái Có Máy Chiếu                    -");
                System.out.println("-6. Thoát                                               -");
            }
            else if(phongHoc instanceof PhongHocMayTinh){
                System.out.println("-5. Số Lượng Máy Tính                                   -");
                System.out.println("-6. Thoát                                               -");
            }
            else {
                System.out.println("-5. Thông tin chuyên ngành                              -");
                System.out.println("-6. Sức chứa                                            -");
                System.out.println("-7. Thay đổi trạng thái có bồn rửa                      -");
                System.out.println("-8. Thoát                                               -");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("---------------------------------------------------------");
            System.out.println("-Nhập lựa chon: ");
            choose2 = scanner.nextInt();

            switch (choose2){
                case 2:
                    System.out.println("Nhập thông tin mới dãy phòng: ");
                    phongHoc.setDayNha(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Nhập thông tin mới diện tích: ");
                    phongHoc.setDienTich(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Nhập thông tin mới số bóng đèn: ");
                    phongHoc.setSoBongDen(scanner.nextInt());
                    break;
                case 5:
                    if(phongHoc instanceof PhongHocLyThuyet){
                        ((PhongHocLyThuyet) phongHoc).setCoMayChieu(!((PhongHocLyThuyet) phongHoc).isCoMayChieu());
                        System.out.println("Cập nhật thành công");
                    }
                    else if(phongHoc instanceof PhongHocMayTinh){
                        System.out.println("Nhập số lượng máy tính mới: ");
                        ((PhongHocMayTinh) phongHoc).setSoLuongMayTinh(scanner.nextInt());
                    }
                    else{
                        System.out.println("Nhập thông tin chuyên ngành mới: ");
                        ((PhongHocThucNghiem)phongHoc).setThongTinChuyenNganh(scanner.nextLine());
                    }
                    break;
                case 6:
                    if(phongHoc instanceof PhongHocThucNghiem){
                        System.out.println("Nhập số lượng sức chứa mới: ");
                        ((PhongHocThucNghiem)phongHoc).setSucChua(scanner.nextInt());
                    }else {
                        break;
                    }
                    break;
                case 7:
                    if(phongHoc instanceof PhongHocThucNghiem){
                        ((PhongHocThucNghiem)phongHoc).setCoBonRua(!((PhongHocThucNghiem) phongHoc).isCoBonRua());
                        System.out.println("Cập nhật thành công");
                    }else {
                        break;
                    }
                    break;
                case 8:
                    break;
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void DeletePhongHocByID(int ID){
        try{
            PhongHoc phongHoc = null;
            for (var itr: phongHocList) {
                if(itr.maPhong == ID){
                    phongHoc = itr;
                    break;
                }
            }

            if(phongHoc == null){
                throw new Exception(String.format("Không tồn tại phòng học có ID = %d\n", ID));
            }

            phongHocList.remove(phongHoc);
            System.out.println("Xóa thành công");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void SortPhongHocByDayNha(){
        this.phongHocList.sort(new SortPhongHocIncreseByDayNha());
        System.out.println("Sort dãy nhà thành công");
    }

    public void SortPhongHocByDienTich(){
        this.phongHocList.sort(new SortPhongHocDecreaseByDienTich());
        System.out.println("Sort diện tích thành công");
    }

    public void SortPhongHocBySoBongDen(){
        phongHocList.sort(new SortPhongHocIncreaseBySoBongDen());
        System.out.println("Sort số bóng đèn thành công");
    }

    public void InTongSoPhongHoc(){
        System.out.printf("So Phong Hoc: %d", phongHocList.size());
    }

    public void InToanBoDanhSachPhongHoc(){
        System.out.println("Danh sách toàn bộ phòng học: ");
        for (var itr1: phongHocList) {
            System.out.println();
            itr1.Xuat();
        }
    }

    public void InDanhSachPhongHocDatChuan(){
        System.out.println("Danh sách phòng học đạt chuẩn: ");
        for (var itr1: phongHocList) {
            if(itr1.phongHocDatChuan()) {
                System.out.println();
                itr1.Xuat();
            }
        }
    }
}
