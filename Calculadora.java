import java.util.Scanner;

public class Calculadora {


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    }
    // operaciones

    public static float dividir(int dividendo, int divisor){
        if (divisor == 0) {
            canDivide(dividendo, divisor);
        }

        return (float) dividendo / (float) divisor;
    }
    public static int multiplicar(int... num){
        return 0;
    }

    public static int sumar(int... num){
        int sum = 0; for (int i: num){ sum += i;}
        return sum;
    }

    public static int restar(int... num) {
        if (num.length == 0) return 0;

        int index = 1;
        int resta = num[0];

        while (index < num.length) {
            if (canSubtract(resta, num[index])) resta = num[index] - resta;
            else resta -= num[index];

            index++;
        }
        return resta;
    }

    //avisos

    public static void alerts(String section, String key, int p1, int p2) {
        switch (section) {
            case "error" -> errors(key, p1, p2);
            case  "alert" -> alertas(key, p1, p2);
            case "ok" -> arrayAlerts(key);
        }
    }

    private static void alertas(String key, int p1, int p2) {
        switch (key){
            case "mult0" -> System.out.printf("cuidado! vas a multiplicar por 0! quieres que sea un 1?");
        }
    }

    private static void errors(String key, int p1, int p2) {
        switch (key){
            case "canRsubtract" -> System.out.printf("Estas restando un numero mas grande! y quizas te equivocaste!" +
                    "\n quieres cambiar la orientacion de la operacion?\nx-y -> y-x || %d - %d -> %d - %d" +
                    "\ns:si - other:no", p2, p1, p1, p2);
            case "canDivideZero" -> System.out.printf("para un momento! estas dividiendo entre 0!" +
                    "\n ====> %d / 0\nsi de acasualidad querias dividir por otra cosa cambiala ahora! ", p1);
        }
    }

    public static void arrayAlerts(String key) {
        switch (key) {
            case "empty" -> System.out.println("Array vacío");
            case "size" -> System.out.println("Tamaño incorrecto");
        }
    }

    //condiciones
    public static boolean canSubtract(int num, int resta){
        if (resta > num) {
            alerts("math", "canRsubtract", resta, num);
            return inputOption();
        }

        return false;
    }

    public static int canDivide(int dividendo, int divisor){
        alerts("math", "canDivideZero", dividendo, divisor);
        return newIntegrer();
    }
    // aviso del 0 ------ ACTUAR ----
    public static int mult0(int mult){
        alerts();
    }
    // entrada

    public static boolean inputOption(){
      return scanner.nextLine().toUpperCase().charAt(0) == 'S';
    };

    public static int newIntegrer(){
        return Integer.parseInt(formatingInput(scanner.nextLine()).replaceAll("[^0-9]", ""));
    }

    // formato
    public static int[] nums(String input){
        int i = 0;
        int[] numArray = new int[formatingNumbers(input).length];
        for (String d : formatingNumbers(input)) {
            numArray[i++] = Integer.parseInt(d);
        }
        return numArray;
    }

    public static char signo(String input){
        return formatingInput(input).replaceAll("^[+\\-*/^]", "").charAt(0);
    }

    public static String[] formatingNumbers(String input){
        return formatingInput(input).split("[^0-9]+");
    }

    public static String formatingInput(String input){
        return input.replace(" ", "").replace("\n", "");
    }
}
