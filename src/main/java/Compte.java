import jdk.dynalink.Operation;

import java.util.ArrayList;

public class Compte {

    private ArrayList<Operations> listeOperations = new ArrayList<Operations>();

    public void Compte(){
        this.listeOperations = new ArrayList<>();
    }

    public ArrayList<Operations> getListeOperations() {
        return listeOperations;
    }

    public ArrayList<Operations> validerCompte(){
        if(listeOperations.isEmpty()){
            return null;
        }else {
            return listeOperations;
        }
    }


}
