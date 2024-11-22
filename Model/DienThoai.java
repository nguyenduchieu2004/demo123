package Model;

public class DienThoai {
    private int Id ;
    private String name ;
    private String GiaBan;
    private String SoLuong;
    private String NhaSanXuat;

    public DienThoai(int id, String name, String giaBan, String soLuong, String nhaSanXuat) {
        Id = id;
        this.name = name;
        GiaBan = giaBan;
        SoLuong = soLuong;
        NhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(String giaBan) {
        GiaBan = giaBan;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String soLuong) {
        SoLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        NhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", GiaBan='" + GiaBan + '\'' +
                ", SoLuong='" + SoLuong + '\'' +
                ", NhaSanXuat='" + NhaSanXuat + '\'' +
                '}';
    }
}
