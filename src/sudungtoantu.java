import java.util.Scanner;

public class sudungtoantu {
    public static void main(String[] args) {
        //khai bao 2 bien chieu dai va chieu cao
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        //Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        // nhap chieu rong va gan gia tri vua nhap cho bien chieu rong
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        //Nhập chiều dài va gan gia tri vua nhạp cho bien  chieu dai
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
