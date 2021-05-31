package ejAbstractFactory;

public class Estudiante {
    private String nombre;
    private String grado;
    private String promedio;

    public Estudiante(){}
    public Estudiante (String nombre, String grado, String promedio){
        this.nombre=nombre;
        this.grado=grado;
        this.promedio=promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public void show(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
