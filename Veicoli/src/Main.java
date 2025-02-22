/**
 * Main: consente di creare Veicoli e Auto e ottenerne le caratteristiche
 * @author Daniele Bonfante
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * dichiarazione e inizializzazione scanner
         */
        Scanner sc = new Scanner(System.in);

        /**
         * dichiarazione e inizializzazione altre variabili
         */
        boolean stato = true; int sceltaMenu;
        String marca; String modello; String anno; int nPorte;
        Veicolo [] listaV = new Veicolo [10]; Auto [] listaA = new Auto [10];
        int contV = 0; int contA = 0;

        while(stato) {
            System.out.println("-----------------------------");
            System.out.println("Benvenuto nel menu!");
            System.out.print("Quale azione eseguire (0.uscire, 1.creare Veicolo, 2.creare Auto, 3. ottieni caratteristiche Veicoli, 4.ottieni cartteristiche Auto ): ");
            sceltaMenu = sc.nextInt();
            switch (sceltaMenu) {
                case 0:
                    stato = false;
                    System.out.println("Grazie, arrivederci!");
                case 1:
                    System.out.print("Inserisci marca Veicolo: ");
                    marca = sc.next();
                    System.out.print("Inserisci modello Veicolo: ");
                    modello = sc.next();
                    System.out.print("Inserisci anno Veicolo: ");
                    anno = sc.next();
                    listaV[contV]= new Veicolo(marca, modello, anno);
                    contV++;
                    break;
                case 2:
                    System.out.print("Inserisci marca Auto: ");
                    marca = sc.next();
                    System.out.print("Inserisci modello Auto: ");
                    modello = sc.next();
                    System.out.print("Inserisci anno Auto: ");
                    anno = sc.next();
                    System.out.print("Inserisci numero porte Auto: ");
                    nPorte = sc.nextInt();
                    listaA[contA]= new Auto(marca, modello, anno, nPorte);
                    contA++;
                    break;
                case 3:
                    for(int i = 0; i< listaV.length; i++){
                        if(listaV[i]!=null){
                            System.out.println(listaV[i].descrivi());
                        }
                    }
                    break;
                case 4:
                    for(int i = 0; i< listaA.length; i++){
                        if(listaA[i]!=null){
                            System.out.println(listaA[i].descrivi());
                        }
                    }
                    break;
            }
        }
    }
}