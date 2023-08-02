
import java.util.ArrayList;
import java.util.Iterator;


public class Kumanda  implements Iterable<String>{
    
    private ArrayList<String> kanallar = new ArrayList<String>();
    
    public class KumandaIterator implements Iterable<String>{


        }
        
        
    }
    
    public void kanalEkle(String kanal){
        kanallar.add(kanal);
        
                
    }
    public void kanalSil(String kanal){
        kanallar.remove(kanal);
    }
    public int kanalSayisi(){
        return kanallar.size();
    }

    @Override
    public Iterator<String> iterator() {
       
    }
}
