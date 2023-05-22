import java.util.Scanner;

public class chunhat {
    public static void main(String[] args) {
        // kbao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        // kbao doi tuong double va gan vao gia tri
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        hinhchunhat hinhchunhat = new hinhchunhat (width, height);
        // in ra kq
        System.out.println("Your Rectangle \n" + hinhchunhat .display());
        System.out.println("Perimeter of the Rectangle: " + hinhchunhat .getPerimeter());
        System.out.println("Area of the Rectangle: " + hinhchunhat .getArea());
    }
}
