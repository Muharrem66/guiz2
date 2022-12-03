import java.util.Scanner;

public class CustomerManager {
OGSYes ogsYes;
OGSYes liste[];
int i;

    public CustomerManager(){

        liste = new OGSYes[20];

        i= 1 ;

    }

    void odemeAl(OGSYes v){

        System.out.println("-----Araç Türleri----");
        System.out.println("Lütfen Geçiş Yapacğınız Araç Ücretini giriniz.");
        Scanner scanner= new Scanner(System.in);

        int price = scanner.nextInt();
        System.out.println(" Geçiş Yapacğınız Araç Ücretini giriniz."+ ogsYes.odemeAl()+ "Tl");
        System.out.println(" Geçişini Yapacağınız Araç için Ödeme: "+ ogsYes.odemeAl()+ "Tl");

        liste[i++] = v;

        v.odemeAl();

    }

}