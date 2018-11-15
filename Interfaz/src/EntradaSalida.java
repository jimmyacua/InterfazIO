import java.util.LinkedList;
import java.util.Queue;

public class EntradaSalida {

    Queue<Proceso> cola;

    public EntradaSalida(){
        this.cola = new LinkedList<>(); //cola de eventos
    }
}
