import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        //khai bao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        //khai bao bien thang, ngay
        int thang;
        int ngay = 30;
        // nhap gia tri cho bien thang
        System.out.println("Nhap thang:");
        thang = scanner.nextInt();
        //dung if đe kiem tra cac thang co ngay 31
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            ngay = 31;
        }
        //dung if de kiem tra thang 2 co 28 ngay
        if (thang == 2) {
            ngay = 28;
        }
        // in ra kq
        System.out.println("thang" + thang + "co" + ngay + "ngay");
    }
}
