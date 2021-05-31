package ejBuilder;

public class Cliente {

    public static void main(String[] args) {

        Dueno llubi = new Dueno();
        Lomito lomito = new Lomito();
        Tira tira = new Tira();
        Bife bife = new Bife();

        System.out.println("----------------------");
        llubi.setBuilderPlato(bife);
        llubi.prepararPlato();
        llubi.getPlato().mostrarInfo();
        System.out.println("----------------------");
        llubi.setBuilderPlato(tira);
        llubi.prepararPlato();
        llubi.getPlato().mostrarInfo();
        System.out.println("----------------------");
        llubi.setBuilderPlato(lomito);
        llubi.prepararPlato();
        llubi.getPlato().mostrarInfo();


    }

}
