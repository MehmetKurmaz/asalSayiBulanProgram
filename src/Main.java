import java.util.Scanner;

public class Main {
    static int primeNumbers(){
        System.out.print("Sayi Giriniz :");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int result=0,b=0,i;
        for (i=1;i<=number;i++){
             result=number%i;
            if (result==0){
                b++;
            }
            if(i==number&&b<=2){
                System.out.println(number+" Asal Sayidir...");
            }
            if (i==number&&b>2){
                System.out.println(number+" Asal Sayi Degildir...");
            }
        }

        return primeNumbers();
    }
    public static void main(String[] args) {
     primeNumbers();
    }
}