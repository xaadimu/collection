package transfert;

import javax.xml.crypto.Data;
import java.util.Date;

public class Transfert {
    private int id;
    private String lib;
    private double montant;
    private Data date;

    public Transfert() {
    }

    public Transfert(int id, String lib, double montant, Data date) {
        this.id = id;
        this.lib = lib;
        this.montant = montant;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Date date) {
        //this.date = date;
    }
}
