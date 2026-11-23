package Funciones.Package;

import java.util.Scanner;

public class ReInput {

    private Scanner scanner;

    public ReInput(){
        this.scanner = new Scanner(System.in);
    }

    public String input(){
        return scanner.nextLine();
    }

    public int integrer(){
        return scanner.nextInt();
    }
}
