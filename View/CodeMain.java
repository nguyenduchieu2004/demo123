package View;

import Controller.DienThoaiChinhHangController;
import Model.DienThoaiChinhHang;

import java.util.Scanner;

public class CodeMain {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      choosefuncion();

    }
    public static void choosefuncion() {
        do {
            System.out.println("<<<<<<---Lựa chọn chức năng--->>>>>> \n" +
                    "Chọn chức năng theo số: \n" +
                    "1-Quản lí Dien Thoai chinh Hang .\n" +
                    "2-Quản lí Dien Thoai Xach Tay .\n" +
                    "3-Kết thúc chương trình .");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    chooseDienThoaiChinhHangfuncion();
                    break;
                case 2:
//                    chooseCustomerfuncion();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng sự lựa chọn !!!!!!!!");

            }
        } while (true);
    }
    public static void chooseDienThoaiChinhHangfuncion() {
      DienThoaiChinhHangController dienThoaiChinhHangController=new DienThoaiChinhHangController();
        do {
            System.out.println("<<<<<<---Lựa chọn chức năng--->>>>>> \n"+
                    "Chọn chức năng theo số:\n"+
                    "1-Hiển thị danh sách.\n"+
                    "2-Thêm mới nhân viên.\n"+
                    "3-Xóa Nhân viên.\n"+
                    "4-Tìm kiếm nhân viên.\n"+
                    "5- Quay lại chương trình ");
            int choice =Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                   dienThoaiChinhHangController.dissPlayDienThoaiChinhHang();
                    break;
                case 2 :
                   dienThoaiChinhHangController.addNewDienThoaiChinhHang();
                    break;
                case 3 :
                 dienThoaiChinhHangController.delete();
                    break;
                case 4 :
                 dienThoaiChinhHangController.searchById();
                    break;
                case 5:
                    return  ;

            }
        }while(true);
    }

}
