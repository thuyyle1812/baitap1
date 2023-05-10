import java.util.Scanner;

public class daonguoccacphantu {
    public static void main(String[] args) {
        // kbao mang
        int size;
        int[] array;
        // kbao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            // nhap bien size va gan gia tri vua nhap vao bam phim
            size = scanner.nextInt();
            // dung if neu size hon hon 20
            if (size > 20)
                System.out.println("Size does not exceed 20");
            // dung while neu size lon hon 20
        } while (size > 20);
        //  khai báo và khởi tạo một biến số nguyên `size` cho phần tử đầu tiên của mảng.
        array = new int[size];
        int i = 0;
        // dung while neu i be hon hoac bang aray.length
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

