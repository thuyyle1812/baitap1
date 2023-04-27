import java.util.Scanner;

public class baitap12 {
        public static void main(String[] args) {
            //y tuong :
            //b1: khai bao doi tuong scanner
            //b2:khai bao 2 bien int va gan gia tri vao bien
            //b3:dung vong lap
            //b4: in ra kq
            // khai bao doi tuong scanner
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào số hàng của ban co:");
            // khai bao bien int va gan vao gia tri bien n
            int n = scanner.nextInt();
            //khai bao bien int va gan vao gia tri bien m
            System.out.println("Nhập vào số cột của ban co:");
            int m = scanner.nextInt();
            // dung vong lap neu
            // int 1 bang 1;
            //i be hon hoac bang n
            // i cong cong
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


