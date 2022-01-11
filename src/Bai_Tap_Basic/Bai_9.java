package Bai_Tap_Basic;

public class Bai_9 {
    public static void main(String[] args) {
        for(int i=1000000;i<999999999;i++){
            if(validateIncludeNumber(0,6,8,i) && checkReversibleNumber(i)&& checkTotalDivideTen(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean validateIncludeNumber(int a,int b,int c,int number){
        Integer  r;
        boolean check = true;
        while (number > 0) {
            r = number % 10;
            number = number / 10;
            if(r!=a & r!=b && r!=c){
                check = false;
            }
        }
        return check;
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
    public static boolean checkTotalDivideTen(int number){
        if (getSum(number)%10==0){
            return true;
        }else return false;
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
}
