import java.util.Scanner;

public class btap7phuongthuc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao 1 so");
        int number = input.nextInt();//nhap number va gán vào giá trị input
        boolean isprime = checkPrimeNumber(number);// dung boolean va bien check de trả về false hoặc true
        if (isprime) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phai la so nguyen to");
        }
    }

    public static boolean checkPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }//dung vong lap for neu, i bang 2 , i be hon hoac bang math.sqrt, i ++
     for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
  return true;// dung lai
    }
}

