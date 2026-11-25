import java.util.Scanner;

public class Calculadora {

    /*
    PROBLEMA1. Calculadora modular bàsica
    Crea una calculadora capaç de realitzar les funcions bàsiques: sumar, restar,
    multiplicar i dividir. Què cal fer?
         Crear un menú principal
         Cada opció crida una funció diferent
         Gestionar divisió per zero
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(dividir(1, 0));
    }
    public static int newIntegrer(){
        System.out.println("introduzca un nuevo nombre: ");
        return Integer.parseInt(scanner.nextLine().replaceAll("[^0-9]", ""));
    }
    public static boolean canDivide(int b){
        if (b == 0){
            System.out.println("no se puede dividir entre 0");
            return false;
        }
        return true;
    }
    public int sumar(int a, int b){
        return  a + b;
    }

    public static int restar(int a, int b){
        return a - b;
    }

    public static float dividir(float a, float b){
        if (canDivide((int) b)) return a / b;
        else b = newIntegrer();
        return dividir(a, b);
    }


}
