
import java.util.Scanner;


public class Yolcu implements YurtDısıKuralları{
    
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

            
            
            
            public Yolcu(){
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Yatırdıgınız harç bedeli:");
                this.harc = scanner.nextInt();
                scanner.nextLine();
                
                
                
                System.out.println("Herhangi bir siyasi yasağınız bulunuyor mu ?");
                String cevap = scanner.nextLine();
                
                if(cevap == "evet"){
                    this.siyasiYasak = true;
                }
                else{
                    this.siyasiYasak = false;
                    
                
                }
                
                System.out.println("Vizeniz bulunuyor mu ? ");
                
                String cevap2 = scanner.nextLine();
                
                if(cevap2 == "evet"){
                    this.vizeDurumu = true;
                }
                else{
                    this.vizeDurumu =false;
                }
            }
    @Override
    public boolean yurtDisiHarciKontrol() {
       if(this.harc < 15){
           System.out.println("Lütfen yutdısı çıkıs harcını tam yatırınız..");
              return false;
       }
       
       else{
           System.out.println("Yurdısı harcı işlemi tamam...");
           return true;
       }
        
    }

    @Override
    public boolean siyasiYasakKontrol() {
        
        if(this.vizeDurumu == true){
            System.out.println("Siyasi yasagınız bulunuyor yurtdışına çıkamazsınız..");
            return false;
                    
        }
        else{
            System.out.println("Siyasi yasağınız bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
    
        if (vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam...");
              return true;
            
        }
        else{
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır...");
            return false;
            
        }
    }
}
