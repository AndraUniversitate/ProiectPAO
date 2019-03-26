/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;


import java.util.Scanner;
import java.util.Vector;
import java.util.*;


/**
 *
 * @author vasua
 */
public class Sucursala implements ServiciiSucursala{
    
    public static final int NR_MAX_ANGAJATI=10;
    public static final int NR_MAX_CLIENTI=10;
    
 
    private int idSucursala;
    private String denumire;
    private String locatie;
    private int nr_clienti=0;
    private int nr_angajati=0;
    
    private HashSet <Angajat> set_angajati;
    private Vector <Client> vector_clienti;
    
    

    public Sucursala() {
        this.set_angajati=new HashSet<Angajat>();
        this.vector_clienti=new Vector <Client>();
    }

    public Sucursala(int idSucursala, String denumire, String locatie) {
        
        this.set_angajati=new HashSet<Angajat>();
        this.vector_clienti=new Vector <Client>();
        
        this.idSucursala = idSucursala;
        this.denumire = denumire;
        this.locatie = locatie;
    }

    public int getIdSucursala() {
        return idSucursala;
    }

    public void setIdSucursala(int idSucursala) {
        this.idSucursala = idSucursala;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
    
    public void citesteSucursala() {
    Scanner sc=new Scanner(System.in);

        System.out.println("Dati id sucursala");
        this.idSucursala=sc.nextInt();
        sc.nextLine();
        System.out.println("Dati denumire");
        this.denumire=sc.nextLine();
        System.out.println("Dati locatie");
        this.locatie=sc.nextLine();
}

    public void detaliiSucursala() {
    
        System.out.println("Id sucursala: "+this.idSucursala);
        System.out.println("Denumire: "+ this.denumire);
        System.out.println("Locatie: "+this.locatie);
}
    
    public void afisareAngajati() {
        for (Angajat j:set_angajati) {
            j.detaliiAngajat();
        }
    }
    
    public void afisareClienti() {
        for (int j=0; j<vector_clienti.size() ; j++) {
            this.vector_clienti.get(j).detaliiClient();
        }
    }
        
    public void adaugareAngajat(Angajat c) {
        if(set_angajati.size()>=NR_MAX_ANGAJATI)
        {
            System.out.println("Ati depasit nr maxim de angajati");
            return;
        }
        c.setIdSucursala(this.getIdSucursala());   
        this.set_angajati.add(c);
        
    }
    
     public void adaugareClient(Client c) {
        if(vector_clienti.size()>=NR_MAX_CLIENTI)
        {
            System.out.println("Ati depasit nr maxim de clienti");
            return;
        }
        c.setIdSucursala(this.getIdSucursala());     
        this.vector_clienti.add(c);
        
    }
       
    
    public Client getClient(int i) {
         
         if(i>=NR_MAX_CLIENTI || i<0)
        {
            System.out.println("Nr clientului depaseste limitele");
            //return; generam o exceptie
        }
        return this.vector_clienti.get(i-1);
        
    }
    
    public void afisareTot(){
        System.out.println("Sucursala ");
        this.detaliiSucursala();
        for (Angajat j:set_angajati) {
            j.afisareTot();
        }
        
        for (int j=0; j<vector_clienti.size(); j++) {
            this.vector_clienti.get(j).afisareTot();
        }
    }

    public Vector<Client> getVector_clienti() {
        return vector_clienti;
    }
     
    
    
    
}
