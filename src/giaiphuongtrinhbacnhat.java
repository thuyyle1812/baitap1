import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        //Khai bao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        //nhap gia tri tu bam phim va gan gia tri vua nhap vao bien a
        double a = scanner.nextDouble();
        System.out.print("b:");
        // nhap gia tri tu bam phim va gan gia tri vua nhap vao bien b
        double b = scanner.nextDouble();
        //nhap gia tri tu bam phim va gan gia tri vua nhap vao bien c
        System.out.println("c:");
        double c = scanner.nextDouble();
        //cau dk
        if (a != 0) {
            // truong hop a khac 0 thi phuong trinh co 1 nghiem
            double answer = (c - b) / a;

            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            //truong hop b bang c thi phuog trinh vo so nghiem
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
            //truong hop b khac c thi phuog trinh vo nghiem
                System.out.print("No solution!");
            }
        }
    }
}
