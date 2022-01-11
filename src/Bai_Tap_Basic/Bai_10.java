package Bai_Tap_Basic;
// error
public class Bai_10 {
    public static void main(String[] args) {

for(int i=1000000;i<=9999999 ;i++){
    if(checkPrime(i) && checkContainPrime(i) ){
        System.out.println(i);
    }
}

    }
    public static boolean checkPrime(int number){
        if(getGCD(number)==1){
            return true;
        }else return false;
    }
    public static int getGCD(int num){
        int result=0;
        for(int i=1;num>i;i++){
            if(num % i ==0 ){
                result=i;
            }
        }
        return result;
    }
 public static boolean checkContainPrime(int number){
     Integer  r;
     boolean check = true;
     while (number > 0) {
         r = number % 10;
         number = number / 10;
         if(r!=2 && r!=3 && r!=5 && r!=7){
             check = false;
         }
     }

      return check;
 }
 public static int getReverseNumber(int number){
        int reverse =0;
     while(number != 0) {
         int digit = number % 10;
         reverse = reverse * 10 + digit;
         number /= 10;
     }

     return reverse;

 }
}
