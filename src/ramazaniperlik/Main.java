package ramazaniperlik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar Giriniz :");
        double price = input.nextDouble();

        System.out.print("Kart no giriniz :");
        String cardNumber = input.next();

        System.out.print("Son kullanma tarihi giriniz : ");
        String date = input.next();

        System.out.print("Kartın arka yüzünde bulunan CVC kodunu giriniz : ");
        String cvc = input.next();

        System.out.println("1.A Bankası");
        System.out.println("2.B Bankası");
        System.out.println("3.C Bankası");

        int selectBank = input.nextInt();
        switch (selectBank){
            case 1 -> {
                System.out.println("A bankası seçildi.");
                ABank A = new ABank("A Bankası","127.0.0.1","1234");
                A.connect("127.0.0.1");
                A.payment(cardNumber,date,cvc);
            }
            case 2 -> {
                System.out.println("B bankası seçildi.");
                BBank B = new BBank("B Bankası","127.0.0.1","1234");
                B.connect("127.0.0.1");
                B.payment(cardNumber,date,cvc);
            }
            case 3 -> {
                System.out.println("C bankası seçildi.");
                CBank C = new CBank("C Bankası","127.0.0.1","1234");
                C.connect("127.0.0.1");
                C.payment(cardNumber,date,cvc);
            }
            default-> System.out.println("Banka seçiniz.");

        }

    }
}
