
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        System.out.println("YGS LYS Birinci Bulma Programı....");
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler ....\n"
                +"1. Eşit Agırlık Öğrencileri Birincisi....\n"
                +"2. Sayısal Öğrencileri Birincisi...."
                +"Çıkıs :q";
        
        
        
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");        
        
        
        while(true){
            
            
            
             //BİRİNCİ ÖĞRENCİ....
                System.out.println("Birinci ögrenci ismi :");
                String isim1=scanner.nextLine();
                System.out.println("Netler (Türkçe Matematik Edebiyat Fizik) :");
                int turkce1=scanner.nextInt();
                int matemtik1=scanner.nextInt();
                int edebiyat1=scanner.nextInt();
                int fizik1=scanner.nextInt();
                scanner.nextLine();
                
                //İKİNCİ ÖĞRENCİ...
                System.out.println("İkinci ögrenci ismi :");
                String isim2=scanner.nextLine();
                System.out.println("Netler (Türkçe Matematik Edebiyat Fizik) :");
                int turkce2=scanner.nextInt();
                int matemtik2=scanner.nextInt();
                int edebiyat2=scanner.nextInt();
                int fizik2=scanner.nextInt();
                scanner.nextLine();
                
                
                //ÜÇÜNCÜ ÖĞRENCİ...
                System.out.println("Üçüncü ögrenci ismi :");
                String isim3=scanner.nextLine();
                System.out.println("Netler (Türkçe Matematik Edebiyat Fizik) :");
                int turkce3=scanner.nextInt();
                int matemtik3=scanner.nextInt();
                int edebiyat3=scanner.nextInt();
                int fizik3=scanner.nextInt();
                scanner.nextLine();
                
            System.out.println("İşlemi Giriniz:");
            String islem =scanner.nextLine();
            
            
            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor....");
                break;
                
            }
            else if(islem.equals("1")){
                
                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, matemtik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, matemtik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, matemtik3, edebiyat3, fizik3, isim3);
               
                
                EsitAgirlik birinci = birinci(ogrenci1,ogrenci2,ogrenci3);
                
                System.out.println("Birinci Eşit Ağırlık Ögrenci : " +birinci.getIsim());
                System.out.println("Öğrencinin Puanı :" +birinci.puanHesapla());
            }
            
            else if(islem.equals("2")){
                Sayisal ogrenci1 = new Sayisal(turkce1, matemtik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2, matemtik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3, matemtik3, edebiyat3, fizik3, isim3);
               
                
                Sayisal  birinci = birinci(ogrenci1,ogrenci2,ogrenci3);
                
                System.out.println("Birinci Sayısal Ögrenci : " +birinci.getIsim());
                System.out.println("Öğrencinin Puanı :" +birinci.puanhesapla());
                        
            }
            else{
                System.out.println("Gecersiz İşlem.....");
            }
        }
        
        
        
        
        
        
        
        
    }
    
    
    public static <E extends Aday> E birinci (E e1,E e2,E e3){
        
        if(e1.puanhesapla()>e2.puanhesapla() && e1.puanhesapla() > e3.puanhesapla()){
            return e1;
        }
        else if(e2.puanhesapla()>e1.puanhesapla() && e2.puanhesapla() > e3.puanhesapla()){
            return e2;
        }
        else if(e3.puanhesapla()>e1.puanhesapla() && e3.puanhesapla() > e2.puanhesapla()){
            return e3;
        }
        else{
            return e1;
        }
    }
}
