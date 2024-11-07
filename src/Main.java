import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        boolean continua;
        do {
            try {
                continua = false;
                System.out.println("Ingresa un valor entero: ");
                num = teclado.nextInt();
                int cuadrado = num + num;
                System.out.println("El cuadrado de: " + num + " es " + cuadrado);
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar obligatoriamente un número entero");
                teclado.next();
                continua = true;
            }

        } while (continua);
    }
}
