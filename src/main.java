import Metodos.*;

/**
 *
 * @author pablo
 */
public class main {
    public static void main(String[] args) {
        miniCalculadoraEjemplo calculadora = new miniCalculadoraEjemplo();
        
        System.out.println("Valor absoluto de un número double: " + calculadora.valorAbsoluto(-33.33));
        System.out.println("Raíz cuadrada de un número double: " + calculadora.raizCuadrada(4.));
    }
}
