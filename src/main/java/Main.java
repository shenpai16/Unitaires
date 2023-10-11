import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

        public Main(){

        }
        public int calculeLongueur(String mdp){
            return mdp.length();
        }


        public boolean valideMdp(String motDePasse){
            int longueur = calculeLongueur(motDePasse);
            ArrayList<Integer> nombre = new ArrayList<Integer>();
            nombre.add(0);
            nombre.add(1);
            nombre.add(2);
            nombre.add(3);
            nombre.add(4);
            nombre.add(5);
            nombre.add(6);
            nombre.add(7);
            nombre.add(8);
            nombre.add(9);

            int nbChiffre = 0;

            for (int i = 0; i < longueur; i++){
                if(Character.isDigit(motDePasse.charAt(i))){
                    nbChiffre = nbChiffre +1;

                }
            }

            if (longueur >= 8 && nbChiffre >=2){
                return true;
            }else {
                return false;
        }
        }



}
