
public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beyblade_turu){
        
        
        
        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Mavi Ejderha","Kutsal Canavarlarla Konusma", "Takao", 300, 800);
        
        }
            else if (beyblade_turu.equals("Dranza")) {
                    
                return new Dranza("Kai", 300, 700, "Kirmizi Anka Kusu");
                    }
    

                
         else if(beyblade_turu.equals("Drayga")){
            return new Drayga("Beyaz Kaplan", "Rei", 100, 500);
        }
         else  if(beyblade_turu.equals("Draciel")){
            return new Draciel("Kara Kaplumbaga", "Max", 400, 1000);
        }
           
           else{
               return null;
           }
    
}
}