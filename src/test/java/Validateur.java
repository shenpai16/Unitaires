import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class Validateur {
    /**
     * Test of calculeLongueur method, of class Validateur.
     */
    @Test
    public void testCalculeLongueur()
    {
        System.out.println("Test de calculeLongueur");
        String motDePasse = "raphae132";
        Main instance = new Main();
        int expResult = 9;
        int result = instance.calculeLongueur(motDePasse);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testValideMdp(){
        System.out.println("test de mots de passe invalides");

        // 1er test
        // le mot de passe n'a que 5 caractères de long, donc il n'est pas valide
        String motDePasse = "raphaazeazeazeaze23";
        Main instance = new Main();
        boolean expResult = true; // la méthode retournera false
        boolean result = instance.valideMdp(motDePasse);
        assertEquals(expResult, result);
    }

    @Test
    public void testValideMotDePasseInvalides() {
        System.out.println("test de mots de passe invalides");

        // 1er test
        // le mot de passe n'a que 5 caractères de long, donc il n'est pas valide
        String motDePasse = "raphaazeazeazeaze12";
        Main instance = new Main();
        boolean expResult = false; // la méthode retournera false
        boolean result = instance.valideMdp(motDePasse);
        assertEquals(expResult, result);
        // 2ème test
        // le mot de passe n'a que 7 caractères de long, donc il n'est pas valide
        motDePasse = "aerkoapzerokpazokerpazoekr123";
        expResult = false; // la méthode retournera false
        result = instance.valideMdp(motDePasse);

        assertEquals(expResult, result);
    }






}
