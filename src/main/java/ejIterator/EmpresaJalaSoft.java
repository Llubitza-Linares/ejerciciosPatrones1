package ejIterator;

public class EmpresaJalaSoft implements IEmpresa {

    private Empleado [] empleados;
    private int position;

    public EmpresaJalaSoft(){
        position=0;
        empleados= new Empleado[3];
    }
    public void add(Empleado value){
        empleados[position]=value;
        position++;
    }

    @Override
    public IteratorJalaSoft iterator() {
        return new IteratorJalaSoft(this.empleados);
    }

}
