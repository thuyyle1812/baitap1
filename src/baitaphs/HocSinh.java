package baitaphs;

public class HocSinh {
    private String mahocsinh;
    private String tenhocsinh;
    private int tuoi;
    private boolean gioitinh;

    public String getMaHocSinh() {
        return mahocsinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.mahocsinh = maHocSinh;
    }

    public HocSinh() {
        this.mahocsinh = "HS0000";
        this.tenhocsinh = "Chưa có tên";
        this.tuoi = 0;
        this.gioitinh = true;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public HocSinh(String maHocSinh) {
        this.mahocsinh = maHocSinh;
        this.tenhocsinh = "Chưa có tên";
        this.tuoi = 0;
        this.gioitinh = true;
    }

    public String getTenHocSinh() {
        return tenhocsinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenhocsinh = tenHocSinh;
    }

    public HocSinh(String maHocSinh, String tenHocSinh) {
        this.mahocsinh = maHocSinh;
        this.tenhocsinh = tenHocSinh;
        this.tuoi = 0;
        this.gioitinh = true;
    }

    public HocSinh(String maHocSinh, String tenHocSinh, int tuoi, boolean gioiTinh) {
        this.mahocsinh = maHocSinh;
        this.tenhocsinh = tenHocSinh;
        this.tuoi = tuoi;
        this.gioitinh = gioiTinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioitinh = gioiTinh;
    }


}





