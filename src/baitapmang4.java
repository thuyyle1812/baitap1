public class baitapmang4 {
    public static void main(String[] args) {
        // kbao mang
        int[] array = {4,5,6,7,8,9};
        //khai báo mang "min cho phần tử đầu tiên của mảng.
        int min = array[0];
        // dung vong lap for neu
        //int i bang 1
        //i be hon array.length
        //i ++
        for (int i = 1; i < array.length; i++) {
            //dung if so sanh gia tri array voi bien min
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang la: " + min);

    }
}
