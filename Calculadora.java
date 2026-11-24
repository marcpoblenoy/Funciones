import java.util.Arrays;
import java.util.Scanner;

public class Calculadora {


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(Arrays.toString(signo(scanner.nextLine())));
    }
    // operaciones
    public static int restar(int num, int resta){
        return  0;
    }
    public static int sumar(int... num){
        int sum = 0; for (int i: num){ sum += i;}
        return sum;
    }

    //condiciones
    public static boolean canRsubtract(int num, int resta){
        if (resta > num){
            alerts("canRsubtract");

        }
        return true;
    }

    //avisos

    public static void alerts(String key){
        switch (key){
            case "canRsubtract" -> System.out.println("Cuidado! estas restando un numero mayor!\nquieres cambiar los numeros o seguir?\nS:cambiar numeros|another key: seguir");
        }
    }

    // entradas

    // separacion de los operadores
    public static String[] formatCalc(String input){
        return input.split("[+\\-*/]");
    }

    //el operador
    public static String[] signo(String input){
        return input.replaceAll();
    }

    public static String formatingInput(String input){
        return input.replace(" ", "")
                .replace("\n", "");
    }

}
