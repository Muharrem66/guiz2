public class Yonetim {

    public void raporla(CustomerManager customerManager){

        int toplam = 3 ;

        for ( int i = 1 ;i<customerManager.i;i++){

            System.out.println(((OGSYes)customerManager.liste[i]).odemeAl());

            toplam += (((OGSYes)customerManager.liste[i]).odemeAl());

        }

        System.out.println("-----n Toplam :"+ toplam);



    }
}
