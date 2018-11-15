public class Proceso {
    private Accion accion;
    private double tiempoAccion;

    private double tiempoInicial; //tiempo de inicio
    private double tiempoEjecucion; //tiempo total de ejecucion
    private double numEjecucion; //veces que entra al cpu
    private double tiempoES; //tiempo que pasa en el dispositivo de e/s
    private int numES; //numero de veces que usa e/s

    public Proceso(double tiempoInicial)
    {
        this.tiempoInicial = tiempoInicial;

        this.tiempoEjecucion = 0;
        this.numEjecucion = 0;

        this.tiempoES = 0;
        this.numES = 0;
    }

    public void setTiempoEjecucion(double time)
    {
        this.tiempoEjecucion += time;
        this.numEjecucion++;
    }

    public double getTiempoEjecucion()
    {
        return this.tiempoEjecucion;
    }

    public double getTiempoPromedioEjecucion(){
        if (this.numEjecucion == 0) {
            throw new IllegalArgumentException("El numero de veces que entro a ES es cero");
        }
        else{
            return this.tiempoEjecucion / this.numEjecucion;
        }
    }

    public double getTiempoInicial()
    {
        return this.tiempoInicial;
    }

    public void setTiempoES(double tEs){
        this.tiempoES += tEs;
        this.numES++;
    }

    public double getTiempoPromedioES(){
        if (this.numES == 0) {
            throw new IllegalArgumentException("El numero de veces que entro a ES es cero");
        }
        else{
            return this.tiempoES / this.numES;
        }
    }

    public double promedioEnColas(){
        return this.tiempoEjecucion - (this.getTiempoPromedioES() + this.getTiempoPromedioEjecucion());
    }

    public double coeficienteEficiencia(){
        if (this.getTiempoEjecucion() == 0) {
            throw new IllegalArgumentException("El tiempo de ejecucion es cero");
        }
        else{
            return this.promedioEnColas() / this.getTiempoEjecucion();
        }
    }

    public void setAccion(Accion accion)
    {
        this.accion = accion;
    }

    public Accion getAccion()
    {
        return this.accion;
    }

    public void setTiempoAccion(double tiempoAccion)
    {
        this.tiempoAccion = tiempoAccion;
    }

    public double getTiempoAccion()
    {
        return this.tiempoAccion;
    }
}
