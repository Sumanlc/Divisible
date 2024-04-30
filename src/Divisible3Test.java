import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {
    @Test
    public void test1() {
        int entrada = 2;

        boolean resultado = Divisible3.esDivisiblePorTres(entrada);

        assertTrue(resultado);
    }
    @Test
    public void test2() {
        int entrada = 6;

        boolean resultado = Divisible3.esDivisiblePorTres(entrada);

        assertTrue(resultado);
    }



}