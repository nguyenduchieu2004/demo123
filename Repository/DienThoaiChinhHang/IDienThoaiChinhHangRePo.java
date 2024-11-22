package Repository.DienThoaiChinhHang;

import Model.DienThoaiChinhHang;

import java.util.List;

public interface IDienThoaiChinhHangRePo {
    List<DienThoaiChinhHang> findAll();
    void save(DienThoaiChinhHang dienThoaiChinhHang);
    DienThoaiChinhHang findByid(int id);
    void update(DienThoaiChinhHang dienThoaiChinhHang);
    void delete(int id);
    void search(int id);
}
