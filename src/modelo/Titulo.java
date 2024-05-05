package modelo;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDuracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDuracionEnMinutos() {
        return tiempoDuracionEnMinutos;
    }

    public void setTiempoDuracionEnMinutos(int tiempoDuracionEnMinutos) {
        this.tiempoDuracionEnMinutos = tiempoDuracionEnMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println(" ***** FICHA TÉCNICA ***** ");
        System.out.println("Nombre de la pélicula: "+ nombre);
        System.out.println("Fecha de lanzamiento: "+ fechaDeLanzamiento);
        System.out.println("Tiempo de duración: "+ getTiempoDuracionEnMinutos()+ " minutos.");
        System.out.println("Estrellas: "+ evaluacion);
        System.out.println("¿Está incluido en el Plan Básico? "+ incluidoEnElPlanBasico);
        System.out.println("Sinopsis: "+ sinopsis);

    }
}
