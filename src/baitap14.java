public class baitap14 {
    public static void main(String[] args) {

        System.out.println("day so nguyen to co trong mang 100 phan tu la:");
        //  dung vong lap for de in ra phan tu neu
        // int i bang 0
        //i be hon 100
        // i ++
        for (int i = 0; i < 100; i++) {
            // dung check de check ra kq
            if (Check(i)) {
                System.out.println(i + "");
            }
        }
    }

    public static boolean Check(int num) {//goi ham su dung de kiem tra 100 phan tu
        // neu gtri phan tu nho hon 2 thi bo qua
        if (num < 2) {
            return false;
        }
        // dung vong lap neu
        // int i bang 2
        // i be hon math.sqrt
        for (int i = 2; i < Math.sqrt(num); i++) {
            // neu phan tu chia het cho i thi bo qua
            if (num % i == 0) {
                // neu khong thi kq la so nguyen to
                return false;
            }
        }
        return true;
    }
}
