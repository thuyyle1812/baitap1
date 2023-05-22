import java.util.Scanner;

public class hinhtron {
    public static void main(String[] args) {
        // kbao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        Double radius= scanner.nextDouble() ;
        //nhap gia tri tu ban phim va gan vao bien
        String s = scanner.nextLine();
        String color = scanner.nextLine();
        //
        xaydunglophinhtron  xaydunglophinhtron = new xaydunglophinhtron(radius);
        System.out.println("dien tinh hinh tron" + xaydunglophinhtron.getArea());
        double a = xaydunglophinhtron.getArea();
        System.out.println("dien tich hinh tron la"+ xaydunglophinhtron.getArea());
        System.out.println("mau cua hinh tron la"+ xaydunglophinhtron.color(color));


    }
}
