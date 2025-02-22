public class Auto extends Veicolo{
    private int nPorte;
    public Auto(String marca, String modello, String anno, int nPorte){
        super(marca,modello,anno);
        this.nPorte=nPorte;
    }

    public int getnPorte() {
        return nPorte;
    }
    public void setnPorte(int nPorte) {
        this.nPorte = nPorte;
    }

    @Override
    public String descrivi(){
        return super.descrivi() + ", nPorte= " + nPorte;
    }
}