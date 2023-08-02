
import java.util.PriorityQueue;
import java.util.Queue;


public class Test {

    
    public static void main(String[] args) {
        
        //Hastalar Acil Serviste şikayetlerine göre kuyrukta en önlere geçecek (PRİORİTYQUEUE)..
        
        //Apandisit ---------> En yüksek öncelik
        //Yanık-------------->Orta öncelik
        //Bas Agrısı--------->En düşük öncelik
        
        
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        
        
        
        acilservis.offer(new Hasta("Murat Bey","Yanık"));
        acilservis.offer(new Hasta("Okan Bey","Baş Ağrısı"));
        acilservis.offer(new Hasta("Elif Hanım","Apandisit"));
        acilservis.offer(new Hasta("Oğuz Bey","Yanık"));
        acilservis.offer(new Hasta("Merve Hanım","Yanık"));
        acilservis.offer(new Hasta("Gizem Hanım","Apandisit"));
        
        int i = 1;
        
        while(acilservis.isEmpty() != true){
            
            System.out.println("*********************");
            System.out.println(i + " .sırada ");
            System.out.println(acilservis.poll());
            System.out.println("**********************");
            i++;
        }
    }
    
}
