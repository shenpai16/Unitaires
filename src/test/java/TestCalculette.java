import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculette {
    @BeforeEach
    public void methodeAppeleeAvantChaqueTest() {

    }
    @AfterEach
    public void methodeAppeleeApresChaqueTest() {

    }
    @BeforeAll
    public static void methodeAppeleeAvantTousLesTests() {

    }
    @AfterAll
    public static void methodeAppeleeApresTousLesTests() {

    }
    @Test
    public void unTest() {


    }
    @Test
    public void TestMul() {
        Calculette test = new Calculette();
        double a = 1;
        double b = 0;
        double expecter = 0;
        double resultat = test.multiplier(a, b);
        assertEquals(expecter, resultat);
    }

    @Test
    public void TestDiv(){
        Calculette test = new Calculette();
        double a = 1;
        double b = 1;
        double expecter = 1;
        double resultat = test.diviser(a, b);
        assertEquals(expecter, resultat);
    }

    @Test
    public void TestListeOperations(){
        Compte unCompte = new Compte();

        ArrayList<Operations> resultat = unCompte.validerCompte();
        assertEquals(resultat, null);
    }
}