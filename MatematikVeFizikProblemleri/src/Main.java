
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik problemleri programına hoşgeldiniz..");
        
        
        String islemler = "İşlemler ...\n"
                +"1.Dairenin Aalnını Hesaplama...\n"
                +"2.Üçgen Çevresi Hesaplama....\n"
                +"3. 2 Vektörün İç Çarpımını Hesaplama....\n"
                +"Çıkış : q...";
        
        
        while(true){
            System.out.println(islemler);
            System.out.println("İşlemi Seçiniz...");
            String islem = scanner.nextLine();
            
            
            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
                
                
            }
            else if(islem.equals("1")){
                
                System.out.println("Dairenin Yariçapi:");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                
                
                Problem.Matematik.dairealan(yaricap);
            }
            
            else if(islem.equals("2")){
                System.out.println("Kenar 1:");
                int kenar1=scanner.nextInt();
                System.out.println("Kenar 2:");
                int kenar2=scanner.nextInt();
                System.out.println("Kenar 3:");
                int kenar3=scanner.nextInt();
                
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
                        
            }
            else if(islem.equals("3")){
                 // iki tane vektör oluşturucaz..zaten vektör oluştudugumuzda vec classından i,j,k degerlerini almış olacagız..
                 
                 Vec vec1 =new Vec("Vektör1");
                 Vec vec = new Vec("Vektör2");
                 
                 Problem.Fizik.icCarpim(vec1, vec);
            }
            else{
                System.out.println("Geçersiz İşlem.....");
            }
        }
    }
    
}
