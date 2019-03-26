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
public class Rata implements ServiciiRata{
    
    private int idRata;
    private String  luna;
    private int suma;
    private String status; //platit sau neplatit pe luna respectiva
    private long idCredit;

    public Rata() {
    }

    public Rata(int idRata, String  luna, int suma, String  status, long idCredit) {
        this.idRata = idRata;
        this.luna = luna;
        this.suma = suma;
        this.status = status;
        this.idCredit = idCredit;
    }

    public int getIdRata() {
        return idRata;
    }

    public void setIdRata(int idRata) {
        this.idRata = idRata;
    }

    public String  getLuna() {
        return luna;
    }

    public void setLuna(String  luna) {
        this.luna = luna;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String  getStatus() {
        return status;
    }

    public void setStatus(String  status) {
        this.status = status;
    }

    public long getIdCredit() {
        return idCredit;
    }

    public void setIdCredit(long idCredit) {
        this.idCredit = idCredit;
    }
    
    public void citesteRata() {
    Scanner sc=new Scanner(System.in);

        System.out.println("Dati id rata");
        this.idRata=sc.nextInt();
        sc.nextLine();
        System.out.println("Dati Luna");
        this.luna=sc.nextLine();
        System.out.println("Dati suma");
        this.suma=sc.nextInt();
        sc.nextLine();
        System.out.println("Dati status");
        this.status=sc.nextLine();
        
}

public void detaliiRata() {
    
        System.out.println("Id rata:"+this.idRata);
        System.out.println("Luna: "+this.luna);
        System.out.println("Suma: "+this.suma);
        System.out.println("Status: "+this.status);
}
    
    public void afisareTot(){
        System.out.println("Rata ");
        this.detaliiRata();
        
    }
    
}
