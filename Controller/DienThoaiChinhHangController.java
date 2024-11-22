package Controller;

import Model.DienThoaiChinhHang;
import Service.DienThoaiChinhHangService.DienThoaiChinhHangService;
import Service.DienThoaiChinhHangService.IDienThoaiChinhHangService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangController {
    private static final Scanner sc = new Scanner(System.in);
    private static final IDienThoaiChinhHangService idienthoaiChinhHangService = new DienThoaiChinhHangService();


    public void dissPlayDienThoaiChinhHang() {
        List<DienThoaiChinhHang> dienThoaiChinhHangs = idienthoaiChinhHangService.findAll();
        for (DienThoaiChinhHang d : dienThoaiChinhHangs) {
            System.out.println(d);
        }
    }
    public void addNewDienThoaiChinhHang() {
        System.out.println("Nhập id nhân viên:");
        int id = Integer.parseInt(sc.nextLine());
        if (idienthoaiChinhHangService.findByid(id) != null) {
            System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
            return;
        }
        System.out.println("Nhập vào tên nhân viên:");
        String name = sc.nextLine();
        System.out.println("Nhập vào gia  dien thoai :");
        String GiaBan = sc.nextLine();
        System.out.println("Nhập vào so luoong:");
        String SoLuong = sc.nextLine();
        System.out.println("Nhập vào nha san xuat:");
        String Nhasanxuat = sc.nextLine();
        System.out.println("Thoi gian bao hanh :");
        String temp = sc.nextLine();
        LocalDate ThoiGian = LocalDate.parse(temp);
        System.out.println("Pham vi bao hanh");
        String Phamvibaohanh = sc.nextLine();
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id,name, GiaBan,SoLuong,Nhasanxuat,ThoiGian,Phamvibaohanh);
       idienthoaiChinhHangService.save(dienThoaiChinhHang);
        dissPlayDienThoaiChinhHang();
    }
    public void delete() {
        System.out.println("Nhập id dienthoai cần xóa:");
        int id = Integer.parseInt(sc.nextLine());
        DienThoaiChinhHang dienThoaiChinhHang = idienthoaiChinhHangService.findByid(id);
        if (idienthoaiChinhHangService.findByid(id) != null) {
            System.out.println("bạn có chắc muốn xóa khách hàng:\n " + dienThoaiChinhHang+ "\n" +
                    "y (xóa) \n" + "n (hủy xóa)\n");
            String confirmation = sc.nextLine();
            if (confirmation.equalsIgnoreCase("y")) {
                idienthoaiChinhHangService.delete(id);
                System.out.println("khách hàng đã được xóa.");
            } else {
                System.out.println("Xóa khách hàng đã bị hủy.");
            }
        } else {
            System.out.println("Không tồn tại khách hàng có id là: " + id);
        }
    }
    public static void searchById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id khách hàng: ");
            int id = Integer.parseInt(sc.nextLine());
            DienThoaiChinhHang dienThoaiChinhHang =idienthoaiChinhHangService.findByid(id);
        if (dienThoaiChinhHang != null) {
            System.out.println("Khách hàng tìm thấy: " + dienThoaiChinhHang);
        } else {
            System.out.println("Không tồn tại id: " + id);
        }
    }
}
