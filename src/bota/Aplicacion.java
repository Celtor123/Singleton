package bota;

/**
 *
 * @author Celso
 */
public class Aplicacion {
     /**
     * @param args 
     */
    public static void main(String[] args) {
       Bota r=Bota.instanciar();
       Bota d=Bota.instanciar();
       r.setMarca("Nike");
       r.setNumcordon(5);
        System.out.println("Cordones:"+d.getNumcordon()+"\n Marca:"+d.getMarca());
        System.out.println("Cordones:"+r.getNumcordon()+"\n Marca:"+r.getMarca());
    }
    
    
}
