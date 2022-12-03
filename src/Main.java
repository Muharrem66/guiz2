import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        CustomerManager customerManager = new CustomerManager();


        Scanner scanner = new Scanner(System.in);
        String secenekler= "*** Lütfen Geçiş Yapılacak Araç Türünü Giriniz***\n"+
                "<Otomobil için 1'e Basın>\n"+
                "<Münibüs için 2'ye Basın>\n"+
                "<Otomobil için 3'e Basın>\n";


        System.out.println(secenekler);
        System.out.println("----İşlemi Seçiniz----");
        int secenek = Integer.parseInt(scanner.nextLine());
        if (secenek<1 || secenek >3){
            System.out.println("Lütfen Doğru Seçim Yapınız");
        }else {
            switch (secenek){
                case 1-> {
                    customerManager.ogsYes= new Otomobil();
                }
               case 2->{
                    Munibus munibus = new Munibus();
                    munibus.odemeAl();

               }
               case 3->{
                    Abtobus abtobus =new Abtobus();
                    abtobus.odemeAl();
               }
            }

        }


        Yonetim yonetim = new Yonetim();

        yonetim.raporla(customerManager);

    }


        }



