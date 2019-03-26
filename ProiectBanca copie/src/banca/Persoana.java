/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.util.Scanner;

/**
 *
 * @author vasua
 */
public class Persoana implements ServiciiPersoana{
    private long cnp;
    private String  nume;
    private String  prenume;
    private String  adresa;

    public Persoana() {
    }
    
    

    public Persoana(long  cnp, String  nume, String  prenume, String  adresa) {
        this.cnp = cnp;
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }
    
    

    public long  getCnp() {
        return cnp;
    }

    public void setCnp(long  cnp) {
        this.cnp = cnp;
    }

    public String  getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String  getPrenume() {
        return prenume;
    }

    public void setPrenume(String  prenume) {
        this.prenume = prenume;
    }

    public String  getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
public void citestePersoana() {
    Scanner sc=new Scanner(System.in);

        System.out.println("Dati CNP");
        this.cnp=sc.nextLong();
        sc.nextLine();
        System.out.println("Dati Nume");
        this.nume=sc.nextLine();
        System.out.println("Dati Prenume");
        this.prenume=sc.nextLine();
        System.out.println("Dati Adresa");
        this.adresa=sc.nextLine();
}

public void detaliiPersoana() {
    
        System.out.println("CNP: "+this.cnp);
        System.out.println("Nume: "+this.nume);
        System.out.println("Prenume: "+this.prenume);
        System.out.println("Adresa: "+this.adresa);
}
    
}
