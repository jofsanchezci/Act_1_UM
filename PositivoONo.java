import java.util.Scanner;

public class PositivoONo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();
        
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero == 0) {
            System.out.println("El número es cero.");
        } else {
            System.out.println("El número es negativo.");
        }
        
        scanner.close();
    }
}





