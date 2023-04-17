import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        //khai bao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tien do:");
        //khai bao gia tri int va gan gia tri vua nhap vao bien sotien
        int sotien = scanner.nextInt();
        //khai bao gia tri int va
        int sotienquydoi=23000*sotien;
        //in ra kq
        System.out.println("sotienquydoi;"+sotienquydoi);
    }
}
