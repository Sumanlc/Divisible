public class Divisible3 {
    public static boolean esDivisiblePorTres(int n) {
        String numeroConcatenado = concatenarNumeros(n);
        int sumaDigitos = calcularSumaDigitos(numeroConcatenado);
        return sumaDigitos % 3 == 0;
    }

    private static String concatenarNumeros(int n) {
        StringBuilder numeroConcatenado = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            numeroConcatenado.append(i);
        }
        return numeroConcatenado.toString();
    }

    private static int calcularSumaDigitos(String numero) {
        int suma = 0;
        for (int i = 0; i < numero.length(); i++) {
            suma += Character.getNumericValue(numero.charAt(i));
        }
        return suma;
    }
}
