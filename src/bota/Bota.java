
package bota;

/**
 * Clase creada con el patron de diseño Singleton
 * @author Celso
 */
public class Bota {
private static Bota bota;
private int numcordon;
private String marca;
    private Bota() {
    }
    public static Bota instanciar(){
       if(bota==null){
           bota=new Bota();
         
       } return bota;
    }

    public int getNumcordon() {
        return numcordon;
    }

    public void setNumcordon(int numcordon) {
        this.numcordon = numcordon;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   

  
    
}
