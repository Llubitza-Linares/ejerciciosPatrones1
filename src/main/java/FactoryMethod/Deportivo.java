package FactoryMethod;

public class Deportivo {
    private String talla;
    private String color;
    private String prendas;

    public Deportivo(String talla, String color, String prendas) {
        this.talla = talla;
        this.color = color;
        this.prendas = prendas;
    }

    public void getDeportivo() {
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
        System.out.println("Prendas: " + prendas);
    }
}
