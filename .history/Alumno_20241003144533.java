public class Alumno {
    private String matricula;
    private String nombre;
    private double Estructuras;
    private double Ingles;
    private double Iot;
    private double Promedio;

    // constructor
    public Alumno(String m, String n){
        this.matricula = m;
        this.nombre = n;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getIot() {
        return iot;
    }

    public void setIot(double iot) {
        this.iot = iot;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = (this.estructuras + this.ingles + this.iot)/3;
    }

    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }

    

}