
public class Dranza extends Beyblade{
    
    private String kutsalCanavar;
    
    public Dranza(String beybladeci,int donusHizi,int saldiriciGucu,String kutsalCanavar){
        super(beybladeci, donusHizi, saldiriciGucu);
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
        
        System.out.println(getBeybladeci() + " " +kutsalCanavar + "i ortaya cikariyor....");
        System.out.println(getBeybladeci() + "in saldirisi : Alev Kilici");
                
    }
    
}
