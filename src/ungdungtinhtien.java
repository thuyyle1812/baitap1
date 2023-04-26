import java.util.Scanner;

public class ungdungtinhtien {
    public static void main(String[] args) {
        // Y tưởng :
        // b1: khai báo 3 biến về tiền gửi, tháng gửi, tỉ lệ lãi suất
        // b2: Tạo đối tượng input thuộc đối tượng scanner
        // b3: Nhập giá tri cho biến
        // b4: tính lãi suát nhận đc
        // b5: in ra kq
        //khai báo biến double và biến int
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        // khai bao đối tượng scanner
        Scanner input = new Scanner(System.in);
        // nhap so tiền gửi
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        // nhập số tháng gửi
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        //nhập lãi suất
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        // Tính lãi suất nhận được
        double totalInterest = 0;

        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        // in ra kq
        System.out.println("Total of interest: " + totalInterest);
    }
}
