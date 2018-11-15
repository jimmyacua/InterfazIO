import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Pair;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

public class Simulador {
    private CPU cpu;
    private double reloj;
    private double cuantum;
    private double tiempoMeta;


    private double eventoLlegaProceso;
    private double eventoSaleProcesoCPU;
    private double eventoSaleProcesoES;


    private double tiempoEnSistemaProcesos;
    private double procesosFinalizados;
    private double tiempoAtencionProcesos;

    private boolean servidorOcupado;
    private double tamCola;

    // para saber que es lo que sigue, deberian ser como tiempos asociados
    // a un proceso o algo asi
    private LinkedList<Proceso> eventos;

    Pair<Double, Proceso> eventosCola;

    Queue<Proceso> cola = new LinkedList<>(); //cola de eventos

    public Simulador(double cuantum1, double tiempoMeta1)
    {
        this.cuantum = cuantum1;
        this.tiempoMeta = tiempoMeta1; // duracion total de la simulacion

        this.eventoSaleProcesoCPU = tiempoMeta;
        this.eventoSaleProcesoES = tiempoMeta;

        //Generar
        this.eventoLlegaProceso = 5;
        this.tamCola = 0;

        eventosCola = new Pair<Double, Proceso>(null, null); //no se si dara error con esos null
    }

    public void Simular()
    {
        final String titulo = "Simulador IO";

        Frame primero = new Frame(titulo);
        Panel panel = new Panel();
        panel.setLayout(new GridLayout());
        primero.add(panel);

        primero.setSize(600,400);

        Label quantum = new Label("Quantum:");
        panel.add(quantum, new GridLayout());

        Label duracion = new Label("Duracion total:");
        panel.add(duracion);

        TextField quantumTextField = new TextField();
        panel.add(quantumTextField);

        TextField duracionTextField = new TextField();
        panel.add(duracionTextField);

        Button sigBtn = new Button("Continuar");
        panel.add(sigBtn);

        primero.setVisible(true);

        /*
        Frame f = new Frame(titulo);


        Label l1;
        l1 = new Label("CONTADOR");
        l1.setBounds(50,100, 100,30);

        f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        */

        for(int x=0; x<10; x++)
        {
            //l1.setText(x + "\n segundos");
            try {
                Thread.sleep(500);
            }
            catch (Exception e)
            {

            }
        }
        //f.dispose();
        primero.dispose();
    }

    private void saleProcesoCPU() {

        this.reloj = eventoSaleProcesoCPU;
        Proceso proceso = this.cpu.finalizarCuamtum();
        switch (proceso.getAccion())
        {
            case salirSistema:
            {
                this.tiempoEnSistemaProcesos += reloj-proceso.getTiempoInicial();
                procesosFinalizados++;
            }
            case irDispositivoES:
            {

                eventoSaleProcesoES=2;
            }
            case seguirEjecutando:
            {
                cpu.addProceso(proceso);

            }
        }
        eventoSaleProcesoCPU = cpu.atenderLista(reloj,tiempoMeta);
    }

    public boolean finalizar(double tActual){
        boolean fin = false;

        if(this.tiempoMeta <= tActual){
            fin = true;
        }

        return fin;
    }

    public double genTiempoServicio(Proceso p){
        Random rand = new Random();
        double interrupcion = 0 + (100 - 0) * rand.nextDouble();
        System.out.println(interrupcion);

        if(interrupcion < 30){ //ocurre una interrupcion
            double accion = 0 + (100 - 0) * rand.nextDouble();

            if(accion < 80){ // uso E/S

            }
            else{ //finalizar programa
                p = null;
            }
        }
        else{

        }
        return 0.0;
    }

    public void llegaProceso(Proceso p, double time){
        this.reloj = time;
        if(this.servidorOcupado){
            this.tamCola++;
            cola.add(p);
        }
        else{
            this.servidorOcupado = true;
            double ts = this.genTiempoServicio(p);
            p.setTiempoEjecucion(ts);
            this.eventoSaleProcesoCPU = time + ts;
        }
    }

    public void saleProcesoES(){

    }
}