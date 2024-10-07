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
        return Estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.Estructuras = estructuras;
    }

    public double getIngles() {
        return Ingles;
    }

    public void setIngles(double ingles) {
        this.Ingles = ingles;
    }

    public double getIot() {
        return Iot;
    }

    public void setIot(double iot) {
        this.Iot = iot;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio() {
        this.Promedio = (this.Estructuras + this.Ingles + this.Iot)/3;
    }

    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + Promedio + "]";
    }

    

}