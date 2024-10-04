import java.util.Scanner;
public class EjercicioIF {
    public static void main(String[] args) {
        Scanner SC1 = new Scanner(System.in);
        System.out.println("Por favor ingrese su edad: ");
        int edad = SC1.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad...");
        }
        else{
            System.out.println("Usted es menor de edad...");
        }
        SC1.close();
    }
}
