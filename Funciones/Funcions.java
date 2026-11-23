package Funciones;

import Funciones.Package.Dd;
import Funciones.Package.ReInput;

import java.util.Scanner;

public class Funcions {
    private Dd ddvar;
    private ReInput input;
    private boolean fin;

    public Funcions(Scanner scanner, int dd){
        this.input = new ReInput();
        this.ddvar = new Dd(dd);
        this.fin = false;
    }

    public int funcion1(int hola){
        System.out.println("hola");
        ddvar.dd();
        return  1;
    }
}
