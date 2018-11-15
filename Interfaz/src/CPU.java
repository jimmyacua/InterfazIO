import java.util.LinkedList;

public class CPU {
    private Proceso procesoAtendido;
    private LinkedList<Proceso> procesos;

    public CPU()
    {
        this.procesoAtendido = null;
        this.procesos = new LinkedList<>();
    }

    public void addProceso(Proceso proceso)
    {
        this.procesos.add(proceso);
    }

    public double atenderLista(double tiempoActual,double timepoMaximo)
    {
        if(this.procesoAtendido == null&& this.procesos.size()>0)
        {
            //se debe agruegar que tanto tardara, que hara despues
            this.procesoAtendido = this.procesos.pop();
            return tiempoActual + procesoAtendido.getTiempoAccion();
        }else
        {
            return timepoMaximo+4654600;
        }
    }

    public Proceso finalizarCuamtum()
    {
        Proceso temp = procesoAtendido;
        this.procesoAtendido = null;
        return temp;
    }
}
