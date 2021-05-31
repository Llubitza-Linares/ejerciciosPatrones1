package FactoryMethod;

public class Cuaderno {
    private String tipo;
    private String hojas;

    public Cuaderno(String tipo, String hojas) {
        this.tipo = tipo;
        this.hojas = hojas;
    }

    public void getCuaderno() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Hojas: " + hojas);
    }

}
