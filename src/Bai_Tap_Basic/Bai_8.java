package Bai_Tap_Basic;

public class Bai_8 {

    public static void main(String[] args) {
        System.out.println("A");
        for(int i=100000;i<=999999;i++){
            if(checkReversibleNumber(i)){
                System.out.println(i);
            }
        }
        System.out.println("B");
        for(int i=100000;i<=999999;i++){
            if(checkReversibleNumber(i) && checkTotalDivideTen(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkReversibleNumber(int n) {
        String numberStr = String.valueOf(n);
        int size = numberStr.length();
        for (int i = 0; i < (size/2); i++) {
            if (numberStr.charAt(i) != numberStr.charAt(size - i -1)) {
                return false;
            }
        }
        return true;
    }
    public static int getSum(int a){
        Integer sum=0, r;
        while (a > 0) {
            r = a % 10;
            a = a / 10;
            sum += r;
        }
        return sum;
    }
    public static boolean checkTotalDivideTen(int number){
        if (getSum(number)%10==0){
            return true;
        }else return false;
    }
}
