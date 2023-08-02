
import java.awt.BorderLayout;


public class Test {

    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz....");
        
        String sartlar = "Yurtdışı Çıkış kuralları ....\n"
                         +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor..\n"
                         +"15 TL harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                         +"Gideceginiz ülkeye vizenizin bulunması gerekiyor...\n";
        
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor..";
        
        while(true){
            
            System.out.println("*******************************");
             System.out.println(sartlar);
            System.out.println("********************************");
           
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harc bedeli kontrol ediliyor....");
            
            Thread.sleep(3000);
           if( yolcu.yurtDisiHarciKontrol() == false){
               System.out.println(message);
               continue;
               
           }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            
            Thread.sleep(3000);
            
            if(yolcu.siyasiYasakKontrol() == false){
                System.out.println(message);
                continue;
            }
            
            System.out.println("Vize durumu kontrol ediliyor");
            Thread.sleep(3000);
            
            if(yolcu.vizeDurumuKontrol() == true){
                System.out.println(message);
                continue;
            }
            
            System.out.println("İşlemleriniz tamam yurtdışına çıkabilirsiniz...");
            break;
        }
                
        
        
        
    }
    
}
