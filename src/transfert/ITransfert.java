package transfert;

import java.util.List;

public interface ITransfert {
    public Transfert saisie ();
    public void affichage (Transfert t);
    public List<Transfert> saisieListe();
    public void affichageList (List<Transfert> transferts);
}
