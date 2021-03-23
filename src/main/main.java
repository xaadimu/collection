package main;

import transfert.ITransfert;
import transfert.Transfert;
import transfert.TransfertImp;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ITransfert t1 = new TransfertImp();
        ArrayList<Transfert> t2 = (ArrayList<Transfert>) t1.saisieListe();
        t1.affichageList((List<Transfert>) t2);
    }
}
