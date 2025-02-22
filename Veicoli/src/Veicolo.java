/**
 * Classe che descrive un veicolo generico con caratteristiche quali marca, modello e anno
 * @author Daniele Bonfante
 */

public class Veicolo {
    /**
     * dichiarazione variabili
     */
    private String marca; private String modello; private String anno;

    /**
     * costruttore
     * @param marca - String
     * @param modello - String
     * @param anno - String
     */

    public Veicolo(String marca, String modello, String anno){
        this.marca=marca; this.modello=modello; this.anno=anno;
    }

    /**
     * metodo getter
     * @return anno - int
     */
    public String getAnno() {
        return anno;
    }

    /**
     * metodo setter
     * @param anno - int, nuovo valore
     */
    public void setAnno(String anno) {
        this.anno = anno;
    }

    /**
     * metodo getter
     * @return marca - String
     */
    public String getMarca() {
        return marca;
    }

    /**
     * metodo setter
     * @param marca - String, nuovo valore
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * metodo getter
     * @return modello - String
     */
    public String getModello() {
        return modello;
    }

    /**
     * metodo setter
     * @param modello - String, nuovo valore
     */
    public void setModello(String modello) {
        this.modello = modello;
    }

    /**
     * metodo descrivi
     * @return tutte le variabili sotto forma di stringa
     */
    public String descrivi() {
        return "Veicolo: marca= " + marca + ", modello= " + modello + ", anno='" + anno;
    }
}
