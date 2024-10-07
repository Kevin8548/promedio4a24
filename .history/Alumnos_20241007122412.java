public class Alumnos {
    private String matricula;
    private String nombre;
    private double estructura;
    private double ingles;
    private double iot;
    private double promedio;

    public Alumnos(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public void setEstructura(double estructura) {
        this.estructura = estructura;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public void setIot(double iot) {
        this.iot = iot;
    }

    public void setPromedio() {
        this.promedio = (estructura + ingles + iot) / 3;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\nNombre: " + nombre + "\nPromedio: " + promedio;
    }
}
