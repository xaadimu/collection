package transfert;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TransfertImp implements ITransfert{
    Scanner scan = new Scanner(System.in);
    Date date = new Date();
    //Date date = null;
    @Override
    public Transfert saisie() {
        Transfert t = new Transfert();
        System.out.println("Saisir l'id");
        t.setId(Integer.parseInt(scan.nextLine()));
        System.out.println("Saisir le Libelle");
        t.setLib(scan.nextLine());
        System.out.println("Saisir le Montant");
        t.setMontant(Double.parseDouble(scan.nextLine()));
        System.out.println("Saisir l'id");
       System.out.println("Saisir la date");
        try {
            SimpleDateFormat d = new SimpleDateFormat("DD/MM/YYYY");
            date = d.parse(scan.nextLine());
            t.setDate(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public void affichage(Transfert t) {
        System.out.println("ID : "+t.getId());
        System.out.println("LIBELLE : "+t.getLib());
        System.out.println("MONTANT : "+t.getMontant());
        System.out.println("DATE : "+t.getDate());
    }

    @Override
    public List<Transfert> saisieListe() {
        List<Transfert> liste = new ArrayList<Transfert>();
        String rep = null;
        do {
            liste.add(saisie());
            System.out.println("Voulez vous continuer? [oui/non]");
            rep = scan.nextLine();
        }while (rep.equalsIgnoreCase("oui"));
        return liste;
    }

    @Override
    public void affichageList(List<Transfert> transferts) {
        for (Transfert t: transferts){
            affichage(t);
        }

    }
}
