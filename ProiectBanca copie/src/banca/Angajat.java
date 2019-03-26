package banca;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author vasua
 */

public class Angajat extends Persoana implements ServiciiAngajat{

  
    private int IdAngajat;
    private String functie;
    private int IdSucursala;

    public Angajat() {
    }

    public Angajat(int IdAngajat, String functie, int IdSucursala, long cnp, String nume, String prenume, String adresa) {
        super(cnp, nume, prenume, adresa);
        this.IdAngajat = IdAngajat;
        this.functie = functie;
        this.IdSucursala = IdSucursala;
    }
    
    
    
    public int getIdAngajat() {
        return IdAngajat;
    }

    public void setIdAngajat(int IdAngajat) {
        this.IdAngajat = IdAngajat;
    }

    public String  getFunctie() {
        return functie;
    }

    public void setFunctie(String  functie) {
        this.functie = functie;
    }

    public int getIdSucursala() {
        return IdSucursala;
    }

    public void setIdSucursala(int IdSucursala) {
        this.IdSucursala = IdSucursala;
    }
    
    public void detaliiAngajat() {
        
            detaliiPersoana();
            System.out.println("Id Angajat: "+this.IdAngajat);
            System.out.println("Functie: "+this.functie);
            System.out.println("Id sucursala: "+this.IdSucursala);
            
    }
    
    public void citesteAngajat() {
        Scanner sc=new Scanner(System.in);
        
            citestePersoana();
            System.out.println("Dati IdAngajat");
            this.IdAngajat=sc.nextInt();
            sc.nextLine();
            System.out.println("Dati Functie");
            this.functie=sc.nextLine();
    }
    
    public void afisareTot(){
        System.out.println("Angajat ");
        this.detaliiAngajat();
        
    }
    
    
    
}
