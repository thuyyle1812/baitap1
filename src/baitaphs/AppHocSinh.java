package baitaphs;

public class AppHocSinh {
    public static void main(String[] args) {
        HocSinh objHS1 = new HocSinh();
        objHS1.setMaHocSinh("HS0001");
        objHS1.setMaHocSinh("HSOO1");
        objHS1.setTuoi(15);
        System.out.println("Thong tin cua doi tuong objHS1 : ");
        System.out.println("Ma HS la: " + objHS1.getMaHocSinh());
        System.out.println("Ten HS la: " + objHS1.getTenHocSinh());
        System.out.println("Tuoi la: " + objHS1.getTuoi());
        System.out.println("Gioi tinh la: " + (objHS1.isGioitinh() ? "Nam" : "Nữ"));
      HocSinh objHS2 = new HocSinh("HS0002");
        objHS2.setTenHocSinh("Phạm Thanh Mai");

        objHS2.setGioiTinh(false);
        System.out.println("Thong tin cua doi tuong objHS1 : ");
        System.out.println("Ma HS la: " + objHS2.getMaHocSinh());
        System.out.println("Ten HS la: " + objHS2.getTenHocSinh());
        System.out.println("Tuoi la: " + objHS2.getTuoi());
        System.out.println("Gioi tinh la: " + (objHS2.isGioitinh() ? "Nam" : "Nữ"));


    }
}
