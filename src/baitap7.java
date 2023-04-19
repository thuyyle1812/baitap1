import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        //khai bao doi tuong scanner de lay gia tri nhap vao tu ban phim
        Scanner scanner = new Scanner(System.in);

        while (1>0){

            System.out.println("nhap so can doc(0-10):");
            //nhap gia tri bien tu ban phim va gan gia tri cho bien co kieu du lieu la int
            int input= scanner.nextInt();

            switch (input){
                case 1 :
                    //neu input chay vao case 1 thi chay theo khoi lenh ben duoi
                    System.out.println("one");
                    //dung lại
                    break;
                case 2:
                    //neu input chay vao case 2 thi chay theo khoi lenh ben duoi
                    System.out.println("two");
                    break;
                case 3:
                    //neu input chay vao case 3 thi chay theo khoi lenh ben duoi
                    System.out.println("three");
                    break;
                case 4:
                    //neu input chay vao case 4 thi chay theo khoi lenh ben duoi
                    System.out.println("for");
                    break;
                case 5:
                    //neu input chay vao case 5 chay theo khoi lenh ben duoi
                    System.out.println("five");
                    break;
                case 6:
                    //neu input chay vao case 6 thi chay theo khoi lenh ben duoi
                    System.out.println("six");
                    break;
                case 7:
                    //neu input chay vao case 7 thi chay theo khoi lenh ben duoi
                    System.out.println("seven");
                    break;
                case 8:
                    //neu input chay vao case 8 thi chay theo khoi lenh ben duoi
                    System.out.println("eight");
                    break;
                case 9:
                    //neu input chay vao case 9 thi chay theo khoi lenh ben duoi
                    System.out.println("nine");
                    break;
                case 10:
                    //neu input chay vao case 10 thi chay theo khoi lenh ben duoi
                    System.out.println("ten");
                    break;
                case 0:
                    //neu input chay vao case 0 thi chay theo khoi lenh ben duoi
                    System.out.println("zero");
                    break;
            }

        }

    }
}