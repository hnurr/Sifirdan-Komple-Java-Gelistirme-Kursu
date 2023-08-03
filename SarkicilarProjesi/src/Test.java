<<<<<<< HEAD

import java.util.Scanner;


public class Test {

    
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_bastir(){
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çıkış");
        
                
    }
    
    public static void sarkicilari_goruntule(){
        
        sarkicilar.sarkicilari_bastir();
        
    }
    
    public static void sarkici_ekle(){
        
        System.out.println("Ekelemk istediğiniz sarkıcının ismi :");
        
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
        
    }
    public static void sarkici_guncelle(){
        
        System.out.println("Guncellemek istediğiniz pozisyon nedir?");
        
       int pozisyon  = scanner.nextInt();
       scanner.nextLine();
       
       String yeni_isim = scanner.nextLine();
       sarkicilar.sarkici_guncelle(yeni_isim, (pozisyon-1));
       
       
               
    }
    
    public static void sarkici_sil(){
        System.out.println("Silmek istediğiniz pozisyon nedir?");
        int pozisyon = scanner.nextInt();
        
        sarkicilar.sarkici_sil(pozisyon-1);
    }
    
    public static void sarkici_ara(){
        
        System.out.println("Aramak istediğiniz sarkıcı :");
        
        String isim = scanner.nextLine();
        
        sarkicilar.sarkici_ara(isim);
        
    }
            
    public static void main(String[] args) {
        System.out.println("\t Şarkıcılar Uygulamasına Hoşgeldiniz...");
        
        islemleri_bastir();
        
        Boolean cikis =  false;
        
        int islem;
        
        while(!cikis){
            System.out.println("Bir islem seciniz :");
            
            islem = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(islem){
                
                case 0:
                    islemleri_bastir();
                    break;
                    
                case 1:
                    sarkicilari_goruntule();
                    break;
                    
                case 2:
                    sarkici_ekle();
                    break;
                    
                case 3:
                    sarkici_guncelle();
                    break;
                    
                case 4: 
                    sarkici_sil();
                    break;
                    
                case 5:
                    sarkici_ara();
                    break;
                    
                case 6:
                    cikis =  true;
                    System.out.println("uygulamadan çıkış yapılıyor...");
                    break;
                    
                
            }
            
            
            
        }
    }
    
}
=======

import java.util.Scanner;


public class Test {

    
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_bastir(){
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çıkış");
        
                
    }
    
    public static void sarkicilari_goruntule(){
        
        sarkicilar.sarkicilari_bastir();
        
    }
    
    public static void sarkici_ekle(){
        
        System.out.println("Ekelemk istediğiniz sarkıcının ismi :");
        
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
        
    }
    public static void sarkici_guncelle(){
        
        System.out.println("Guncellemek istediğiniz pozisyon nedir?");
        
       int pozisyon  = scanner.nextInt();
       scanner.nextLine();
       
       String yeni_isim = scanner.nextLine();
       sarkicilar.sarkici_guncelle(yeni_isim, (pozisyon-1));
       
       
               
    }
    
    public static void sarkici_sil(){
        System.out.println("Silmek istediğiniz pozisyon nedir?");
        int pozisyon = scanner.nextInt();
        
        sarkicilar.sarkici_sil(pozisyon-1);
    }
    
    public static void sarkici_ara(){
        
        System.out.println("Aramak istediğiniz sarkıcı :");
        
        String isim = scanner.nextLine();
        
        sarkicilar.sarkici_ara(isim);
        
    }
            
    public static void main(String[] args) {
        System.out.println("\t Şarkıcılar Uygulamasına Hoşgeldiniz...");
        
        islemleri_bastir();
        
        Boolean cikis =  false;
        
        int islem;
        
        while(!cikis){
            System.out.println("Bir islem seciniz :");
            
            islem = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(islem){
                
                case 0:
                    islemleri_bastir();
                    break;
                    
                case 1:
                    sarkicilari_goruntule();
                    break;
                    
                case 2:
                    sarkici_ekle();
                    break;
                    
                case 3:
                    sarkici_guncelle();
                    break;
                    
                case 4: 
                    sarkici_sil();
                    break;
                    
                case 5:
                    sarkici_ara();
                    break;
                    
                case 6:
                    cikis =  true;
                    System.out.println("uygulamadan çıkış yapılıyor...");
                    break;
                    
                
            }
            
            
            
        }
    }
    
}
>>>>>>> 3a53f580d2c199e6e636783b9f90026a628d215f
