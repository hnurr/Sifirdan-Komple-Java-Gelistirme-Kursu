
public class EsitAgirlik  extends Aday{

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }
    
    
    @Override
    public int puanhesapla()
    {
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() *1 + getEdebiyat() * 4;
        
    }    

    String puanHesapla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
