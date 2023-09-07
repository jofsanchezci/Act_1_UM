import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        
        // Verificar si el segundo número es cero antes de realizar la división
        double division = 0;
        if (numero2 != 0) {
            division = numero1 / numero2;
        }
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        if (numero2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede realizar la división, ya que el segundo número es cero.");
        }
        
        scanner.close();
    }
}
