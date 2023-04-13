import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        //Khai bao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        //nhap gia tri tu
        double a = scanner.nextDouble();
         //nhap gia tri tu bam phim va gan gia tri vua nhap vao bien a
        System.out.print("b:");
        // nhap gia tri tu bam phim va gan gia tri vua nhap vao bien b
        double b = scanner.nextDouble();
        //nhap gia tri tu bam phim va gan gia tri vua nhap vao bien c
        System.out.println("c:");
        double c = scanner.nextDouble();

        //cau dk
        if (a != 0) {
            // cau dk neu a khac 0
            double answer = (c - b) / a;

            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            //
            if (b == c) {

                System.out.print("The solution is all x!");
            } else {

                System.out.print("No solution!");
            }
        }
    }
}
