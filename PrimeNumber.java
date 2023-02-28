import java.util.Scanner;
public class PrimeNumber {
    public static int isItPrimeNumber(int number,int i){
        if(i==1){
            return 1;
        }
        else {
            if(number%i==0){
                return 0;
            } else{
                return isItPrimeNumber(number, i - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int prime;
        System.out.print("Sayı Giriniz: ");
        int number=scan.nextInt();
        prime=isItPrimeNumber(number,number/2);
        if (prime==1){
            System.out.println(number+" sayisi asaldir");
        }else {
            System.out.println(number+" sayisi asal değildir");
        }
    }
}
