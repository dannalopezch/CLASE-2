import java.util.Scanner;
public class EntradaDatos {
    public static void main(String[] args) {
        Scanner SC1 = new Scanner(System.in);
        Scanner SC2 = new Scanner(System.in);
        Scanner SC3 = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int Enteros = SC1.nextInt();
        System.out.println("Ingrese un numero flotante o decimal: ");
        double Decimales = SC2.nextDouble();
        System.out.println("Ingrese una cadena de texto: ");
        String Textos = SC3.nextLine();
        System.out.println("El numero entero que ha ingresado es: " + Enteros);
        System.out.println("El numero Decimal que ha ingresado es: " + Decimales);
        System.out.println("La cadena de texto que ha ingresado es: " + Textos);
        SC1.close();
        SC2.close();
        SC3.close();
    }
}
