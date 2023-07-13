
public class Dragon extends  Beyblade{
    
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String kutsalCanavar, String gizliYetenek, String beybladeci, int donusHızı, int saldiriGucu) {
        super(beybladeci, donusHızı, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        
        System.out.println("Kutsal Canavar Adi: " + kutsalCanavar);
        System.out.println("Gizli Yetenek : "+ gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar(); 
        
        System.out.println(getBeybladeci() + " " +kutsalCanavar +"i ortaya cikariyor..");
        System.out.println(getBeybladeci() + "in savunmasi : Hayalet Kasirgasi" );
    }
    
    
}
