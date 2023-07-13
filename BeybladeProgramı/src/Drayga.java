
public class Drayga extends Beyblade{
    
    private String kutsalCanavar;

    public Drayga(String kutsalCanavar, String beybladeci, int donusHızı, int saldiriGucu) {
        super(beybladeci, donusHızı, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        
        System.out.println("kutsal canavar adi : "+kutsalCanavar); 
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar(); 
        
        
        
        System.out.println(getBeybladeci() + " " + kutsalCanavar +"i ortaya cikariyor...");
        System.out.println(getBeybladeci() + "in saldirisi : Kaplan Pencesi");
    }
    
    
    
    
}
