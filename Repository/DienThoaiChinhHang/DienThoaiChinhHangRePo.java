package Repository.DienThoaiChinhHang;

import IODienThoai.IODienThoaiChinhHang;
import Model.DienThoaiChinhHang;

import java.util.ArrayList;
import java.util.List;

public class DienThoaiChinhHangRePo implements IDienThoaiChinhHangRePo{
    private static final List<DienThoaiChinhHang> dienthoaichinhhangs;
static{
    dienthoaichinhhangs = new ArrayList<DienThoaiChinhHang>();
}
    @Override
    public List<DienThoaiChinhHang> findAll() {
        return IODienThoaiChinhHang.ConvertToListDienThoaiChinhHang();
    }

    @Override
    public void save(DienThoaiChinhHang dienThoaiChinhHang) {
    IODienThoaiChinhHang.saveDienThoaiChinhHang(dienThoaiChinhHang);
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
        List<DienThoaiChinhHang> list =IODienThoaiChinhHang.ConvertToListDienThoaiChinhHang();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                break;
            }
        }
        IODienThoaiChinhHang.saveToListDienThoaiChinhHang(list);
    }

    @Override
    public void search(int id) {
        List<DienThoaiChinhHang> list = IODienThoaiChinhHang.ConvertToListDienThoaiChinhHang();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println(list.get(i));
            }
        }
        IODienThoaiChinhHang.saveToListDienThoaiChinhHang(list);
    }
}

