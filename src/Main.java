import java.util.Scanner;

public class Main {
    //Palindrom kontrolü için yeni metot oluşturuyoruz.
    static String palindrom(int num) {
        int temp = num, reverseNumber = 0, lastNumber;
        //Burada girilen sayının basamak kontrollerini yapıyoruz.
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10 ) + lastNumber;
            temp /= 10;
        }
        //Son olarak ise girilen sayı polindrom ise ekrana yazdırıyoruz.
        if (num == reverseNumber) {
            return num + " Palindrom sayıdır.";
        } else
            return num + " Palindrom sayı değildir.";
    }
    public static void main(String[] args) {
        //Kullanıcıdan veri girişi alıyoruz.
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int num = inp.nextInt();

        System.out.print(palindrom(num));
    }
}