import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");

        int input = scan.nextInt();

        int n1 = 0;
        int n2 = 1;
        int toplam;

        System.out.print(input + " Sayısının Fibonacci Serisi : ");

        for(int i = 1; i <= input; i++){
            System.out.print(n1 + " , ");


            toplam = n1 + n2;
            n1 = n2;
            n2 = toplam;

        }



    }
}