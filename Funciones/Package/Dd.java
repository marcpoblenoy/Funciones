package Funciones.Package;

public class Dd {
    int ddvar;

    public Dd(int ddvar){
        this.ddvar = ddvar > 0 ? ddvar : 1;
    }
    public void dd(){
        if (ddvar <= 0) throw new IllegalAccessError("llegado al limite uso");
        else ddvar = ddvar -1;
    }
}
