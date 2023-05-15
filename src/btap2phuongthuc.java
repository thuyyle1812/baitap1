public class btap2phuongthuc {
        public static void main(String[] args) {
            // kbao int
            int num = 20;
            // dung if de ktra so chan so le
            if(isEven(num)){
                System.out.println(num + " là số chẵn");
            } else {
                System.out.println(num + " là số lẻ");
            }
        }
         //dung kdl boolean de ktra xem tra ve true hoac false
        public static boolean isEven(int n) {
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

