package Service.DienThoaiChinhHangService;

import Model.DienThoaiChinhHang;
import Repository.DienThoaiChinhHang.DienThoaiChinhHangRePo;
import Repository.DienThoaiChinhHang.IDienThoaiChinhHangRePo;

import java.util.List;

public class DienThoaiChinhHangService implements  IDienThoaiChinhHangService{

    private final IDienThoaiChinhHangRePo iDienThoaiChinhHangRePo = new DienThoaiChinhHangRePo();
    @Override
    public List<DienThoaiChinhHang> findAll() {
        return iDienThoaiChinhHangRePo.findAll();
    }

    @Override
    public void save(DienThoaiChinhHang dienThoaiChinhHang) {
    iDienThoaiChinhHangRePo.save(dienThoaiChinhHang);
    }

    @Override
    public DienThoaiChinhHang findByid(int id) {
        return null;
    }

    @Override
    public void update(DienThoaiChinhHang dienThoaiChinhHang) {

    }

    @Override
    public void delete(int id) {
        iDienThoaiChinhHangRePo.delete(id);
    }

    @Override
    public void search(int id) {
    iDienThoaiChinhHangRePo.search(id);
    }
}
