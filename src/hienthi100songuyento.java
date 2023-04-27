public class hienthi100songuyento{
    public static void main(String[] args) {
        //y tuong:
        //b1: Khai báo biến số nguyên,bien count, N
        //b2: dung while va dung boolean kiem tra xem co phai so nguyen to khong
        //b3:dung for de ktra dieu kien
        //b4:dung vong lap for va dung cau truc dk
        // khai bao int
        int numbers =100;
        int count = 0;
        int N = 2;
        System.out.println("20 so nguyen to dau tien la:");
        // dung while khi count < numbers thì:
        while (count < numbers) {
            // dung boolean kiểm tra xem n có phải là số nguyên tố không.
            boolean isPrime = true;
            //dung for neu
            //int i bang 2
            //i be hon hoac bang math.sqrt
            //i ++
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false; // không phải số nguyên tố
                    //dung lai
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N);
                //gia tri cua count tang len 1
                count++;
            }
            // Giá trị của N tăng lên 1
            N++;
        }
    }
}


