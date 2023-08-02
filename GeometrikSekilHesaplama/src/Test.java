
import java.util.Scanner;


public class Test {

    private static String Ucgen1;
    private static String Daire1;

    public static void main(String[] args) {
        
        //geometrik şekil hesaplama 
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler ....\n"
                +"1-Kare Alan Hesaplama...\n"
                +"2-Üçgen Alan Hesaplama...\n"
                +"3-Daire Alan Hesaplama....\n"
                +"Çıkış : q";
        
        while(true){
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplamak istiyorsunuz...");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;
            if(sekil_turu.equals("q")){
                System.out.println("Programdan çıkılıyor..");
                break;
            }
            else if(sekil_turu.equals("1")){
                System.out.println("Karenin kenarı: ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                String Kare1 = null;
                
                sekil = new Kare(kenar, Kare1);
                
                sekil.alanhesapla();
                
            }
            else if(sekil_turu.equals("2")){
                System.out.println("Kenar 1: ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2:");
                int kenar2=scanner.nextInt();
                System.out.println("Kenar 3:");
                int kenar3=scanner.nextInt();
                
                
                sekil=new Ucgen(kenar1, kenar2, kenar3, Ucgen1);
                
                sekil.alanhesapla();
                
            }
            else if(sekil_turu.equals("3")){
                System.out.println("Yarıçap uzunluğu: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                sekil=new Daire(Daire1, yaricap);
                
                sekil.alanhesapla();
                
            }
            else{
                System.out.println("Geçersiz bir değer girdiniz...");
            }
        }
    }
    
}
