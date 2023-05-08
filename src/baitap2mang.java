import java.util.Scanner;

public class baitap2mang {
    public static void main(String[] args) {
        //y tuong
        //b1:kbao mang chua danh sach sinh vien
        //b2:kbao biến lưu tên tìm kiếm và  gán với giá trị nhập vào
        //b3: Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào.
        //b4: in ra kqua
        //khai bao mang
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        //khai bao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        //khai bao bien input name kieu du lieu la string va nhan gia tri tu ban phim
        String input_name = scanner.nextLine();
        // sdung bolean de tra ve 2 yeu to true , false
        boolean isExist = false;
        // sdung for de int i bang 0 ; i be hon student.length ; i++
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
                // dung lai
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }


    }
}
