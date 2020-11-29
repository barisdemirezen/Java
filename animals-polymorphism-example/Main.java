/**
 *
 * @author demirezen
 */

class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus(){
        return "Hayvan Konuşuyor";
    }
    
}

    class Kedi extends Hayvan{

        public Kedi(String isim) {
            super(isim);
        }

        @Override
        public String konus() {
            return this.getIsim() + " Miyavlıyor "; //To change body of generated methods, choose Tools | Templates.
        }
                
    }

    class Kopek extends Hayvan{

        public Kopek(String isim) {
            super(isim);
        }

        @Override
        public String konus() {
            return this.getIsim() + " Havlıyor "; //To change body of generated methods, choose Tools | Templates.
        }
        
                
    }
    
    class At extends Hayvan{

        public At(String isim) {
            super(isim);
        }

        @Override
        public String konus() {
            return this.getIsim() + " Kişniyor "; //To change body of generated methods, choose Tools | Templates.
        }
    
    }
    
public class Main {

    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }

    
  public static void main(String[] args){
       
      Hayvan hayvan1 = new Kedi("Tekir");
      Hayvan hayvan2 = new Kopek("Balyoz");
      Hayvan hayvan3 = new At("Jeremy");
      
      konustur(hayvan1);
      konustur(hayvan2);
      konustur(hayvan3);
      
  }
       
    
}
