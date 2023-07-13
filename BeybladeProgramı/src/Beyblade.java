

// bu bir yorum satırıdır. git test
public class Beyblade {
    private String beybladeci;
    private int donusHızı;
    private int saldiriGucu;

    public Beyblade(String beybladeci, int donusHızı, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHızı = donusHızı;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHızı() {
        return donusHızı;
    }

    public void setDonusHızı(int donusHızı) {
        this.donusHızı = donusHızı;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
   public void saldır(){
       
       System.out.println(getBeybladeci()+" "+ saldiriGucu +" ve " +" " + donusHızı +" "+ "ile sonlandiriliyor....");
   }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu Beyblade 'in kutsal canavari bulunmuyor.");
    
    }
    public void bilgilerigoster(){
        System.out.println("Beybladeci ismi : " +beybladeci);
        System.out.println("Saldiri gucu : " + saldiriGucu);
        System.out.println("Donus Hizi : " + donusHızı);
    }
}
