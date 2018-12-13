import static org.junit.Assert.*;

public class RegnerTest {

    @org.junit.Test
    public void test() {
        double Højden = 5.0;
        double Grundfladen = 10.0;
        double sum =(1.0/3.0*Højden*Grundfladen); //Kalder metoden sum som hører til klassen Regner
        assertEquals(16.666666666664, sum, 0.0000001);

    }
    @org.junit.Test
    public void test2() {
        double Højden = 5.1;
        double Grundfladen = 10.0;
        double sum =(1.0/3.0*Højden*Grundfladen); //Kalder metoden sum som hører til klassen Regner
        assertEquals(16.666666666664, sum, 0.0000001);

    }
}