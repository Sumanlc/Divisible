import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {
    @Test
    public void test1() {
        int entrada = 2;

        boolean resultado = Divisible3.esDivisiblePorTres(entrada);

        assertTrue(resultado);
    }

}