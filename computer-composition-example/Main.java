/**
 *
 * @author demirezen
 */
public class Main {
        
  public static void main(String[] args){
       
    Resolution resolution = new Resolution(1920, 1080);
  
    Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);

    Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");

    Anakart anakart = new Anakart("GSX197", "ASUS", 10, "Windows 10");

    Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
    
    pc.getKasa().bilgisayariAc();
    pc.getMonitor().monitoruKapat();
    pc.getAnakart().isletimYukle("Ubuntu 14.8");
  }
       
    
}
