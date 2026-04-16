package ar.edu.unahur.obj2.w2j.contenidos;

public class IDRA {
    private static IDRA instance = new IDRA();
    private Double valor = 0.5;
    private IDRA(){
    }
    public static void setInstance(IDRA instance) {
        IDRA.instance = instance;
    }
    public static IDRA getInstance(){
        return instance;
    }
    public Double getValor(){
        return valor;
    }
    public void setValor(Double nuevoValor){
        valor = nuevoValor;
    }
}
