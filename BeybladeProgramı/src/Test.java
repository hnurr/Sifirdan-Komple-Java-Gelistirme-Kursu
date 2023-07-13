
import java.util.Scanner;


public class Test {

   
    public static void main(String[] args) {
       //Polymorphism kullanarak beyblade programı
       
        System.out.println("Beyblade Programina Hosgeldiniz");
        System.out.println("Cikis icin q' ya basin...");
        
        Scanner scanner = new Scanner(System.in);
       
        while(true){
            System.out.println("Hangi Beyblade 'i uretmek istiyorsunuz ? ");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çikiliyor..");
                break;
                
                
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if(beyblade == null){
                    System.out.println("Lutfen gecerli bir beyblade ismi giriniz....");
                }
                
                else{
                    beyblade.bilgilerigoster();
                    beyblade.saldır();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
    
}
