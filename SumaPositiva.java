import java.util.Scanner;

public class SumaPositiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        
        System.out.println("La suma es: " + suma);
        
        if (suma > 0) {
            System.out.println("La suma es positiva.");
        } else if (suma == 0) {
            System.out.println("La suma es cero.");
        } else {
            System.out.println("La suma es negativa.");
        }
        
        scanner.close();
    }
}
