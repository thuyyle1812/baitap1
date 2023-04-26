import java.util.Scanner;

public class thietkemenuchoungdung {
    public static void main(String[] args) {
        //ý tưởng:
        //b1:khai bao bien int va scanner
        //b2:hien thi thong tin
        //b3:Sử dụng cấu trúc switch…case
        //b4:in ra kq
        // khai bao bien choice de luu tru gia tri
        int choice = -1;
        // khai vao doi tuong input trong lop scanner
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            // hien thi thong tin menu
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            //su dung swithch-case
            switch (choice) {
                case 1:
                    //neu choice chay vao case 1 thi chay theo cac khoi lenh ben duoi
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    // dung lai
                    break;
                case 2:
                    //neu choice chay vao case 2 thi chay theo cac khoi lenh ben duoi
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    // dung lai
                    break;
                case 3:
                    //neu choice chay vao case 3 thi chay theo cac khoi lenh ben duoi
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    //dung lai
                    break;
                case 0:
                    System.exit(0);
                    //in ra kq
                default:
                    System.out.println("No choice!");
            }
        }
    }
}