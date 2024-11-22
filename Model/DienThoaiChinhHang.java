package Model;

import java.time.LocalDate;

public class DienThoaiChinhHang extends DienThoai{
    private LocalDate ThoiGian ;
     private String phamvibaohanh;

    public DienThoaiChinhHang(int id, String name, String giaBan, String soLuong, String nhaSanXuat,LocalDate ThoiGian, String phamvibaohanh) {
        super(id, name, giaBan, soLuong, nhaSanXuat);
        this.ThoiGian = ThoiGian;
        this.phamvibaohanh = phamvibaohanh;
    }

    public LocalDate getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(LocalDate thoiGian) {
        ThoiGian = thoiGian;
    }

    public String getPhamvibaohanh() {
        return phamvibaohanh;
    }

    public void setPhamvibaohanh(String phamvibaohanh) {
        this.phamvibaohanh = phamvibaohanh;
    }
    public String convertToLine(){
        return super.getId()+","+ super.getName()+","+ super.getGiaBan()+","+super.getSoLuong()+","+super.getNhaSanXuat()+","+ThoiGian+","+phamvibaohanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang{" +
                "ThoiGian=" + ThoiGian +
                ", phamvibaohanh='" + phamvibaohanh + '\'' +
                 super.toString()+"}";
    }
}
