/**
 * Sottoclasse che estende la generica "Auto" aggiungengo caratteristiche quali numero di porte
 * @author Daniele Bonfante
 */

public class Auto extends Veicolo{
    /**
     * dichiarazione nuove variabili
     */
    private int nPorte;

    /**
     * Costruttore
     * @param marca - String
     * @param modello - String
     * @param anno - String
     * @param nPorte - int
     */
    public Auto(String marca, String modello, String anno, int nPorte){
        super(marca,modello,anno);
        this.nPorte=nPorte;
    }

    /**
     * metodo getter
     * @return nPorte
     */
    public int getnPorte() {
        return nPorte;
    }

    /**
     * metodo setter
     * @param nPorte - nuovo valore
     */
    public void setnPorte(int nPorte) {
        this.nPorte = nPorte;
    }

    /**
     * metodo descrivi, che sovrascrive il metodo della superclasse padre
     * @return tutte le variabili sotto forma di stringa
     * @see Veicolo, descrivi();
     */
    @Override
    public String descrivi(){
        return super.descrivi() + ", nPorte= " + nPorte;
    }
}