
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {

    
    public static void main(String[] args) {
        
        //FıleOutPutStream classından bir tane referans oluşturmak istiyorum.....
        //başta null olarak başlatıcam...
        FileOutputStream fos = null;
        
        File  file = new File("dosya.txt");
        file = new File("dosya.txt");
        try {
            fos = new FileOutputStream("dosya.txt");//burada file classından bir tane referansımı gönderiyorum...
            
            fos.write(65);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Nor Found exception oluştu...");
        } catch (IOException ex) {
            System.out.println("dosyaya yazılırken bir hata oluştu....");
        }
        
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("dosya kapatılırken bir hata oluştu......");
            }
        }
        
    }
    
}
