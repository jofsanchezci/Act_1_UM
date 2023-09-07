import java.util.Scanner;

public class CalculadoraIVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();
        
        // Calcular el IVA (19%)
        double iva = valorCompra * 0.19;
        
        // Calcular el monto total con el IVA
        double montoTotal = valorCompra + iva;
        
        System.out.println("Compra sin IVA: $" + valorCompra);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Monto con IVA: $" + montoTotal);
        
        scanner.close();
    }
}
