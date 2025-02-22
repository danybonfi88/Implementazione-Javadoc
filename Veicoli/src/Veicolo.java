public class Veicolo {
    private String marca, modello, anno;

    public Veicolo(String marca, String modello, String anno){
        this.marca=marca; this.modello=modello; this.anno=anno;
    }

    public String getAnno() {
        return anno;
    }
    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }

    public String descrivi() {
        return "Veicolo: marca= " + marca + ", modello= " + modello + ", anno='" + anno;
    }
}
