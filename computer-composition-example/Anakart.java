/**
 *
 * @author demirezen
 */
public class Anakart {
    
    private String model;
    private String uretici;
    private int yuva;
    private String sistem;
    
    public Anakart(String model, String uretici, int yuva, String sistem){
        this.model = model;
        this.uretici = uretici;
        this.yuva = yuva;
        this.sistem = sistem;
    }

    public void isletimYukle(String isletimSistemi){
        this.sistem = isletimSistemi;
        
        System.out.println("Sistem yüklendi: " + this.sistem);
    }
    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuva() {
        return yuva;
    }

    public void setYuva(int yuva) {
        this.yuva = yuva;
    }

    public String getSistem() {
        return sistem;
    }

    public void setSistem(String sistem) {
        this.sistem = sistem;
    }
    
}
