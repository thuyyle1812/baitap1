import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        // khai báo đối tượng scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam:");
        //khai bao bien nam va dong thoi nhap gia tri tu ban phim
        int year = scanner.nextInt();
        // su dung boolean
        boolean isLeap = false;
        // dung if va lay năm % 4 ==0
        if (year % 4 == 0) {
            // dung if va lay năm % 100 ==0
            if (year % 100 == 0) {
                // dung if va lay năm % 400 ==0
                if (year % 400 == 0) {
                    //neu nam nhuan thi chay vao khoi lệnh bên dưới
                    isLeap = true;

                } else {
                    //neu nam khong nhuan thi chay vao khoi lệnh bên dưới
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
        if (isLeap) {
            System.out.println(year + "la năm nhuận");

        } else {
            System.out.println(year + "khong phai là năm nhuận");
        }
    }
}
