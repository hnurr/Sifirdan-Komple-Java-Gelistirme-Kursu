
public class Kare extends Sekil {
    private int kenar;

    public Kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    @Override
    void alanhesapla() {
        int alan = (kenar * kenar);
        System.out.println(getIsim() + "in alanı: " +alan);
    }

   
    
    
}
